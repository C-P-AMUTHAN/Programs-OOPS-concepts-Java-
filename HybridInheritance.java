class Tree{
    void shakes(){
        System.out.println("leaves");
    }
}
class Plant extends Tree{
    void root(){
        System.out.println("water saves");
    }
}
public class HybridInheritance extends Tree {
    void show(){
        System.out.println("showing details");
    }
    public static void main(String[] args) {
        HybridInheritance h = new HybridInheritance();
        h.show();
        h.shakes();
        Plant p = new Plant();
        p.root();
    }
}
