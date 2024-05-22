package mk.ukim.finki.emt.sharedkernel.domain.events.reservations;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.emt.sharedkernel.domain.events.DomainEvent;

import java.util.Date;
import java.util.List;

@Getter
public class ReservationCreated extends DomainEvent {

    private String accommodationId;
    private List<Date> reservedDates;

    public ReservationCreated(String topic) {
        super(TopicHolder.TOPIC_RESERVATION_CREATED);
    }

    public ReservationCreated(String topic, String accommodationId, List<Date> reservedDates) {
        super(topic);
        this.accommodationId = accommodationId;
        this.reservedDates = reservedDates;
    }
}
