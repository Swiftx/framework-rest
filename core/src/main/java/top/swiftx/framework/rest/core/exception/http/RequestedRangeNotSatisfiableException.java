package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 错误响应代码指示服务器无法提供请求的范围。<br/>
 * 最可能的原因是文档不包含这样的范围，或者Range标题值虽然在语法上是正确的，<br/>
 * 但是没有意义
 *
 * @author 胡永强
 */
public class RequestedRangeNotSatisfiableException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public RequestedRangeNotSatisfiableException() {
        super(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public RequestedRangeNotSatisfiableException(String type, String title) {
        super(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public RequestedRangeNotSatisfiableException(@Nullable Throwable cause) {
        super(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE, cause);
    }

    /**
     * 默认异常
     */
    public RequestedRangeNotSatisfiableException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE, body, cause);
    }
}
