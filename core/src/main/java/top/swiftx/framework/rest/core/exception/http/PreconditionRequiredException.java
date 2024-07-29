package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 当前提条件头与服务器端状态不匹配时
 *
 * @author 胡永强
 */
public class PreconditionRequiredException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public PreconditionRequiredException() {
        super(HttpStatus.PRECONDITION_REQUIRED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public PreconditionRequiredException(String type, String title) {
        super(HttpStatus.PRECONDITION_REQUIRED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public PreconditionRequiredException(@Nullable Throwable cause) {
        super(HttpStatus.PRECONDITION_REQUIRED, cause);
    }

    /**
     * 默认异常
     */
    public PreconditionRequiredException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.PRECONDITION_REQUIRED, body, cause);
    }
}
