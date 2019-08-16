package day03.com.syx3;

public class homework3_21_phone {
    private String brand;
    private String price;
    public void call(){
        System.out.println("羡羡正在使用价格为"+price+"元的"+brand+"品牌的手机开心的给孙育新打电话");
    }
    public void sendMessage(){
        System.out.println("羡羡正在使用价格为"+price+"元的"+brand+"品牌的手机疯狂的给孙育新发短信");
    }
    public void playGame(){
        System.out.println("羡羡正在使用价格为"+price+"元的"+brand+"品牌的手机愉快的陪孙育新玩游戏");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }
}
