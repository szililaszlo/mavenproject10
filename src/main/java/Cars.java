import java.util.ArrayList;

public class Cars {
    private String name;
    private ArrayList<String> models;

    public Cars() {

    }

    public Cars(String name, ArrayList<String> models) {

        this.name = name;
        this.models = models;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", models=" + models +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getModels() {
        return models;
    }

    public void setModels(ArrayList<String> models) {
        this.models = models;
    }



}
