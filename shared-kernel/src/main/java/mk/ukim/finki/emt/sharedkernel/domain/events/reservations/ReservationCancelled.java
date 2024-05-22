package mk.ukim.finki.emt.sharedkernel.domain.events.reservations;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.emt.sharedkernel.domain.events.DomainEvent;

import java.util.Date;
import java.util.List;

@Getter
public class ReservationCancelled extends DomainEvent {
    private String accommodationId;
    private List<Date> reservedDates;
    public ReservationCancelled(String topic) {
        super(TopicHolder.TOPIC_RESERVATION_CANCELLED);
    }

    public ReservationCancelled(String topic, String accommodationId, List<Date> reservedDates) {
        super(topic);
        this.accommodationId = accommodationId;
        this.reservedDates = reservedDates;
    }
}
