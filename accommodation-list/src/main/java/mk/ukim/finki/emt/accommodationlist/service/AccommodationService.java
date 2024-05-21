package mk.ukim.finki.emt.accommodationlist.service;

import mk.ukim.finki.emt.accommodationlist.domain.model.Accommodation;
import mk.ukim.finki.emt.accommodationlist.domain.model.AccommodationId;
import mk.ukim.finki.emt.accommodationlist.service.forms.AccommodationForm;

import java.util.Date;
import java.util.List;

public interface AccommodationService {
    Accommodation findById(AccommodationId id);
    Accommodation createAccommodation(AccommodationForm form);
    List<Accommodation> getAll();
    Accommodation reserveAccommodation(AccommodationId accommodationId,List<Date> dates);
}
