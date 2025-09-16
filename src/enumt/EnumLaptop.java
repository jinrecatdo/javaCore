package enumt;

public enum  EnumLaptop {
    Macbook(2000),Dell,ThinkPad(1800);
    private int price;

    EnumLaptop() {
        price = 1000;
    }

    private EnumLaptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
