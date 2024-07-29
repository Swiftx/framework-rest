package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 付费内容，不允许访问
 *
 * @author 胡永强
 */
public class PaymentRequiredException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public PaymentRequiredException() {
        super(HttpStatus.PAYMENT_REQUIRED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public PaymentRequiredException(String type, String title) {
        super(HttpStatus.PAYMENT_REQUIRED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public PaymentRequiredException(@Nullable Throwable cause) {
        super(HttpStatus.PAYMENT_REQUIRED, cause);
    }

    /**
     * 默认异常
     */
    public PaymentRequiredException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.PAYMENT_REQUIRED, body, cause);
    }
}
