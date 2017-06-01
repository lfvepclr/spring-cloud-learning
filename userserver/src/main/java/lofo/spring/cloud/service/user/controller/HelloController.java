package lofo.spring.cloud.service.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bestw on 6/1/2017.
 */
@RestController
@RequestMapping("user")
public class HelloController {


    @Value("${config.hello}")
    private String configStr;


    @RequestMapping("hello")
    public String hello() {
        return "hello" + configStr;
    }

}
