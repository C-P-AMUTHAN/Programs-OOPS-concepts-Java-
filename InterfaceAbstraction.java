interface king{
    abstract void queen();
    void decisionMaker();
    public abstract void fighter();
}
public class InterfaceAbstraction implements king{
    public void queen(){
        System.out.println("king's queen");
    }
    public void decisionMaker(){
        System.out.println("King will order");
    }
    public void fighter(){
        System.out.println("Martial Arts");
    }
    public static void main(String[] args) {
        InterfaceAbstraction a = new InterfaceAbstraction();
        a.queen();
        a.decisionMaker();
        a.fighter();
    }
}
