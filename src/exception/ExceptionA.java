package exception;

public class ExceptionA {
    public void show() throws ClassNotFoundException {
        Class.forName("helo");
    }
}
