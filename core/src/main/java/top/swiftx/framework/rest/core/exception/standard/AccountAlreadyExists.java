package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.ConflictException;

/**
 * 指定的帐户已存在
 */
public class AccountAlreadyExists extends ConflictException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public AccountAlreadyExists(String title) {
        super("account-already-exists", title);
    }

    /**
     * 创建异常
     */
    public static AccountAlreadyExists of() {
        return new AccountAlreadyExists("指定的帐户已存在");
    }
}
