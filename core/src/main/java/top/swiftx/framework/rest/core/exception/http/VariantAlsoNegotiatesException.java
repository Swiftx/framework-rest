package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 服务器不支持,或者拒绝支持在请求中使用的 HTTP 版本
 *
 * @author 胡永强
 */
public class VariantAlsoNegotiatesException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public VariantAlsoNegotiatesException() {
        super(HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public VariantAlsoNegotiatesException(String type, String title) {
        super(HttpStatus.VARIANT_ALSO_NEGOTIATES);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public VariantAlsoNegotiatesException(@Nullable Throwable cause) {
        super(HttpStatus.VARIANT_ALSO_NEGOTIATES, cause);
    }

    /**
     * 默认异常
     */
    public VariantAlsoNegotiatesException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.VARIANT_ALSO_NEGOTIATES, body, cause);
    }
}