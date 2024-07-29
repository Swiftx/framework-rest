package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 服务器没有足够的空间处理请求
 *
 * @author 胡永强
 */
public class InsufficientStorageException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public InsufficientStorageException() {
        super(HttpStatus.INSUFFICIENT_STORAGE);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public InsufficientStorageException(String type, String title) {
        super(HttpStatus.INSUFFICIENT_STORAGE);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public InsufficientStorageException(@Nullable Throwable cause) {
        super(HttpStatus.INSUFFICIENT_STORAGE, cause);
    }

    /**
     * 默认异常
     */
    public InsufficientStorageException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.INSUFFICIENT_STORAGE, body, cause);
    }
}
