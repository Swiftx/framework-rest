package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.ForbiddenException;

public class KeyVaultAccessTokenCannotBeAcquired extends ForbiddenException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public KeyVaultAccessTokenCannotBeAcquired(String title) {
        super("key-vault-access-token-cannot-be-acquired", title);
    }

    /**
     * 创建异常
     */
    public static KeyVaultAccessTokenCannotBeAcquired of() {
        return new KeyVaultAccessTokenCannotBeAcquired("无法使用此资源获取访问令牌。");
    }
}
