package mk.ukim.finki.emt.accommodationlist.xport.events;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.accommodationlist.domain.model.AccommodationId;
import mk.ukim.finki.emt.accommodationlist.service.AccommodationService;
import mk.ukim.finki.emt.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.emt.sharedkernel.domain.events.DomainEvent;
import mk.ukim.finki.emt.sharedkernel.domain.events.reservations.ReservationCancelled;
import mk.ukim.finki.emt.sharedkernel.domain.events.reservations.ReservationCreated;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccommodationEventListener {
    private final AccommodationService accommodationService;

    @KafkaListener(topics = TopicHolder.TOPIC_RESERVATION_CREATED, groupId = "accommodationList")
    public void consumeOrderItemCreatedEvent(String jsonMessage) {
        try {
            ReservationCreated event = DomainEvent.fromJson(jsonMessage,ReservationCreated.class);
            accommodationService.reserveAccommodation(AccommodationId.of(event.getAccommodationId()),event.getReservedDates());
        } catch (Exception e){

        }
    }

    @KafkaListener(topics= TopicHolder.TOPIC_RESERVATION_CANCELLED, groupId = "accommodationList")
    public void consumeOrderItemRemovedEvent(String jsonMessage) {
        try {
            ReservationCancelled event = DomainEvent.fromJson(jsonMessage,ReservationCancelled.class);
           // accommodationService.reserveAccommodation(ProductId.of(event.getProductId()), event.getQuantity());
        } catch (Exception e){

        }

    }


}
