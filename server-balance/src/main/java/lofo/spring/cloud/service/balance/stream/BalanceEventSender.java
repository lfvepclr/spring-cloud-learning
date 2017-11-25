package lofo.spring.cloud.service.balance.stream;

import lofo.spring.cloud.stream.SourceNames;
import lofo.spring.cloud.stream.event.BalanceEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

@Slf4j
@EnableBinding(BalanceSource.class)
public class BalanceEventSender {

    @Autowired
    @Qualifier(SourceNames.BALANCE_START)
    MessageChannel messageChannel;

    public boolean send(BalanceEvent balanceEvent) {
        return messageChannel.send(MessageBuilder.withPayload(balanceEvent).build());
    }

}
