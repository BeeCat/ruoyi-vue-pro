package cn.iocoder.yudao.module.system.controller.admin.dict.vo.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("管理后台 - 数据字典精简 Response VO")
@Data
public class DictDataSimpleRespVO {

    @ApiModelProperty(value = "字典类型", required = true, example = "gender")
    private String dictType;

    @ApiModelProperty(value = "字典键值", required = true, example = "1")
    private String value;

    @ApiModelProperty(value = "字典标签", required = true, example = "男")
    private String label;

    @ApiModelProperty(value = "id", required = true, example = "1123")
    private Long id;

}
