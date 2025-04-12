package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryIncressed extends AbstractEvent {

    private Long id;
    private String quantity;

    public InventoryIncressed(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryIncressed() {
        super();
    }
}
//>>> DDD / Domain Event
