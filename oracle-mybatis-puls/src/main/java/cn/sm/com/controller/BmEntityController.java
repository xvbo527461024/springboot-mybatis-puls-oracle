package cn.sm.com.controller;


import cn.sm.com.base.BaseController;
import cn.sm.com.domain.BmEntity;
import cn.sm.com.service.BmEntityService;
import cn.sm.com.utils.AjaxResult;
import cn.sm.com.utils.RedisUtil;
import cn.sm.com.utils.RedisUtil;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.reflection.wrapper.BaseWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import sun.plugin2.message.Serializer;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 费用预算部门 前端控制器
 * </p>
 *
 * @author xubo
 * @since 2020-05-23
 */
@RestController
@RequestMapping("/bmEntity")
public class BmEntityController extends BaseController<BmEntity> {
    @Autowired
    private BmEntityService bmEntityService;

    @Autowired
    private RedisUtil redisUtil;    //工具类bean注入调用方


    @RequestMapping(value = "/queryOne",method = RequestMethod.GET)
    public AjaxResult queryOne(String entityId){
        try {
            //6676935
            BmEntity bmEntity = bmEntityService.getById(entityId);
            return  AjaxResult.me().setMessage("查询成功").setObject(bmEntity);
        } catch (Exception e) {
            return  AjaxResult.me().setMessage("查询失败").setSucceed(false).setObject(e.getMessage());

        }
    }
    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
    public AjaxResult queryAll(){
        try {

            Page page = bmEntityService.queryAll();
            return  AjaxResult.me().setMessage("查询成功").setObject(page);
        } catch (Exception e) {
            return  AjaxResult.me().setMessage("查询失败").setSucceed(false).setObject(e.getMessage());

        }
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public AjaxResult addAndUpdate( @RequestBody BmEntity bmEntity){
          Long paramsEntityId = bmEntity.getEntityId();
        try {
            if (paramsEntityId == null) {
                Serializable     entityId = bmEntityService.add(bmEntity);
                return  AjaxResult.me().setMessage("新增成功").setObject(entityId);
            }else {

                 bmEntityService.updateById(bmEntity);
                return  AjaxResult.me().setMessage("修改成功");
            }

        } catch (Exception e) {
            return  AjaxResult.me().setMessage("新增失败").setSucceed(false).setObject(e.getMessage());

        }
    }

    @RequestMapping(value = "/setRedis",method = RequestMethod.POST)
    public AjaxResult setRedis( ){
        try {
            redisUtil.set("xubo", "徐波");
            return  AjaxResult.me().setMessage("设置成功").setSucceed(true).setObject("xubo");
        } catch (Exception e) {
            return  AjaxResult.me().setMessage("设置失败").setSucceed(false).setObject(e.getMessage());

        }
    }
    @RequestMapping(value = "/getKey/{key}",method = RequestMethod.POST)
    public AjaxResult getKey(@PathVariable("key") String key){
        try {
            Object xubo = redisUtil.get(key);
            return  AjaxResult.me().setMessage("获取成功").setSucceed(true).setObject(xubo);
        } catch (Exception e) {
            return  AjaxResult.me().setMessage("设置失败").setSucceed(false).setObject(e.getMessage());

        }
    }
}

