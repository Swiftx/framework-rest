package top.swiftx.framework.rest.core.exception.standard;

import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * 无效的验证信息
 */
public class InvalidAuthenticationInfo extends ErrorResponseException {
    /**
     * 标准构造
     *
     * @param status 状态码
     * @param title  标题
     */
    public InvalidAuthenticationInfo(HttpStatus status, String title) {
        super(status);
        setType(URI.create("invalid-authentication-info"));
        setTitle(title);
    }

    /**
     * 验证失败
     */
    public InvalidAuthenticationInfo ofFail() {
        return new InvalidAuthenticationInfo(
                HttpStatus.UNAUTHORIZED,
                "服务器无法验证该请求。"
        );
    }

    /**
     * 格式错误
     */
    public InvalidAuthenticationInfo ofFormat() {
        return new InvalidAuthenticationInfo(
                HttpStatus.BAD_REQUEST,
                "未以正确的格式提供身份验证信息。"
        );
    }
}
