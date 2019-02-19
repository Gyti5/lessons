package lt.baltictalents.lessons910.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lt.baltictalents.lessons910.model.Cart;
import lt.baltictalents.lessons910.model.Role;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "users")
@ToString
public class User {

    @Id
    @Getter
    @Setter
    private Long id;


    @NotBlank
    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    @JsonIgnore
    private String password;

    @Transient
    @Getter
    @Setter
    @JsonIgnore
    @NotBlank
    @Length(min = 4, max = 10)
    private String passwordConfirm;

    @NotBlank
    @Length(min = 4, max = 10)
    @Transient
    @JsonIgnore
    @Getter
    @Setter
    private String decryptedPassword;


    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    @Getter
    @Setter
    @JsonManagedReference
    private Set<Role> roles;

    @Getter
    @Setter
    @OneToMany(mappedBy="user")
    private Set<Cart> cart;
}

