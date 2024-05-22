package mk.ukim.finki.emt.accommodationlist.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import mk.ukim.finki.emt.accommodationlist.domain.enums.Type;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;
import mk.ukim.finki.emt.sharedkernel.domain.location.Location;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.cglib.core.Local;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;
@Entity
@Table(name="accommodation")
@Getter
public class Accommodation extends AbstractEntity<AccommodationId> {
    private String name;
    private Location location;
    @Enumerated(EnumType.STRING)
    private Type type;
    private int numberOfBeds;
    private Money pricePerNight;
    @ElementCollection(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<Date> availability;

    public Accommodation() {
        super(AccommodationId.randomId(AccommodationId.class));
        this.availability=new ArrayList<>();
    }

    public static Accommodation build(String name, Location location, Type type, int numberOfBeds, Money pricePerNight, List<Date> availability) {
        Accommodation a = new Accommodation();
        a.name=name;
        a.location=location;
        a.type=type;
        a.numberOfBeds=numberOfBeds;
        a.pricePerNight=pricePerNight;
        a.availability = new ArrayList<>(availability);
        return a;
    }
    public boolean isAvailable(Date date) {
        return availability.contains(date);

    }
//    public boolean reserve(Date date) {
//        if (isAvailable(date)) {
//            availability.remove(date);
//            return true;
//        }
//        return false;
//    }
    public boolean reserve(List<Date> dates) {
        for (Date date : dates) {
            if (!isAvailable(date)) {
                return false;
            }
        }
        for (Date date : dates) {
            availability.remove(date);
        }
        return true;
    }
    public void addAvailability(Date date) {
        if (!isAvailable(date)) {
            availability.add(date);
        }
    }
    public void removeAvailability(Date date) {
        availability.remove(date);
    }
}
