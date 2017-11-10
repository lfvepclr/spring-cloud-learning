package lofo.spring.cloud.service.balance.stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@Slf4j
@EnableBinding(BalanceEventSouce.class)
public class BalanceEventSink {


    @StreamListener(BalanceEventSouce.BLANCE_INPUT)
    public void receive(BalanceEvent event) {
        log.info("=====================Received:" + event.toString());
    }

}
