package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.MethodNotAllowedException;

/**
 * 资源不支持指定的 HTTP 动词。
 */
public class UnsupportedHttpVerb extends MethodNotAllowedException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public UnsupportedHttpVerb(String title) {
        super("unsupported-http-verb", title);
    }

    /**
     * 创建异常
     */
    public static UnsupportedHttpVerb of() {
        return new UnsupportedHttpVerb("资源不支持指定的 HTTP 动词。");
    }
}