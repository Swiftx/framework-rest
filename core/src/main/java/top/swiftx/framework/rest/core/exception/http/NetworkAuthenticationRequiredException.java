package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 必须提供网络鉴权
 *
 * @author 胡永强
 */
public class NetworkAuthenticationRequiredException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public NetworkAuthenticationRequiredException() {
        super(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public NetworkAuthenticationRequiredException(String type, String title) {
        super(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public NetworkAuthenticationRequiredException(@Nullable Throwable cause) {
        super(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED, cause);
    }

    /**
     * 默认异常
     */
    public NetworkAuthenticationRequiredException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED, body, cause);
    }
}
