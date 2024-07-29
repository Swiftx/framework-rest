package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.ForbiddenException;

/**
 * 找不到密钥保管库保管库。
 */
public class KeyVaultVaultNotFound extends ForbiddenException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public KeyVaultVaultNotFound(String title) {
        super("key-vault-vault-not-found", title);
    }

    /**
     * 创建异常
     */
    public static KeyVaultVaultNotFound of() {
        return new KeyVaultVaultNotFound("找不到密钥保管库保管库。");
    }
}
