public class MethodOverloading {
    public void add(int a){
        System.out.println(a+5);
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(double a, double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        MethodOverloading m1=new MethodOverloading();
        m1.add(5);
        m1.add(8,4);
        m1.add(6.4,7.8);
    }
}
