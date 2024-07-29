package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.UnauthorizedException;

/**
 * 服务器无法验证该请求。
 */
public class NoAuthenticationInformation extends UnauthorizedException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public NoAuthenticationInformation(String title) {
        super("no-authentication-information", title);
    }

    /**
     * 创建异常
     */
    public static NoAuthenticationInformation of() {
        return new NoAuthenticationInformation("服务器无法验证该请求。");
    }
}
