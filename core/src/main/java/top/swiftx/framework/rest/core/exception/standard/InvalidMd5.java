package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 在请求中指定的 MD5 值无效。 MD5 值必须为 128 位并采用 Base64 编码。
 */
public class InvalidMd5 extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public InvalidMd5(String title) {
        super("invalid-md5", title);
    }

    /**
     * 创建异常
     */
    public static InvalidMd5 of() {
        return new InvalidMd5("在请求中指定的 MD5 值无效。 MD5 值必须为 128 位并采用 Base64 编码。");
    }
}
