package cn.iocoder.yudao.module.system.controller.admin.classStudent.vo;

import lombok.*;
import java.util.*;
import io.swagger.annotations.*;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@ApiModel(value = "管理后台 - 班级学生 Excel 导出 Request VO", description = "参数和 ClassStudentPageReqVO 是一致的")
@Data
public class ClassStudentExportReqVO {

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "班级编码")
    private String classCode;

    @ApiModelProperty(value = "课程编码")
    private String courseCode;

    @ApiModelProperty(value = "班级学生")
    private String studentCode;

    @ApiModelProperty(value = "班级姓名")
    private String studentName;

    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ApiModelProperty(value = "开始创建时间")
    private Date beginCreateTime;

    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ApiModelProperty(value = "结束创建时间")
    private Date endCreateTime;

}
