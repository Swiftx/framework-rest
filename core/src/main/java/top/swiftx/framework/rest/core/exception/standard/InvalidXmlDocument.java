package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.BadRequestException;

/**
 * 指定的 XML 语法无效。
 */
public class InvalidXmlDocument extends BadRequestException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public InvalidXmlDocument(String title) {
        super("invalid-xml-document", title);
    }

    /**
     * 创建异常
     */
    public static InvalidXmlDocument of() {
        return new InvalidXmlDocument("指定的 XML 语法无效。");
    }
}
