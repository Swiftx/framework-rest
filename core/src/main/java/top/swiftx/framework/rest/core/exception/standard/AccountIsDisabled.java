package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.ForbiddenException;

/**
 * 已禁用指定的帐户
 */
public class AccountIsDisabled extends ForbiddenException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public AccountIsDisabled(String title) {
        super("account-is-disabled", title);
    }

    /**
     * 创建异常
     */
    public static AccountIsDisabled of() {
        return new AccountIsDisabled("已禁用指定的帐户");
    }
}
