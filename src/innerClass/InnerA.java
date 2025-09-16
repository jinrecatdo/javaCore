package innerClass;

public class InnerA {
    int age;

    public void show() {
        System.out.println("Hi A");
    }

    class C {
        public void show() {
            System.out.println("Hi C");
        }
    }

    static class D {
        public void show() {
            System.out.println("Hi D");
        }
    }
}
