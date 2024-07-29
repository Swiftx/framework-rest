package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.ForbiddenException;

/**
 * 找不到密钥保管库密钥来解包加密密钥。
 */
public class KeyVaultEncryptionKeyNotFound extends ForbiddenException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public KeyVaultEncryptionKeyNotFound(String title) {
        super("key-vault-encryption-key-not-found", title);
    }

    /**
     * 创建异常
     */
    public static KeyVaultEncryptionKeyNotFound of() {
        return new KeyVaultEncryptionKeyNotFound("找不到密钥保管库密钥来解包加密密钥。");
    }
}
