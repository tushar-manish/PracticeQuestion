package Question_4;


public class StudentSort {
    Student student[];
    int top,size;

    public StudentSort(int size){
        student = new Student[size];
        top = 0;
        this.size = size;
    }

    public void insert(Student emp){
        if (top<size){

            student[top++] = emp;

            for(int i=top-1;i>0;i--){
                if(student[i].getCpi()<student[i-1].getCpi()){
                    Student temp = student[i];
                    student[i] = student[i-1];
                    student[i-1] = temp;
                }
                else{
                    break;
                }
            }
        }
        else{
            System.out.println("Overflow");
        }
    }

    public void display(){
        for (int i= 0;i<top;i++){
            System.out.println(student[i]);
        }
    }
}
