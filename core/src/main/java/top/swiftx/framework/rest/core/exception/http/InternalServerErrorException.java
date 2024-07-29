package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 服务内异常
 *
 * @author 胡永强
 */
public class InternalServerErrorException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public InternalServerErrorException() {
        super(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public InternalServerErrorException(String type, String title) {
        super(HttpStatus.INTERNAL_SERVER_ERROR);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public InternalServerErrorException(@Nullable Throwable cause) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, cause);
    }

    /**
     * 默认异常
     */
    public InternalServerErrorException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, body, cause);
    }
}