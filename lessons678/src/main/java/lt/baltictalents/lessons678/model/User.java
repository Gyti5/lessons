package lt.baltictalents.lessons678.model;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.ScriptAssert;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@ToString
@ScriptAssert(
    lang="javascript",
    script="_this.decryptedPassword === _this.passwordConfirm",
    message="must match",
    reportOn="decryptedPassword"
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @JsonDeserialize
    private Set<Role> roles;

    @Getter
    @Setter
    @OneToMany(mappedBy = "user")
    private Set<Cart> carts;
}
