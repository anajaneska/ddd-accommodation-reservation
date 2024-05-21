package mk.ukim.finki.emt.accommodationlist.service.forms;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import mk.ukim.finki.emt.accommodationlist.domain.enums.Type;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;
import mk.ukim.finki.emt.sharedkernel.domain.location.Location;

import java.util.Date;
import java.util.List;

@Data
public class AccommodationForm {
    private String name;
    private Location location;
    @Enumerated(EnumType.STRING)
    private Type type;
    private int numberOfBeds;
    private Money pricePerNight;
    private List<Date> availability;
}
