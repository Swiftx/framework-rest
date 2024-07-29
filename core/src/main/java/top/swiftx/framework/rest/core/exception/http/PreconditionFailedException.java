package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 服务器在验证在请求的头字段中给出先决条件时，没能满足其中的一个或多个。<br/>
 * 这个状态码允许客户端在获取资源时在请求的元信息（请求头字段数据）中设置先决条件，<br/>
 * 以此避免该请求方法被应用到其希望的内容以外的资源上。<br/>
 *
 * @author 胡永强
 */
public class PreconditionFailedException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public PreconditionFailedException() {
        super(HttpStatus.PRECONDITION_FAILED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public PreconditionFailedException(String type, String title) {
        super(HttpStatus.PRECONDITION_FAILED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public PreconditionFailedException(@Nullable Throwable cause) {
        super(HttpStatus.PRECONDITION_FAILED, cause);
    }

    /**
     * 默认异常
     */
    public PreconditionFailedException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.PRECONDITION_FAILED, body, cause);
    }
}
