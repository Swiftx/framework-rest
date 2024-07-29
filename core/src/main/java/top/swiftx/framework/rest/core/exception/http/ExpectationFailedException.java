package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 在请求头 Expect 中指定的预期内容无法被服务器满足，<br/>
 * 或者这个服务器是一个代理服务器，它有明显的证据证明在当前路由的下一个节点上，<br/>
 * Expect 的内容无法被满足<br/>
 *
 * @author 胡永强
 */
public class ExpectationFailedException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public ExpectationFailedException() {
        super(HttpStatus.EXPECTATION_FAILED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public ExpectationFailedException(String type, String title) {
        super(HttpStatus.EXPECTATION_FAILED);
        setType(URI.create(type));
        setTitle(title);
    }
    /**
     * 默认异常
     */
    public ExpectationFailedException(@Nullable Throwable cause) {
        super(HttpStatus.EXPECTATION_FAILED, cause);
    }

    /**
     * 默认异常
     */
    public ExpectationFailedException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.EXPECTATION_FAILED, body, cause);
    }
}
