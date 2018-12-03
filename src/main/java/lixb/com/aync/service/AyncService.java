package lixb.com.aync.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author lixb
 * 2018/4/2 上午10:00
 */
@Service
public class AyncService {

    @Async
    public void test(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2222222");
    }
}
