package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 拒绝请求异常
 *
 * @author 胡永强
 */
public class ForbiddenException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public ForbiddenException() {
        super(HttpStatus.FORBIDDEN);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public ForbiddenException(String type, String title) {
        super(HttpStatus.FORBIDDEN);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public ForbiddenException(@Nullable Throwable cause) {
        super(HttpStatus.FORBIDDEN, cause);
    }

    /**
     * 默认异常
     */
    public ForbiddenException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.FORBIDDEN, body, cause);
    }
}