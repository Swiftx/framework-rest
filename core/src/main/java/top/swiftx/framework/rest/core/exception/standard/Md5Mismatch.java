package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

public class Md5Mismatch extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public Md5Mismatch(String title) {
        super("md5-mismatch", title);
    }

    /**
     * 创建异常
     */
    public static Md5Mismatch of() {
        return new Md5Mismatch("在请求中指定的 MD5 值与服务器计算的 MD5 值不匹配。");
    }
}
