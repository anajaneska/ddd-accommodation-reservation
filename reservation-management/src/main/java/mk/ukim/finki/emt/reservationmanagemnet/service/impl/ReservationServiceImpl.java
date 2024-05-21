package mk.ukim.finki.emt.reservationmanagemnet.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.reservationmanagemnet.domain.model.Reservation;
import mk.ukim.finki.emt.reservationmanagemnet.domain.model.ReservationId;
import mk.ukim.finki.emt.reservationmanagemnet.domain.repository.ReservationRepository;
import mk.ukim.finki.emt.reservationmanagemnet.service.ReservationService;
import mk.ukim.finki.emt.reservationmanagemnet.service.forms.ReservationForm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {
    private final ReservationRepository reservationRepository;

    @Override
    public ReservationId makeReservation(ReservationForm orderForm) {
        return null;
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> findById(ReservationId id) {
        return reservationRepository.findById(id);
    }
}
