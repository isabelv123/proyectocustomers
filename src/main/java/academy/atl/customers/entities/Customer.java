package academy.atl.customers.entities;

import lombok.*;

import java.util.Objects;

// @Data para crear los getter and setter, AllArgsconstructor, NoAllContructor, ToString, equals y hascode
// @Builder patron de diseño

@Setter
@Getter @AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode


public class Customer {

    private Integer id;

    private String firstname;

    private String lastname;

    private String email;

    private String address;


}
