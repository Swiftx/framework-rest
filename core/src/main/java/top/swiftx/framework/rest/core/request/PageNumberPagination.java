package top.swiftx.framework.rest.core.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(description = "页码分页")
public class PageNumberPagination implements Serializable {
    @Schema(description = "页码")
    protected Integer page;

    @Schema(description = "每页显示记录数")
    private Integer pageSize;
}
