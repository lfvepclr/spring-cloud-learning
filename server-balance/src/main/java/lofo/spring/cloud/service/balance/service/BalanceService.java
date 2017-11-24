package lofo.spring.cloud.service.balance.service;

import lofo.spring.cloud.service.balance.stream.BalanceEvent;
import lofo.spring.cloud.service.balance.stream.BalanceSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class BalanceService {

    @Autowired
    private UserService userService;

    @Autowired
    private BalanceSource balanceSource;

    public String hello() {
        for (int i = 0; i < 10; i++) {
            balanceSource.balanceStartOutput().send(MessageBuilder.withPayload(new BalanceEvent("balance-user-lofo_" + i)).build());
        }
        return userService.hello();
    }

}
