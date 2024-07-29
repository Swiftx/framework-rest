package top.swiftx.framework.rest.core.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Schema(description = "增量响应")
public class ResponseDeltaSet<T, K> implements Serializable {
    @Schema(description = "元数据")
    private Meta meta;

    @Schema(description = "修改项目列表")
    private Set<T> changes;

    @Schema(description = "移除项目ID")
    private Set<K> removes;

    public static class Meta {
        @Schema(description = "数据接口版本")
        private String apiVersion;

        @Schema(description = "数据截止时间")
        private Date lastRequested;

        @Schema(description = "是否全量数据")
        private boolean full;
    }
}
