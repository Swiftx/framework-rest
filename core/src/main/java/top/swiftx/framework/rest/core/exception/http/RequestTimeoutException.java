package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 响应状态码意味着服务器想要关闭这个未使用的连接。<br/>
 * 它由一些服务器在空闲连接上发送，即使客户端没有任何先前的请求
 *
 * @author 胡永强
 */
public class RequestTimeoutException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public RequestTimeoutException() {
        super(HttpStatus.REQUEST_TIMEOUT);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public RequestTimeoutException(String type, String title) {
        super(HttpStatus.REQUEST_TIMEOUT);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public RequestTimeoutException(@Nullable Throwable cause) {
        super(HttpStatus.REQUEST_TIMEOUT, cause);
    }

    /**
     * 默认异常
     */
    public RequestTimeoutException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.REQUEST_TIMEOUT, body, cause);
    }
}