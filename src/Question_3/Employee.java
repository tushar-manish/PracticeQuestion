package Question_3;

public class Employee {
    private String name;
    private int empid;
    private int salary;
    private float experience;

    public Employee(String name, int empid, int salary, float experience) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", empid=" + empid +
                ", salary=" + salary +
                ", experience=" + experience +
                '\n';
    }
}
