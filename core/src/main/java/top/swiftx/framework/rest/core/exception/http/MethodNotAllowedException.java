package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 方法不允许
 *
 * @author 胡永强
 */
public class MethodNotAllowedException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public MethodNotAllowedException() {
        super(HttpStatus.METHOD_NOT_ALLOWED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public MethodNotAllowedException(String type, String title) {
        super(HttpStatus.METHOD_NOT_ALLOWED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public MethodNotAllowedException(@Nullable Throwable cause) {
        super(HttpStatus.METHOD_NOT_ALLOWED, cause);
    }

    /**
     * 默认异常
     */
    public MethodNotAllowedException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.METHOD_NOT_ALLOWED, body, cause);
    }
}
