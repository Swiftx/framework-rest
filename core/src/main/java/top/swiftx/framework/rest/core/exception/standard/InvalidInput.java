package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

public class InvalidInput extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public InvalidInput(String title) {
        super("invalid-input", title);
    }

    /**
     * 创建异常
     */
    public static InvalidInput of() {
        return new InvalidInput("某个请求输入无效。");
    }
}
