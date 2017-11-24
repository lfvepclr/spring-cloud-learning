package lofo.spring.cloud.service.balance.controller;

import lofo.spring.cloud.service.balance.service.BalanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bestw on 6/1/2017.
 */
@RestController
@Slf4j
@RequestMapping("balance")
public class BalanceController {


    @Autowired
    private BalanceService balanceService;

    @GetMapping("hello")
    public String hello() {
        log.info("========结算中心 hello方法请求===========");
        return balanceService.hello();
    }

}
