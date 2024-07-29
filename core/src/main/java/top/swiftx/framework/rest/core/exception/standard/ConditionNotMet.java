package top.swiftx.framework.rest.core.exception.standard;

import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponseException;

import java.net.URI;

/**
 * ConditionNotMet	未修改 (304)	不符合在条件标头中指定的条件，无法执行读取操作。
 * ConditionNotMet	前提条件失败 (412)	不符合在条件标头中指定的条件，无法执行写入操作。
 */
public class ConditionNotMet extends ErrorResponseException {
    /**
     * 标准构造
     *
     * @param status 状态码
     * @param title  标题
     */
    public ConditionNotMet(HttpStatus status, String title) {
        super(status);
        setType(URI.create("condition-not-met"));
        setTitle(title);
    }

    /**
     * 不可读
     */
    public ConditionNotMet ofRead() {
        return new ConditionNotMet(HttpStatus.NOT_MODIFIED, "不符合在条件标头中指定的条件，无法执行读取操作。");
    }

    /**
     * 不可写
     */
    public ConditionNotMet ofWrite() {
        return new ConditionNotMet(HttpStatus.PRECONDITION_FAILED, "不符合在条件标头中指定的条件，无法执行写入操作。");
    }
}
