package lt.lessons.baltictalents.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "studentai")
@ToString
public class Studentas extends BaseEntity{

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String surname;

    @Getter
    @Setter
    @OneToMany(mappedBy="studentas")
    private List<Pazymys> pazymiai;

}