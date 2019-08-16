package day03.com.syx3;

public class homework3_18_Teacher {
    private String name;
    private String age;
    private String content;
    public void eat(){
        System.out.println("年龄为"+age+"的"+name+"老师正在吃饭...");
    }
    public void tell(){
        System.out.println("年龄为"+age+"的"+name+"老师正在慷慨激昂的讲课...");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public String getAge() {
        return age;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent() {
        return content;
    }
}
