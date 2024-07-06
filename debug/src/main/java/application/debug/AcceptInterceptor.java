package application.debug;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import top.swiftx.framework.rest.starter.Interceptor;

/**
 * @author 胡永强
 */
@Slf4j
@Component
@Interceptor(order = 1)
@RequiredArgsConstructor
public class AcceptInterceptor implements HandlerInterceptor {
}
