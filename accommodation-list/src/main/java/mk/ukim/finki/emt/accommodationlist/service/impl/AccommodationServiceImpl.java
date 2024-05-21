package mk.ukim.finki.emt.accommodationlist.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.accommodationlist.domain.exceptions.AccommodationNotFoundException;
import mk.ukim.finki.emt.accommodationlist.domain.model.Accommodation;
import mk.ukim.finki.emt.accommodationlist.domain.model.AccommodationId;
import mk.ukim.finki.emt.accommodationlist.domain.repository.AccommodationRepository;
import mk.ukim.finki.emt.accommodationlist.service.AccommodationService;
import mk.ukim.finki.emt.accommodationlist.service.forms.AccommodationForm;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class AccommodationServiceImpl implements AccommodationService {
    private final AccommodationRepository accommodationRepository;

    @Override
    public Accommodation findById(AccommodationId id) {
        return accommodationRepository.findById(id).orElseThrow(AccommodationNotFoundException::new);
    }

    @Override
    public Accommodation createAccommodation(AccommodationForm form) {
        Accommodation a = Accommodation.build(form.getName(),form.getLocation(),form.getType(), form.getNumberOfBeds(), form.getPricePerNight(),form.getAvailability());
        accommodationRepository.save(a);
        return a;
    }

    @Override
    public List<Accommodation> getAll() {
        return accommodationRepository.findAll();
    }

    @Override
    public Accommodation reserveAccommodation(AccommodationId accommodationId, List<Date> dates) {
        Accommodation a = accommodationRepository.findById(accommodationId).orElseThrow(AccommodationNotFoundException::new);
        a.reserve(dates);
        accommodationRepository.saveAndFlush(a);
        return a;
    }
}
