package Question_3;

public class EmpCollection {
    Employee employee[];
    int top,size;

    public EmpCollection(int size){
        employee = new Employee[size];
        top = 0;
        this.size = size;
    }

    public void insert(Employee emp){
        if (top<size){

            employee[top++] = emp;

            for(int i=top-1;i>0;i--){
                if(employee[i].getSalary()<employee[i-1].getSalary()){
                    Employee temp = employee[i];
                    employee[i] = employee[i-1];
                    employee[i-1] = temp;
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
            System.out.println(employee[i]);
        }
    }


}
