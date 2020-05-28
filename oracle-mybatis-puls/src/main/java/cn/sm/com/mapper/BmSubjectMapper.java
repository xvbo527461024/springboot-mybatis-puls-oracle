package cn.sm.com.mapper;
import cn.sm.com.domain.BmSubject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 预算科目表 Mapper 接口
 * </p>
 *
 * @author xubo
 * @since 2020-05-23
 */
public interface BmSubjectMapper extends BaseMapper<BmSubject> {
//查询科目树
  List<Map<String, Object>> selectByYear();
}
