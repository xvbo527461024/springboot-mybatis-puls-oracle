package cn.sm.com.service;
import cn.sm.com.domain.BmSubject;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 预算科目表 服务类
 * </p>
 *
 * @author xubo
 * @since 2020-05-23
 */
public interface BmSubjectService extends IService<BmSubject> {

    List<Map<String, Object>> selectSubjectTree();
}
