package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.ForbiddenException;

/**
 * 服务器无法验证该请求。 请确保 Authorization 标头的值构成正确，包括签名。
 */
public class AuthenticationFailed extends ForbiddenException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public AuthenticationFailed(String title) {
        super("authentication-failed", title);
    }

    /**
     * 创建异常
     */
    public static AuthenticationFailed of() {
        return new AuthenticationFailed("服务器无法验证该请求。 请确保Authorization标头的值构成正确，包括签名。");
    }
}
