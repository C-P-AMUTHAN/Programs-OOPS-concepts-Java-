class Circlemethods {
    double X,Y;
    double R;
    //method circumference
    double circumference(){
        return 3.14*2*R;
    }
    //method area
    public double area(){
        return 3.14*R*R;
    }
    //constructor
    Circlemethods(double X, double Y, double R){
        this.X = X;
        this.Y = Y;
        this.R = R;
    }
}
public class Circle{
    public static void main(String args[]){
        Circlemethods C = new Circlemethods(0.0,0.0,5);
        Circlemethods C1 = new Circlemethods(1,2,6);
        System.out.println("Circumference"+C.circumference());
        System.out.println("Area"+C.area());
        System.out.println("circumference 2"+C1.circumference());
        System.out.println("area 2"+C1.area());
    }
}