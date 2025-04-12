package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryDecressed extends AbstractEvent {

    private Long id;
    private String quantity;

    public InventoryDecressed(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryDecressed() {
        super();
    }
}
//>>> DDD / Domain Event
