package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * @author 胡永强
 */
public class UnauthorizedException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public UnauthorizedException() {
        super(HttpStatus.UNAUTHORIZED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public UnauthorizedException(String type, String title) {
        super(HttpStatus.UNAUTHORIZED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public UnauthorizedException(@Nullable Throwable cause) {
        super(HttpStatus.UNAUTHORIZED, cause);
    }

    /**
     * 默认异常
     */
    public UnauthorizedException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.UNAUTHORIZED, body, cause);
    }
}