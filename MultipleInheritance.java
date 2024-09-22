interface king{
    abstract void queen();
    void decisionMaker();
    public abstract void fighter();
}
interface Queen{
    void kingMaker();
}
public class MultipleInheritance implements king, Queen{
    public void queen(){
        System.out.println("king's queen");
    }
    public void decisionMaker(){
        System.out.println("King will order");
    }
    public void fighter(){
        System.out.println("Martial Arts");
    }
    public void kingMaker(){
        System.out.println("I am the real king");
    }
    public static void main(String[] args) {
        MultipleInheritance a = new MultipleInheritance();
        a.queen();
        a.decisionMaker();
        a.fighter();
        a.kingMaker();
    }
}
