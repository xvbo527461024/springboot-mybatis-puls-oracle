package cn.sm.com.service.impl;
import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Lists;

import cn.sm.com.domain.BmSubject;
import cn.sm.com.mapper.BmSubjectMapper;
import cn.sm.com.service.BmSubjectService;
import cn.sm.com.utils.DealListMapUtils;
import cn.sm.com.utils.RedisUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 预算科目表 服务实现类
 * </p>
 *
 * @author xubo
 * @since 2020-05-23
 */
@Service
public class BmSubjectServiceImpl extends ServiceImpl<BmSubjectMapper, BmSubject> implements BmSubjectService {
    @Resource
    private BmSubjectMapper bmSubjectMapper;

    @Autowired
    private RedisUtil redisUtil;    //工具类bean注入调用方
    @Override
    public List<Map<String, Object>> selectSubjectTree() {
        Date date = new Date();
        Object subjectTree = redisUtil.get("2020");

        List<Map<String, Object>> treeList=null;
        if (subjectTree == null) {
            List<Map<String, Object>> list = bmSubjectMapper.selectByYear();
             treeList = DealListMapUtils.getTreeList(list, "2274", "parentId", "subjectId", true, true);
            String str = JSON.toJSONString(treeList); // List转json
            redisUtil.set("2020", str);
           return treeList;
        }else {
            treeList=JSON.parseObject((String) subjectTree, new TypeReference<List<Map<String, Object>>>() {});

        }
        Date date1 = new Date();
        System.out.println(date.getTime()-date1.getTime());
        return treeList;

    }
}
