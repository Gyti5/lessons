package lt.baltictalents.lesson2.app;

public class UserInfoBean {
    private String type = "";
    private String year = "";
    private String engine = "";
    private String make = "";

    private String power = "";

    UserInfoBean() {
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public String getyear() {
        return year;
    }

    void setyear(String year) {
        this.year = year;
    }

    public String getengine() {
        return engine;
    }

    void setengine(String engine) {
        this.engine = engine;
    }

    public String getmake() {
        return make;
    }

    void setmake(String make) {
        this.make = make;
    }

    public String getpower() {
        return power;
    }

    void setpower(String power) {
        this.power = power;
    }
}
