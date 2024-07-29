package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 服务器遇到了一个未曾预料的状况，导致了它无法完成对请求的处理。<br/>
 * 一般来说，这个问题都会在服务器端的源代码出现错误时出现。<br/>
 *
 * @author 胡永强
 */
public class HttpVersionNotSupportedException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public HttpVersionNotSupportedException() {
        super(HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public HttpVersionNotSupportedException(String type, String title) {
        super(HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public HttpVersionNotSupportedException(@Nullable Throwable cause) {
        super(HttpStatus.HTTP_VERSION_NOT_SUPPORTED, cause);
    }

    /**
     * 默认异常
     */
    public HttpVersionNotSupportedException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.HTTP_VERSION_NOT_SUPPORTED, body, cause);
    }
}
