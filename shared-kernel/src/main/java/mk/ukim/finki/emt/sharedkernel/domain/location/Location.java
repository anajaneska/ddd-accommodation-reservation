package mk.ukim.finki.emt.sharedkernel.domain.location;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Location {
    private final String street;
    private final String city;
    private final String country;
    private final String zipCode;

    public Location(){
        this.street="";
        this.city="";
        this.country="";
        this.zipCode="";
    }

    public Location(String street, String city, String country, String zipCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }
}
