package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 请求过于频繁
 *
 * @author 胡永强
 */
public class TooManyRequestsException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public TooManyRequestsException() {
        super(HttpStatus.TOO_MANY_REQUESTS);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public TooManyRequestsException(String type, String title) {
        super(HttpStatus.TOO_MANY_REQUESTS);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public TooManyRequestsException(@Nullable Throwable cause) {
        super(HttpStatus.TOO_MANY_REQUESTS, cause);
    }

    /**
     * 默认异常
     */
    public TooManyRequestsException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.TOO_MANY_REQUESTS, body, cause);
    }
}