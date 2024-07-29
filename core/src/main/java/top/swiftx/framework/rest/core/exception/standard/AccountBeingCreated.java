package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.ConflictException;

/**
 * 正在创建指定的帐户
 */
public class AccountBeingCreated extends ConflictException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public AccountBeingCreated(String title) {
        super("account-being-created", title);
    }

    /**
     * 创建异常
     */
    public static AccountBeingCreated of() {
        return new AccountBeingCreated("正在创建指定的帐户");
    }
}
