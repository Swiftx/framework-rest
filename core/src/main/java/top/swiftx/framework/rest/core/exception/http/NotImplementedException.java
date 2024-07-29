package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 服务器不支持当前请求所需要的某个功能。<br/>
 * 当服务器无法识别请求的方法，并且无法支持其对任何资源的请求
 *
 * @author 胡永强
 */
public class NotImplementedException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public NotImplementedException() {
        super(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public NotImplementedException(String type, String title) {
        super(HttpStatus.NOT_IMPLEMENTED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public NotImplementedException(@Nullable Throwable cause) {
        super(HttpStatus.NOT_IMPLEMENTED, cause);
    }

    /**
     * 默认异常
     */
    public NotImplementedException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.NOT_IMPLEMENTED, body, cause);
    }
}
