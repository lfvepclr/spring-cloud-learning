package lofo.spring.cloud.service.balance.controller;

import lofo.spring.cloud.service.balance.service.UserService;
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

    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public String hello() {
        return userService.hello();
    }

}
