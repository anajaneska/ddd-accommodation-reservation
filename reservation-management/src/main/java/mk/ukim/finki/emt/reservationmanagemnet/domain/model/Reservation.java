package mk.ukim.finki.emt.reservationmanagemnet.domain.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import mk.ukim.finki.emt.reservationmanagemnet.domain.valueObjects.AccommodationId;
import mk.ukim.finki.emt.reservationmanagemnet.domain.valueObjects.UserId;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

import java.util.Date;

@Entity
public class Reservation extends AbstractEntity<ReservationId> {
    @AttributeOverride(name = "id", column = @Column(name = "flight_id", nullable = false))
    private AccommodationId accommodationId;
    //private UserId userid;
    private Date dateOfArrival;
    private Date dateOfDeparture;
    private Money totalPrice;
    private int numberOfNights;
}
