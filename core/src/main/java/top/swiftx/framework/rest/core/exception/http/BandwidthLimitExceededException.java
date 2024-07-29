package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 带宽受限<br/>
 *
 * @author 胡永强
 */
public class BandwidthLimitExceededException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public BandwidthLimitExceededException() {
        super(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public BandwidthLimitExceededException(String type, String title) {
        super(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public BandwidthLimitExceededException(@Nullable Throwable cause) {
        super(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED, cause);
    }

    /**
     * 默认异常
     */
    public BandwidthLimitExceededException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED, body, cause);
    }
}
