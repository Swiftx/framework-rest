package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 请求方法无效
 */
public class InvalidHttpVerb extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public InvalidHttpVerb(String title) {
        super("invalid-http-verb", title);
    }

    /**
     * 创建异常
     */
    public static InvalidHttpVerb of() {
        return new InvalidHttpVerb("服务器无法识别指定的 HTTP 动词。");
    }
}
