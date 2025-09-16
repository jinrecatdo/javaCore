package abstractEx;

public class abtractTest {
    public static void main(String[] args){
        BMWCar c = new BMWCar();
        c.drive();
        Car a = new Car() {

            public void drive() {
                System.out.println("anonymous ");
            }
        };
        a.drive();
    }
}
