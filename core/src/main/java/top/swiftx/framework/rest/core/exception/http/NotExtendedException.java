package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 状态代码表示用于访问该资源的政策没有兑现。<br/>
 * 服务器应该发回客户端发送扩展请求所需的所有信息。
 *
 * @author 胡永强
 */
public class NotExtendedException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public NotExtendedException() {
        super(HttpStatus.NOT_EXTENDED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public NotExtendedException(String type, String title) {
        super(HttpStatus.NOT_EXTENDED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public NotExtendedException(@Nullable Throwable cause) {
        super(HttpStatus.NOT_EXTENDED, cause);
    }

    /**
     * 默认异常
     */
    public NotExtendedException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.NOT_EXTENDED, body, cause);
    }
}
