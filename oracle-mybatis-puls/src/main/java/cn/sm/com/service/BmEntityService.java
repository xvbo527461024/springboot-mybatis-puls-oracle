package cn.sm.com.service;
import cn.sm.com.domain.BmEntity;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import sun.plugin2.message.Serializer;

import java.io.Serializable;

/**
 * <p>
 * 费用预算部门 服务类
 * </p>
 *
 * @author xubo
 * @since 2020-05-23
 */
public interface BmEntityService extends IService<BmEntity> {
   Page queryAll();

    Serializable add(BmEntity bmEntity);
}
