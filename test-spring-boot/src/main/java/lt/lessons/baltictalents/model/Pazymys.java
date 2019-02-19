package lt.lessons.baltictalents.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "Pazymiai")
@ToString
public class Pazymys extends BaseEntity {


    @Getter
    @Setter
    private String type;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private String course;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name="studentas_id")
    private Studentas student;

}