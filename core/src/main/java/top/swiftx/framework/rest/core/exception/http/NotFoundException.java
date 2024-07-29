package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 资源不存在异常
 *
 * @author 胡永强
 */
public class NotFoundException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public NotFoundException() {
        super(HttpStatus.NOT_FOUND);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public NotFoundException(String type, String title) {
        super(HttpStatus.NOT_FOUND);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public NotFoundException(@Nullable Throwable cause) {
        super(HttpStatus.NOT_FOUND, cause);
    }

    /**
     * 默认异常
     */
    public NotFoundException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.NOT_FOUND, body, cause);
    }
}