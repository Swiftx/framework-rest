package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 资源冲突异常
 *
 * @author 胡永强
 */
public class ConflictException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public ConflictException() {
        super(HttpStatus.CONFLICT);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public ConflictException(String type, String title) {
        super(HttpStatus.CONFLICT);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public ConflictException(@Nullable Throwable cause) {
        super(HttpStatus.CONFLICT, cause);
    }

    /**
     * 默认异常
     */
    public ConflictException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.CONFLICT, body, cause);
    }
}
