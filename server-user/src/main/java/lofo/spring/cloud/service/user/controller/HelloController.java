package lofo.spring.cloud.service.user.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bestw on 6/1/2017.
 */
@RefreshScope
@RestController
@RequestMapping("user")
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @Value("${config.hello}")
    private String configStr;


    @GetMapping("hello")
    public String hello() {
        logger.info("====请求了user hello方法=====");
        return "hello" + configStr;
    }

}
