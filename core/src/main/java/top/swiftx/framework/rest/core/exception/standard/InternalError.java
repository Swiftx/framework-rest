package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.InternalServerErrorException;

/**
 * 	内部服务器错误 (500)	服务器遇到内部错误。 请重试请求。
 */
public class InternalError extends InternalServerErrorException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public InternalError(String title) {
        super("internal-error", title);
    }

    /**
     * 创建异常
     */
    public static InternalError of() {
        return new InternalError("服务器遇到内部错误。 请重试请求。");
    }
}
