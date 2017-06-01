package lofo.spring.cloud.service.balance.service;

/**
 * Created by bestw on 6/1/2017.
 */
//@Component
public class UserServiceFallback implements UserService {
    @Override
    public String hello() {
        return "wolrd - balance";
    }
}
