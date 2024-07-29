package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 为请求正文中的 XML 节点之一提供的值的格式不正确。
 */
public class InvalidXmlNodeValue extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public InvalidXmlNodeValue(String title) {
        super("invalid-xml-node-value", title);
    }

    /**
     * 创建异常
     */
    public static InvalidXmlNodeValue of() {
        return new InvalidXmlNodeValue("为请求正文中的 XML 节点之一提供的值的格式不正确。");
    }
}
