package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 资源被锁定
 *
 * @author 胡永强
 */
public class LockedException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public LockedException() {
        super(HttpStatus.LOCKED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public LockedException(String type, String title) {
        super(HttpStatus.LOCKED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public LockedException(@Nullable Throwable cause) {
        super(HttpStatus.LOCKED, cause);
    }

    /**
     * 默认异常
     */
    public LockedException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.LOCKED, body, cause);
    }
}
