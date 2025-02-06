package fr.estia.account;

import jakarta.persistence.Entity;
import lombok.*;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Customer {
 private Long id;
 private String firstName;
 private String lastName;
 private String email;
}
