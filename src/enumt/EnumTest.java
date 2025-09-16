package enumt;

public class EnumTest {
    public static void main(String[] args){

        EnumLaptop el = EnumLaptop.Macbook;
        System.out.println(el + " : " + el.getPrice());

        for (EnumLaptop e : EnumLaptop.values()){
            System.out.println(e + " : " + e.getPrice());
        }
    }

}
