package LambdaAndFunctionalInterface.predicate_in_objects;

public class Employee {
    private int id;
    private String name;
    private String month;
    private String joiningYear;

    public Employee(int id, String name, String month, String joiningYear) {
        this.id = id;
        this.name = name;
        this.month = month;
        this.joiningYear = joiningYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonth() {
        return month;
    }

    public String getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(String joiningYear) {
        this.joiningYear = joiningYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", month='" + month + '\'' +
                ", joiningYear='" + joiningYear + '\'' +
                '}';
    }
}
