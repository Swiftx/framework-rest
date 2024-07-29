package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 我是一个茶壶
 *
 * @author 胡永强
 */
public class IMATeapotException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public IMATeapotException() {
        super(HttpStatus.I_AM_A_TEAPOT);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public IMATeapotException(String type, String title) {
        super(HttpStatus.I_AM_A_TEAPOT);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public IMATeapotException(@Nullable Throwable cause) {
        super(HttpStatus.I_AM_A_TEAPOT, cause);
    }

    /**
     * 默认异常
     */
    public IMATeapotException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.I_AM_A_TEAPOT, body, cause);
    }
}
