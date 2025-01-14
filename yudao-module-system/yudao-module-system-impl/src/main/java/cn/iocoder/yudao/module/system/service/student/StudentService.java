package cn.iocoder.yudao.module.system.service.student;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.system.controller.admin.student.vo.StudentCreateReqVO;
import cn.iocoder.yudao.module.system.controller.admin.student.vo.StudentExportReqVO;
import cn.iocoder.yudao.module.system.controller.admin.student.vo.StudentPageReqVO;
import cn.iocoder.yudao.module.system.controller.admin.student.vo.StudentUpdateReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.student.StudentDO;

/**
 * 学员管理 Service 接口
 *
 * @author 毕国勇
 */
public interface StudentService {

    /**
     * 创建学员管理
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Integer create(@Valid StudentCreateReqVO createReqVO);

    /**
     * 更新学员管理
     *
     * @param updateReqVO 更新信息
     */
    void update(@Valid StudentUpdateReqVO updateReqVO);

    /**
     * 删除学员管理
     *
     * @param id 编号
     */
    void delete(Integer id);

    /**
     * 获得学员管理
     *
     * @param id 编号
     * @return 学员管理
     */
    StudentDO get(Integer id);

    /**
     * 获得学员管理列表
     *
     * @param ids 编号
     * @return 学员管理列表
     */
    List<StudentDO> getList(Collection<Integer> ids);

    /**
     * 获得学员管理分页
     *
     * @param pageReqVO 分页查询
     * @return 学员管理分页
     */
    PageResult<StudentDO> getPage(StudentPageReqVO pageReqVO);

    /**
     * 获得学员管理列表, 用于 Excel 导出
     *
     * @param exportReqVO 查询条件
     * @return 学员管理列表
     */
    List<StudentDO> getList(StudentExportReqVO exportReqVO);

}
