package lt.baltictalents.lessons910.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "roles")
@ToString
public class Role {
    @Id
    @Getter
    @Setter
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(
      name = "name", 
      columnDefinition = "ENUM('ADMIN','EDITOR', 'USER', 'ANONYMOUS')",
      nullable = false
    )
    @Getter
    @Setter
    private RoleName name;

    @ManyToMany(mappedBy = "roles")
    @Getter
    @Setter
    @JsonBackReference
    private Set<User> users;

    public enum RoleName {
        ADMIN,
        EDITOR,
        USER,
        ANONYMOUS
    }
}