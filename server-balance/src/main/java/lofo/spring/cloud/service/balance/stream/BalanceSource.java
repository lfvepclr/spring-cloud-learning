package lofo.spring.cloud.service.balance.stream;

import lofo.spring.cloud.stream.SourceNames;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BalanceSource {

    @Output(SourceNames.BALANCE_START)
    MessageChannel balanceStartOutput();

}
