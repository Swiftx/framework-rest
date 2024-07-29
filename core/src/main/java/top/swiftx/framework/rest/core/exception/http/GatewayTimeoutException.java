package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 网关超时
 *
 * @author 胡永强
 */
public class GatewayTimeoutException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public GatewayTimeoutException() {
        super(HttpStatus.GATEWAY_TIMEOUT);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public GatewayTimeoutException(String type, String title) {
        super(HttpStatus.GATEWAY_TIMEOUT);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public GatewayTimeoutException(@Nullable Throwable cause) {
        super(HttpStatus.GATEWAY_TIMEOUT, cause);
    }

    /**
     * 默认异常
     */
    public GatewayTimeoutException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.GATEWAY_TIMEOUT, body, cause);
    }
}
