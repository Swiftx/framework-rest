package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 客户端错误响应代码指示用户请求由于法律原因而不可用的资源，<br/>
 * 例如已发出法律行为的网页
 *
 * @author 胡永强
 */
public class UnavailableForLegalReasonsException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public UnavailableForLegalReasonsException() {
        super(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public UnavailableForLegalReasonsException(String type, String title) {
        super(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public UnavailableForLegalReasonsException(@Nullable Throwable cause) {
        super(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, cause);
    }

    /**
     * 默认异常
     */
    public UnavailableForLegalReasonsException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, body, cause);
    }
}
