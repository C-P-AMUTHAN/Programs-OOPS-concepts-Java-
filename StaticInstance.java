public class StaticInstance {
    static int circlecount = 0;//static variable(class variable)
    public double x,y,r;//instance variable
    //constructors
    public StaticInstance(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
        circlecount++;
    }
    public StaticInstance(double r){
        this(0.0,0.0,r);
        circlecount++;
    }
    //methods
    public double circumference(){
        return 3.14*2*r;
    }
    public double area(){
        return 3.14*r*r;
    }
    //static block
    static {
        System.out.println("Static block");
       
    }
    public static void main(String args[]){
        //object creation
        StaticInstance c1 = new StaticInstance(0,0,0);
        StaticInstance c2 = new StaticInstance(5);
        StaticInstance c3= new StaticInstance(9,8,7);
        System.out.println("circumference "+c1.circumference()+" area "+c2.area()+" circumference "+c3.circumference());
        //static variable is accessed using class name
        System.out.println("objects "+StaticInstance.circlecount);
    }

}
