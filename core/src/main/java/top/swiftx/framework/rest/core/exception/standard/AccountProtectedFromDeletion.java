package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.ConflictException;

/**
 * 账户被锁定
 */
public class AccountProtectedFromDeletion extends ConflictException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public AccountProtectedFromDeletion(String title) {
        super("account-protected-from-deletion", title);
    }

    /**
     * 创建异常
     */
    public static AccountProtectedFromDeletion of() {
        return new AccountProtectedFromDeletion(
                "帐户被锁定，无法执行删除");
    }
}
