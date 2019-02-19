package lt.baltictalents.lesson4.dao;

import lombok.Getter;
import lombok.Setter;

public class Car {
    @Getter
    @Setter
    private String make;

    @Getter
    @Setter
    private String model;

    @Getter
    @Setter
    private String year;

    @Getter
    @Setter
    private String engine;
}
