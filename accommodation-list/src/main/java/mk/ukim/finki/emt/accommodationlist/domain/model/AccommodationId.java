package mk.ukim.finki.emt.accommodationlist.domain.model;

import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class AccommodationId extends DomainObjectId {
    private AccommodationId() {
        super(AccommodationId.randomId(AccommodationId.class).getId());
    }

    public AccommodationId(@NonNull String uuid) {
        super(uuid);
    }

    public static AccommodationId of(String uuid) {
        AccommodationId p = new AccommodationId(uuid);
        return p;
    }
}
