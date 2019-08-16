package day03.com.syx3;

public class homework3_18_Student {
    private String name;
    private String age;
    private String content;

    public void eat(){
        System.out.println("年龄为"+age+"的"+name+"同学正在吃饭...");
    }
    public void lisen(){
        System.out.println("年龄为"+age+"的"+name+"同学正在专心致志的听课...");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public String getAge(){
        return age;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return content;
    }
}
