package cn.sm.com.utils;

import java.io.Serializable;

/**
 * 返回前端工具类 必须有get、set方法 不然会报错
 */
public class AjaxResult implements Serializable {
    private Object object;
    private Boolean isSucceed=true;
    private String message;

    public static AjaxResult me(){

        return new AjaxResult();
    }

    public AjaxResult setObject(Object object) {

        this.object = object;
        return this;
    }

    public AjaxResult setSucceed(Boolean succeed) {
        isSucceed = succeed;
        return this;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public Boolean getSucceed() {
        return isSucceed;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "object=" + object +
                ", isSucceed=" + isSucceed +
                ", message='" + message + '\'' +
                '}';
    }
}
