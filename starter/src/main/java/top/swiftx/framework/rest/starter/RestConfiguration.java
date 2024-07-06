package top.swiftx.framework.rest.starter;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Slf4j
@AutoConfiguration
@RequiredArgsConstructor
@EnableConfigurationProperties(RestProperties.class)
@ComponentScan("top.swiftx.framework.rest.starter")
@ConditionalOnProperty(
        name = "swiftx.rest.enabled",
        matchIfMissing = true
)
public class RestConfiguration implements WebMvcConfigurer {
    private final ApplicationContext context;
    private final RestProperties properties;

    /**
     * 注册拦截器
     *
     * @param registry 注册器
     */
    @Override
    public void addInterceptors(@NonNull InterceptorRegistry registry) {
        Map<String, Object> beans = context
                .getBeansWithAnnotation(Interceptor.class);
        var list = new ArrayList<InterceptorRegister>();

        // 查找拦截器
        for (Object bean : beans.values()) {
            if (!(bean instanceof HandlerInterceptor)) {
                continue;
            }
            Interceptor interceptor = bean
                    .getClass()
                    .getAnnotation(Interceptor.class);
            if (interceptor == null) {
                continue;
            }
            list.add(new InterceptorRegister(
                    interceptor.order(),
                    interceptor.value(),
                    (HandlerInterceptor) bean
            ));
        }

        // 状态拦截器
        list.stream().sorted(
                Comparator.comparing(InterceptorRegister::getOrder)
        ).forEachOrdered(item -> {
            var handler = item.getHandler();
            log.info("load interceptor: " + handler.getClass());
            registry.addInterceptor(item.getHandler())
                    .addPathPatterns(item.getPath());
        });
    }

    /**
     * 注册自定义注解
     *
     * @param resolvers 解析器
     */
    @Override
    public void addArgumentResolvers(
            @NonNull List<HandlerMethodArgumentResolver> resolvers
    ) {
        Map<String, Object> beans = context
                .getBeansWithAnnotation(Resolver.class);
        for (Object bean : beans.values()) {
            if (!(bean instanceof HandlerMethodArgumentResolver)) {
                continue;
            }
            Resolver resolver = bean
                    .getClass()
                    .getAnnotation(Resolver.class);
            if (resolver == null) {
                continue;
            }
            resolvers.add((HandlerMethodArgumentResolver) bean);
            log.info("load resolver:" + bean.getClass());
        }
    }

    /**
     * CORS全局设置
     *
     * @param registry 注册器
     */
    @Override
    public void addCorsMappings(@NonNull CorsRegistry registry) {
        if (properties.getCors() == null) return;
        for (var item : properties.getCors().entrySet()) {
            var key = item.getKey();
            var value = item.getValue();
            if (!value.isEnabled()) continue;
            registry.addMapping(key)
                    .allowedMethods(value.getAllowedMethods())
                    .allowedOrigins(value.getAllowedOrigins())
                    .allowedHeaders(value.getAllowedHeaders());
        }
    }
}
