package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

public class OutOfRangeInput extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public OutOfRangeInput(String title) {
        super("out-of-range-input", title);
    }

    /**
     * 创建异常
     */
    public static OutOfRangeInput of() {
        return new OutOfRangeInput("请求输入之一超过范围。");
    }
}

