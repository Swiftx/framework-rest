package top.swiftx.framework.rest.core.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "偏移值分页")
public class LimitOffsetPagination implements Serializable {
    @Schema(description = "显示记录数")
    private Integer limit;

    @Schema(description = "偏移量")
    private Integer offset;
}
