package cn.sm.com.service.impl;
import cn.sm.com.controller.BmEntityController;
import cn.sm.com.domain.BmEntity;
import cn.sm.com.mapper.BmEntityMapper;
import cn.sm.com.service.BmEntityService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.plugin2.message.Serializer;

import java.io.Serializable;

/**
 * <p>
 * 费用预算部门 服务实现类
 * </p>
 *
 * @author xubo
 * @since 2020-05-23
 */
@Service
public class BmEntityServiceImpl extends ServiceImpl<BmEntityMapper, BmEntity> implements BmEntityService {
  @Autowired
  private BmEntityMapper bmEntityMapper;
    @Override
    public Page queryAll() {
        Page<BmEntity> bmEntityPage = new Page<>();
        Page<BmEntity> bmEntityPage1 = bmEntityMapper.selectPage(bmEntityPage, null);
        return bmEntityPage1;
    }

    @Override
    public Serializable add(BmEntity bmEntity) {
         return bmEntityMapper.insert(bmEntity);
    }
}
