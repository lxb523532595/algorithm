package lixb.com.aync;

import lixb.com.aync.service.AyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixb
 * 2018/4/2 上午9:40
 */
@RestController
@EnableAsync
public class AyncController {

    @Autowired
    private AyncService ayncService;


    @RequestMapping("api/aync/test")
    public void test(){
        ayncService.test();
        System.out.println(11111);
    }
}
