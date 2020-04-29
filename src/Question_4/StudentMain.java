package Question_4;


public class StudentMain {
    public static void main(String[] args) {
        
        StudentSort obj = new StudentSort(5);


        obj.insert(new Student("Tushar",1,9.2));
        obj.insert(new Student("Harsh",2,8.0));
        obj.insert(new Student("Aaditya",3,7));
        obj.insert(new Student("Chirag",4,9.5));
        obj.insert(new Student("Madhav",5,9.4));
        obj.display();
    }
}
