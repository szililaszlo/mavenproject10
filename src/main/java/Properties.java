public class Properties {
    String age;
    String salary;

    public Properties() {

    }

    public Properties(String age, String salary) {
        this.age = age;
        this.salary = salary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "age='" + age + '\'' +
                ", sallary='" + salary + '\'' +
                '}';
    }
}
