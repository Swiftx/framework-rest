package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 响应状态码指示服务器不愿意处理请求，因为它的头部字段太大。
 * 请求可以在减少请求头域的大小后重新提交。
 *
 * @author 胡永强
 */
public class RequestHeaderFieldsTooLargeException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public RequestHeaderFieldsTooLargeException() {
        super(HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public RequestHeaderFieldsTooLargeException(String type, String title) {
        super(HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public RequestHeaderFieldsTooLargeException(@Nullable Throwable cause) {
        super(HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE, cause);
    }

    /**
     * 默认异常
     */
    public RequestHeaderFieldsTooLargeException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE, body, cause);
    }
}
