package top.swiftx.framework.rest.core.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.List;

@Schema(description = "分页响应")
public class ResponsePage<T> implements Serializable {
    @Schema(description = "元数据")
    private Meta meta;

    @Schema(description = "数据项")
    private List<T> data;

    public static class Meta {
        @Schema(description = "总记录数")
        private Long total;

        @Schema(description = "是否还有数据")
        private boolean next;
    }
}
