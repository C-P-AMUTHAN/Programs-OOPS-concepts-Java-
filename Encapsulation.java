class Sample{
    private int mark;
    void setMark(int mark){
        this.mark=mark;
    }
    void getMark(){
        System.out.println(mark);
    }
}
public class Encapsulation extends Sample{
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setMark(93);
        e.getMark();
        Encapsulation e1 = new Encapsulation();
        e1.setMark(56);
        e1.getMark();
    }
}
