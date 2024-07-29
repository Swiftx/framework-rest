package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * URL超长
 *
 * @author 胡永强
 */
public class UriTooLongException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public UriTooLongException() {
        super(HttpStatus.URI_TOO_LONG);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public UriTooLongException(String type, String title) {
        super(HttpStatus.URI_TOO_LONG);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public UriTooLongException(@Nullable Throwable cause) {
        super(HttpStatus.URI_TOO_LONG, cause);
    }

    /**
     * 默认异常
     */
    public UriTooLongException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.URI_TOO_LONG, body, cause);
    }
}
