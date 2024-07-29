package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 服务器拒绝在没有定义 Content-Length 头的情况下接受请求。<br/>
 * 在添加了表明请求消息体长度的有效 Content-Length 头之后，<br/>
 * 客户端可以再次提交该请求<br/>
 *
 * @author 胡永强
 */
public class LengthRequiredException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public LengthRequiredException() {
        super(HttpStatus.LENGTH_REQUIRED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public LengthRequiredException(String type, String title) {
        super(HttpStatus.LENGTH_REQUIRED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public LengthRequiredException(@Nullable Throwable cause) {
        super(HttpStatus.LENGTH_REQUIRED, cause);
    }

    /**
     * 默认异常
     */
    public LengthRequiredException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.LENGTH_REQUIRED, body, cause);
    }
}
