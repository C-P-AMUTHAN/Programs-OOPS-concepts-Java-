class Dog{
    void barkingDog(){
        System.out.println("parent class method");
    }
}
public class MethodOverriding extends Dog{
    void barkingDog(){
        System.out.println("sub class method, Method overrided");
    }
    public static void main(String[] args) {
        MethodOverriding m = new MethodOverriding();
        m.barkingDog();
    }
}
