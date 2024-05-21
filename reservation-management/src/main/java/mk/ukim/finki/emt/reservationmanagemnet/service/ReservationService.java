package mk.ukim.finki.emt.reservationmanagemnet.service;

import mk.ukim.finki.emt.reservationmanagemnet.domain.model.Reservation;
import mk.ukim.finki.emt.reservationmanagemnet.domain.model.ReservationId;
import mk.ukim.finki.emt.reservationmanagemnet.service.forms.ReservationForm;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    ReservationId makeReservation(ReservationForm orderForm);

    List<Reservation> findAll();

    Optional<Reservation> findById(ReservationId id);
}
