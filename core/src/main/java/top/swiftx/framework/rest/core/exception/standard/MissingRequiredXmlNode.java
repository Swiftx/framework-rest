package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

public class MissingRequiredXmlNode extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public MissingRequiredXmlNode(String title) {
        super("missing-required-xml-node", title);
    }

    /**
     * 创建异常
     */
    public static MissingRequiredXmlNode of() {
        return new MissingRequiredXmlNode("请求正文中未指定所需的 XML 节点。");
    }
}
