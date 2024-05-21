package mk.ukim.finki.emt.accommodationlist.domain.repository;

import mk.ukim.finki.emt.accommodationlist.domain.model.Accommodation;
import mk.ukim.finki.emt.accommodationlist.domain.model.AccommodationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccommodationRepository extends JpaRepository<Accommodation, AccommodationId> {
}
