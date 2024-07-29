package top.swiftx.framework.rest.core.exception.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.lang.Nullable;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 要求客户端升级其协议以便继续
 *
 * @author 胡永强
 */
public class UpgradeRequiredException extends ErrorResponseException {
    /**
     * 默认构造
     */
    public UpgradeRequiredException() {
        super(HttpStatus.UPGRADE_REQUIRED);
    }

    /**
     * 标准构造
     *
     * @param type 类型
     * @param title 标题
     */
    public UpgradeRequiredException(String type, String title) {
        super(HttpStatus.UPGRADE_REQUIRED);
        setType(URI.create(type));
        setTitle(title);
    }

    /**
     * 默认异常
     */
    public UpgradeRequiredException(@Nullable Throwable cause) {
        super(HttpStatus.UPGRADE_REQUIRED, cause);
    }

    /**
     * 默认异常
     */
    public UpgradeRequiredException(ProblemDetail body, @Nullable Throwable cause) {
        super(HttpStatus.UPGRADE_REQUIRED, body, cause);
    }
}