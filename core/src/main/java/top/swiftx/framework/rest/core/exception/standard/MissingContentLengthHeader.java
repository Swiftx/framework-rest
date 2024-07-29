package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.LengthRequiredException;

public class MissingContentLengthHeader extends LengthRequiredException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public MissingContentLengthHeader(String title) {
        super("missing-content-length-header", title);
    }

    /**
     * 创建异常
     */
    public static MissingContentLengthHeader of() {
        return new MissingContentLengthHeader("未指定Content-Length标头。");
    }
}