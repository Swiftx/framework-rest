package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 荷载过大
 *
 * @author 胡永强
 */
public class PayloadTooLargeException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public PayloadTooLargeException() {
        super(HttpStatus.PAYLOAD_TOO_LARGE);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public PayloadTooLargeException(String type, String title) {
        super(HttpStatus.PAYLOAD_TOO_LARGE);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public PayloadTooLargeException(@Nullable Throwable cause) {
        super(HttpStatus.PAYLOAD_TOO_LARGE, cause);
    }

    /**
     * 默认异常
     */
    public PayloadTooLargeException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.PAYLOAD_TOO_LARGE, body, cause);
    }
}
