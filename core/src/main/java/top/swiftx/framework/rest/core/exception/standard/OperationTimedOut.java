package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.InternalServerErrorException;

public class OperationTimedOut extends InternalServerErrorException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public OperationTimedOut(String title) {
        super("operation-timed-out", title);
    }

    /**
     * 创建异常
     */
    public static OperationTimedOut of() {
        return new OperationTimedOut("无法在允许的时间内完成该操作。 该操作可能在服务器端成功，也可能未成功。 请在重试操作之前查询服务器状态");
    }
}