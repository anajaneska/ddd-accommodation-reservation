package mk.ukim.finki.emt.reservationmanagemnet.domain.repository;

import mk.ukim.finki.emt.reservationmanagemnet.domain.model.Reservation;
import mk.ukim.finki.emt.reservationmanagemnet.domain.model.ReservationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, ReservationId> {
}
