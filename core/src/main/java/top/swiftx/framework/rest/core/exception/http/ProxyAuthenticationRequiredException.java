package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 客户端错误状态响应代码指示该请求尚未应用，<br/>
 * 因为它缺少浏览器和可访问所请求资源的服务器之间的代理服务器的有效认证凭证。
 *
 * @author 胡永强
 */
public class ProxyAuthenticationRequiredException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public ProxyAuthenticationRequiredException() {
        super(HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public ProxyAuthenticationRequiredException(String type, String title) {
        super(HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public ProxyAuthenticationRequiredException(@Nullable Throwable cause) {
        super(HttpStatus.PROXY_AUTHENTICATION_REQUIRED, cause);
    }

    /**
     * 默认异常
     */
    public ProxyAuthenticationRequiredException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.PROXY_AUTHENTICATION_REQUIRED, body, cause);
    }
}
