abstract class king{
    void queen(){
        System.out.println("king's queen");
    }
    abstract void decisionMaker();
    public abstract void fighter();
}
public class Abstraction extends king{
    void decisionMaker(){
        System.out.println("King will order");
    }
    public void fighter(){
        System.out.println("Martial Arts");
    }
    public static void main(String[] args) {
        Abstraction a = new Abstraction();
        a.queen();
        a.decisionMaker();
        a.fighter();
    }
}