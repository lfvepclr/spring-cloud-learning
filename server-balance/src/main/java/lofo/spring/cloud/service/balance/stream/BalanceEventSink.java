package lofo.spring.cloud.service.balance.stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@Slf4j
@EnableBinding(BalanceSource.class)
public class BalanceEventSink {


    @StreamListener(BalanceSource.BALANCE_START)
    public void receive(BalanceEvent event) {
        log.info("=====================Received:" + event.toString());
    }

}
