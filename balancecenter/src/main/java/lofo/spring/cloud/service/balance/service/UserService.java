package lofo.spring.cloud.service.balance.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bestw on 6/1/2017.
 */
@FeignClient(value = "USER-SERVER", fallback = UserServiceFallback.class)
@RequestMapping("user")
public interface UserService {

    @GetMapping("hello")
    String hello();

}
