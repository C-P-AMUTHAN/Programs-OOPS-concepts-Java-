import java.util.*;
import java.io.*;
class Dog{
    void barkingDog(){
        System.out.println("Dog barks");
    }
}
class SingleInheritance extends Dog{
    void roaringTiger(){
        System.out.println("Tiger roars");
    }
    public static void main(String[] args) {
        SingleInheritance t = new SingleInheritance();
        t.roaringTiger();
        t.barkingDog();
    }
}