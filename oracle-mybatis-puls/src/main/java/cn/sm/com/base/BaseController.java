package cn.sm.com.base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController<T> {
    private Logger logger = LoggerFactory.getLogger(BaseController.class);


    /**
     * 全局异常
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map exceptionHandler(HttpServletRequest request, Exception e) {
        logger.error("", e);

        Map json = new HashMap();
        json.put("msg", e.getMessage());
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            json.put("code", 404);
        } else {
            json.put("code", 500);
        }
        json.put("path", request.getRequestURI());
        return json;
    }

}
