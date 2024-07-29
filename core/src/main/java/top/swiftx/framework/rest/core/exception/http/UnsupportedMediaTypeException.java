package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 请求格式不正确异常
 *
 * @author 胡永强
 */
public class UnsupportedMediaTypeException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public UnsupportedMediaTypeException() {
        super(HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public UnsupportedMediaTypeException(String type, String title) {
        super(HttpStatus.UNSUPPORTED_MEDIA_TYPE);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public UnsupportedMediaTypeException(@Nullable Throwable cause) {
        super(HttpStatus.UNSUPPORTED_MEDIA_TYPE, cause);
    }

    /**
     * 默认异常
     */
    public UnsupportedMediaTypeException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.UNSUPPORTED_MEDIA_TYPE, body, cause);
    }
}