package lofo.spring.cloud.service.balance.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface BalanceSource {


    String BALANCE_START = "balance.start";

    @Output(BALANCE_START)
    MessageChannel balanceStartOutput();

}
