package lofo.spring.cloud.service.user.stream;

import lofo.spring.cloud.stream.SourceNames;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface BalanceSource {


    @Input(SourceNames.BALANCE_START)
    SubscribableChannel balanceStartInput();

}
