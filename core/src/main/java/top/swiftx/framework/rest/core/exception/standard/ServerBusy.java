package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.ServiceUnavailableException;

public class ServerBusy extends ServiceUnavailableException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public ServerBusy(String title) {
        super("server-busy", title);
    }

    /**
     * 创建异常
     */
    public static ServerBusy ofRetry() {
        return new ServerBusy("服务器当前无法接收请求。 请重试请求。");
    }

    /**
     * 创建异常
     */
    public static ServerBusy ofInputLimit() {
        return new ServerBusy("入口超出帐户限制。");
    }

    /**
     * 创建异常
     */
    public static ServerBusy ofOutputLimit() {
        return new ServerBusy("出口超出帐户限制。");
    }

    /**
     * 创建异常
     */
    public static ServerBusy ofOperation() {
        return new ServerBusy("每秒操作数超过帐户限制。");
    }
}
