package lixb.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * create by lixb
 * on 2017/10/25 下午6:31
 */
@SpringBootApplication(scanBasePackages = {"lixb.com"})
@EnableAsync
public class TestController {
        public static void main(String[] args) {
            SpringApplication.run(TestController.class, args);
        }
}
