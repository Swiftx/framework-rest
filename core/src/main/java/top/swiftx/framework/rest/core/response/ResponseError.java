package top.swiftx.framework.rest.core.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

@Schema(description = "请求错误")
public class ResponseError implements Serializable {
    @Schema(description = "错误ID")
    private String id;

    @Schema(description = "类型")
    private String type;
}
