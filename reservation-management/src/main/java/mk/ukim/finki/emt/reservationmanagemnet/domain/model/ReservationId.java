package mk.ukim.finki.emt.reservationmanagemnet.domain.model;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class ReservationId extends DomainObjectId {
    private ReservationId() {
        super(ReservationId.randomId(ReservationId.class).getId());
    }
}
