package lofo.spring.cloud.service.balance.controller;

import lofo.spring.cloud.service.balance.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bestw on 6/1/2017.
 */
@RestController
@RequestMapping("balance")
public class BalanceController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public String hello() {
        logger.info("========结算中心 hello方法请求===========");
         return userService.hello();
    }

}
