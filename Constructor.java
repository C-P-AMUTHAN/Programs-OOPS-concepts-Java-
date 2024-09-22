class Help{
    Help(){
        this(8,2.3);
        System.out.println("parent class No argument");
    }
    Help(int a, double b){
        System.out.println("parent class two argument");
    }
}
public class Constructor extends Help{
    Constructor(){
        this(9);
        System.out.println("subclass No argument");
    }
    Constructor(int x){
        System.out.println("subclass one argument");
    }
    public static void main(String[] args) {
        Constructor c = new Constructor();
    }
}
