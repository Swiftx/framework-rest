package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 网关异常<br/>
 *
 * @author 胡永强
 */
public class BadGatewayException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public BadGatewayException() {
        super(HttpStatus.BAD_GATEWAY);
    }

    /**
     * 标准构造
     *
     * @param type  类型
     * @param title 标题
     */
    public BadGatewayException(String type, String title) {
        super(HttpStatus.BAD_GATEWAY);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public BadGatewayException(@Nullable Throwable cause) {
        super(HttpStatus.BAD_GATEWAY, cause);
    }

    /**
     * 默认异常
     */
    public BadGatewayException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.BAD_GATEWAY, body, cause);
    }
}
