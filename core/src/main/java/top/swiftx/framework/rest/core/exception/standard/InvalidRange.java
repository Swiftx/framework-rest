package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.RequestedRangeNotSatisfiableException;

public class InvalidRange extends RequestedRangeNotSatisfiableException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public InvalidRange(String title) {
        super("invalid-range", title);
    }

    /**
     * 创建异常
     */
    public static InvalidMetadata of() {
        return new InvalidMetadata("指定的范围对当前资源大小无效。");
    }
}