package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 验证不通过异常
 *
 * @author 胡永强
 */
public class UnprocessableEntityException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public UnprocessableEntityException() {
        super(HttpStatus.UNPROCESSABLE_ENTITY);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public UnprocessableEntityException(String type, String title) {
        super(HttpStatus.UNPROCESSABLE_ENTITY);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public UnprocessableEntityException(@Nullable Throwable cause) {
        super(HttpStatus.UNPROCESSABLE_ENTITY, cause);
    }

    /**
     * 默认异常
     */
    public UnprocessableEntityException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.UNPROCESSABLE_ENTITY, body, cause);
    }
}