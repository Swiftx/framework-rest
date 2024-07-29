package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 由于之前的某个请求发生的错误，导致当前请求失败，例如 PROPPATCH
 *
 * @author 胡永强
 */
public class FailedDependencyException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public FailedDependencyException() {
        super(HttpStatus.FAILED_DEPENDENCY);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public FailedDependencyException(String type, String title) {
        super(HttpStatus.FAILED_DEPENDENCY);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public FailedDependencyException(@Nullable Throwable cause) {
        super(HttpStatus.FAILED_DEPENDENCY, cause);
    }

    /**
     * 默认异常
     */
    public FailedDependencyException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.FAILED_DEPENDENCY, body, cause);
    }
}
