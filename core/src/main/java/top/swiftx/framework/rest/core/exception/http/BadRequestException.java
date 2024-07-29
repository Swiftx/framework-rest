package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 请求失败异常<br/>
 *
 * @author 胡永强
 */
public class BadRequestException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public BadRequestException() {
        super(HttpStatus.BAD_REQUEST);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public BadRequestException(String type, String title) {
        super(HttpStatus.BAD_REQUEST);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public BadRequestException(@Nullable Throwable cause) {
        super(HttpStatus.BAD_REQUEST, cause);
    }

    /**
     * 默认异常
     */
    public BadRequestException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.BAD_REQUEST, body, cause);
    }
}
