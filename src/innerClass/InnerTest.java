package innerClass;

public class InnerTest {
    public static void main(String[] args){
        InnerA a = new InnerA();
        a.show();
        InnerA.C c = a. new C();
        c.show();
        InnerA.D d = new InnerA.D();
        d.show();
        InnerA aa = new InnerA(){
            public void show(){
                System.out.println("hhihihi");
            }
        };
        aa.show();
    }
}
