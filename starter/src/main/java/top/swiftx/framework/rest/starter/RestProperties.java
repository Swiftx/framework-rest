package top.swiftx.framework.rest.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@Data
@ConfigurationProperties(prefix = "swiftx.rest")
public class RestProperties {
    /**
     * 是否启用
     */
    private boolean enabled = true;

    /**
     * CORS配置
     * 举例
     */
    private Map<String, CORS> cors;

    @Data
    public static class CORS {
        /**
         * 是否启用
         */
        private boolean enabled = true;

        /**
         * 允许的方法
         */
        private String allowedMethods = "*";

        /**
         * 允许的来源
         */
        private String allowedOrigins = "*";

        /**
         * 允许的请求头
         */
        private String allowedHeaders = "*";
    }
}
