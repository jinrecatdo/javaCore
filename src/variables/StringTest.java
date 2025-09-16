package variables;

public class StringTest {
    public static void main(String[] args){
        String st ="nam";
        st = "hello";
        System.out.println(st.charAt(1));

        StringBuffer sb = new StringBuffer("navin");
        sb.append(" Hello");
        sb.insert(0,"Hi ");
        sb.setLength(30);
        System.out.println(sb.length());

        String tsb = sb.toString();
        System.out.println(tsb);
    }
}
