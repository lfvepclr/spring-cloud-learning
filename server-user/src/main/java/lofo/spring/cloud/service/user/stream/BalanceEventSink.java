package lofo.spring.cloud.service.user.stream;

import lofo.spring.cloud.stream.SourceNames;
import lofo.spring.cloud.stream.event.BalanceEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@Slf4j
@EnableBinding(BalanceSource.class)
public class BalanceEventSink {


    @StreamListener(SourceNames.BALANCE_START)
    public void receive(BalanceEvent event) {
        log.info("=====================Received:" + event.toString());
    }

}
