package mk.ukim.finki.emt.accommodationlist.xport.rest;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.accommodationlist.domain.model.Accommodation;
import mk.ukim.finki.emt.accommodationlist.service.AccommodationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/accommodation")
@AllArgsConstructor
public class AccommodationSource {
    private final AccommodationService accommodationService;

    @GetMapping
    public List<Accommodation> getAll(){
        return accommodationService.getAll();
    }
}
