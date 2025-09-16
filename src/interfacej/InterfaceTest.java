package interfacej;

public class InterfaceTest {
    public static void main(String[] args){
        interfaceA b = new InB();
        interfaceA a = new InA();
        b.show();
        a.show();

        InB b1 = new InB();
        b.show();
        System.out.println(b);
        System.out.println(a.age);

        FunctionalIn fi =new  FCIn();
        FunctionalIn fii = new FunctionalIn() {
            @Override
            public void show() {
                System.out.println("Xin chao anonymous");
            }
        };fii.show();

        FunctionalIn lambda = (/*para*/) -> System.out.println("Xin chao Lambda");
        lambda.show();

    }
}
