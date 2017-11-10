package lofo.spring.cloud.service.balance.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface BalanceEventSouce {

    String BLANCE_INPUT = "BlanceInput";
    String BLANCE_OUTPUT = "BlanceOutput";

    @Input(BLANCE_INPUT)
    MessageChannel blanceInput();

    @Input(BLANCE_OUTPUT)
    MessageChannel blanceOutput();

}
