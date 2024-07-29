package top.swiftx.framework.rest.core.exception.standard;

import top.swiftx.framework.rest.core.exception.http.ForbiddenException;

/**
 * 无权限操作
 */
public class InsufficientAccountPermissions extends ForbiddenException {
    /**
     * 标准构造
     *
     * @param title 标题
     */
    public InsufficientAccountPermissions(String title) {
        super("insufficient-account-permissions", title);
    }

    /**
     * 读取异常
     */
    public static InsufficientAccountPermissions ofRead() {
        return new InsufficientAccountPermissions("读取操作当前处于禁用状态。");
    }

    /**
     * 写入异常
     */
    public static InsufficientAccountPermissions ofWrite() {
        return new InsufficientAccountPermissions("不允许写入操作。");
    }

    /**
     * 写入异常
     */
    public static InsufficientAccountPermissions ofPermission() {
        return new InsufficientAccountPermissions("正在访问的帐户没有足够的权限来执行此操作。");
    }


}
