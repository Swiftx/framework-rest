package top.swiftx.framework.rest.core.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "游标分页")
public class CursorPagination implements Serializable {
    @Schema(description = "游标ID")
    private String cursor;

    @Schema(description = "每页显示记录数")
    private Integer pageSize;
}
