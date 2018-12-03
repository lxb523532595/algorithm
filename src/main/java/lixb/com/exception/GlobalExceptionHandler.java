package lixb.com.exception;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lixb
 * 2018/6/11 上午9:51
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LogManager.getLogger("error");

    @ExceptionHandler(value=BindException.class)
    @ResponseBody
    public Map E(BindException e){
        Map<String,Object> map = new HashMap<>();
        map.put("errorcode","3001");
        map.put("errormsg",e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
        map.put("timestamp",System.currentTimeMillis());
        map.put("data",null);
        System.out.println(1);
        logger.error(e.getMessage(),e);
        System.out.println(2);
        return map;
    }

}
