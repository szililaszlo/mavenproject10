import java.util.ArrayList;

public class PersonCar {
    private String name;
    private Integer age;
    private ArrayList<Cars> cars;

    public PersonCar() {

    }

    public PersonCar(String name, Integer age, ArrayList<Cars> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ArrayList<Cars> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Cars> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "PersonCar{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
