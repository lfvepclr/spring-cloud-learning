package lofo.spring.cloud.stream.event;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BalanceEvent {

    String userName;

}
