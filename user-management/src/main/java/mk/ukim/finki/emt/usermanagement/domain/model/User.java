package mk.ukim.finki.emt.usermanagement.domain.model;

import jakarta.persistence.Entity;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

@Entity
public class User extends AbstractEntity<UserId> {
    private String username;
    private String name;
    private String surname;
    private String email;
}
