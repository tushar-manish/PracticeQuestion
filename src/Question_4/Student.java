package Question_4;

public class Student {

    private String name;
    private int roll;
    private double cpi;

    public Student(String name, int roll, double cpi) {
        this.name = name;
        this.roll = roll;
        this.cpi = cpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", roll=" + roll +
                ", cpi=" + cpi +
                '\n';
    }
}
