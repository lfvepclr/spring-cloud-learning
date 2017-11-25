package lofo.spring.cloud.service.balance.service;

import lofo.spring.cloud.service.balance.stream.BalanceEventSender;
import lofo.spring.cloud.stream.event.BalanceEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BalanceService {

    @Autowired
    private UserService userService;

    @Autowired
    private BalanceEventSender balanceEventSender;

    public String hello() {
        for (int i = 0; i < 10000; i++) {
            balanceEventSender.send(new BalanceEvent("balance-user-lofo_" + i));
        }
        return userService.hello();
    }

}
