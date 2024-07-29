package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

public class InvalidResourceName extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public InvalidResourceName(String title) {
        super("invalid-resource-name", title);
    }

    /**
     * 创建异常
     */
    public static InvalidResourceName of() {
        return new InvalidResourceName("指定的资源名称包含无效字符。");
    }
}
