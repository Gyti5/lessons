package lt.baltictalents.lessons678.model;


import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "items")
@ToString

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @Column(columnDefinition = "TEXT")
    private String description;

    @Getter
    @Setter
    private float price;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(
            name = "cart_id",
            nullable = false
    )

    private Cart cart;
}
