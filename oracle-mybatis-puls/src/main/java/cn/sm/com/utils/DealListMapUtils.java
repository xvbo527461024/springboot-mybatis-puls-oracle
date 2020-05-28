package cn.sm.com.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 处理 List<Map<String,Object></>
 */
public class DealListMapUtils {
    /**
     *
     * @param list 源数据
     * @param parentIdValue 根节点父id值
     * @param parentIdName 父id字段名
     * @param idName 主键名
     * @param expand 是否有子节点就展开
     * @param disabled 是否只能选择末级节点
     * @return
     */
    public static List<Map<String,Object>> getTreeList(List<Map<String,Object>> list,String parentIdValue,String parentIdName,String idName,Boolean expand,Boolean disabled){
        List<Map<String,Object>> rList = new ArrayList<>();
        for (Map<String, Object> map : list) {
            String parentId = String.valueOf(map.get(parentIdName));
            if(parentId.equals(parentIdValue)){
                rList.add(getChild(map,list,idName,expand,disabled));
            }
        }
        return rList;

    }
    //map根节点 list所有数据
    private static Map<String,Object> getChild(Map<String, Object> map, List<Map<String, Object>> list,String idName,Boolean expand,Boolean disabled) {
        for (Map n : list) {
            //如果是子节点
            if (String.valueOf(n.get("parentId")).equals(String.valueOf(map.get(idName)))) {

                if ((List)map.get("children") == null) {

                    map.put("children", new ArrayList<Map>());
                }
                List children = (List)map.get("children");

                children.add(getChild(n, list, idName, expand, disabled));
                map.put("expand", expand);//有子节点就展开
                map.put("disabled", disabled);//只能选择末级节点
            }
        }
        return map;
    }}