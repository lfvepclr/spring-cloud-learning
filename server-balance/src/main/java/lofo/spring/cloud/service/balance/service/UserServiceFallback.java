package lofo.spring.cloud.service.balance.service;

import org.springframework.stereotype.Component;

/**
 * Created by bestw on 6/1/2017.
 */
@Component
public class UserServiceFallback implements UserService {

    @Override
    public String hello() {
        return "wolrd - balance";
    }
}
