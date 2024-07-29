package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 太早
 *
 * @author 胡永强
 */
public class TooEarlyException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public TooEarlyException() {
        super(HttpStatus.TOO_EARLY);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public TooEarlyException(String type, String title) {
        super(HttpStatus.TOO_EARLY);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public TooEarlyException(@Nullable Throwable cause) {
        super(HttpStatus.TOO_EARLY, cause);
    }

    /**
     * 默认异常
     */
    public TooEarlyException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.TOO_EARLY, body, cause);
    }
}
