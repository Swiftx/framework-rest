package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 服务器发现了一个无限的循环档处理请求的时候
 *
 * @author 胡永强
 */
public class LoopDetectedException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public LoopDetectedException() {
        super(HttpStatus.LOOP_DETECTED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public LoopDetectedException(String type, String title) {
        super(HttpStatus.LOOP_DETECTED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public LoopDetectedException(@Nullable Throwable cause) {
        super(HttpStatus.LOOP_DETECTED, cause);
    }

    /**
     * 默认异常
     */
    public LoopDetectedException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.LOOP_DETECTED, body, cause);
    }
}
