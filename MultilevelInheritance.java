class Student{
    void displayRecord(){
        System.out.println("RajKumar - CSE department");
    }
}
class Department extends Student{
    void order(){
        System.out.println("Strict Department");
    }
}
public class MultilevelInheritance extends Department {
    void standard(){
        System.out.println("Average level college");
    }
    public static void main(String[] args) {
        MultilevelInheritance m = new MultilevelInheritance();
        m.displayRecord();
        m.order();
        m.standard();
    }
}
