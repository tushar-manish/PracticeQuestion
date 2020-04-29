package Question_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmpMain {
    public static void main(String[] args) {

        EmpCollection obj = new EmpCollection(5);

        obj.insert(new Employee("Tushar",100,5000000,2.0f));
        obj.insert(new Employee("Harsh",101,500000,3.0f));
        obj.insert(new Employee("Aaditya",102,4500000,2.2f));
        obj.insert(new Employee("Chirag",103,300000,8.5f));
        obj.insert(new Employee("Madhav",104,40000,1.4f));

        obj.display();



    }
}
