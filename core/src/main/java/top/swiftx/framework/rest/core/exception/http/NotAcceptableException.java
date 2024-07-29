package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 被请求的资源只能用于生成内容而不会接收发送请求中的头
 *
 * @author 胡永强
 */
public class NotAcceptableException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public NotAcceptableException() {
        super(HttpStatus.NOT_ACCEPTABLE);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public NotAcceptableException(String type, String title) {
        super(HttpStatus.NOT_ACCEPTABLE);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public NotAcceptableException(@Nullable Throwable cause) {
        super(HttpStatus.NOT_ACCEPTABLE, cause);
    }

    /**
     * 默认异常
     */
    public NotAcceptableException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.NOT_ACCEPTABLE, body, cause);
    }
}
