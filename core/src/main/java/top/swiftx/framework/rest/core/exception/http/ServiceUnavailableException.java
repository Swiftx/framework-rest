package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 服务器错误响应代码指示服务器尚未准备好处理请求
 *
 * @author 胡永强
 */
public class ServiceUnavailableException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public ServiceUnavailableException() {
        super(HttpStatus.SERVICE_UNAVAILABLE);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public ServiceUnavailableException(String type, String title) {
        super(HttpStatus.SERVICE_UNAVAILABLE);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public ServiceUnavailableException(@Nullable Throwable cause) {
        super(HttpStatus.SERVICE_UNAVAILABLE, cause);
    }

    /**
     * 默认异常
     */
    public ServiceUnavailableException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.SERVICE_UNAVAILABLE, body, cause);
    }
}
