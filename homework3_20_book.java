package day03.com.syx3;

public class homework3_20_book {
    private String bianhao;
    private String shuming;
    private String jiage;
    public void shuchu(){
        System.out.println("图书编号:"+bianhao+"\t"+"书名:"+shuming+"\t"+"价格:"+jiage);
    }
    public void setBianhao(String bianhao){
        this.bianhao = bianhao ;
    }
    public String getBianhao(){
        return bianhao ;
    }
    public void setShuming(String shuming){
        this.shuming = shuming ;
    }
    public String getShuming(){
        return shuming;
    }
    public void setJiage(String jiage){
        this.jiage = jiage;
    }
    public String getJiage(){
        return jiage ;
    }
}
