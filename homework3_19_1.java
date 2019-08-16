package day03.com.syx3;

public class homework3_19_1 {
    public static void main(String[] args) {
        homework3_19_cat ss = new homework3_19_cat();
        homework3_19_dog yy = new homework3_19_dog();
        ss.setColor("橘");
        ss.setBreed("橘猫");
        ss.eat();
        ss.catchMouse();
        yy.setColor("棕白");
        yy.setBreed("土狗笨笨");
        yy.eat();
        yy.lookHome();
    }
}
