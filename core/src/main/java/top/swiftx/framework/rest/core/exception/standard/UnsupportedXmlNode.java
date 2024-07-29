package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 不支持请求正文中指定的 XML 节点之一。
 */
public class UnsupportedXmlNode extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public UnsupportedXmlNode(String title) {
        super("unsupported-xml-node", title);
    }

    /**
     * 创建异常
     */
    public static UnsupportedXmlNode of() {
        return new UnsupportedXmlNode("不支持请求正文中指定的 XML 节点之一。");
    }
}
