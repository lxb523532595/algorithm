package lixb.com.validator;

import lixb.com.util.JsonMapper;
import lixb.com.validator.entity.ValidorParam;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lixb
 * 2018/6/6 下午6:39
 */
@RestController
@RequestMapping(value = "testValid")
public class ValidController {

    @RequestMapping(value = "count",method = RequestMethod.GET)
    public Object count(@Valid ValidorParam validorParam){
//        System.out.println(JsonMapper.nonDefaultMapper().toJson(result));
        System.out.println("********");
        Map<String,String> map = new HashMap<>();
        map.put("12","34");
        map.put("num",validorParam.getNum()+"");
        map.put("address",validorParam.getAddress());
        return map;
    }
    @RequestMapping("count1")
    public Object count1(HttpServletRequest request,BindingResult result){
        Map<String,String> map = new HashMap<>();
        map.put("12","34");
        return map;
    }
}
