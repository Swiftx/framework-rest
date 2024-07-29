package top.swiftx.framework.rest.core.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Schema(description = "标准增量数据集请求")
public class DeltaSetRequest implements Serializable {
    @Schema(description = "数据接口版本")
    private String apiVersion;

    @Schema(description = "数据截止时间")
    private Date lastRequested;
}
