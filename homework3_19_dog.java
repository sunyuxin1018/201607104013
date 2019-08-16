package day03.com.syx3;

public class homework3_19_dog {
    private String color;
    private String breed;
    public void eat(){
        System.out.println(color+"色的"+breed+"正在啃骨头");
    }
    public void lookHome(){
        System.out.println(color+"色的"+breed+"正在看家");
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor() {
        return color;

    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
}
