package day03.com.syx3;

public class homework3_16_1 {
    public static void main(String[] args) {
        homework3_16 qwe = new homework3_16();
        qwe.setBianhao("123456");
        qwe.setName("张三");
        qwe.setNianling(18);
        qwe.setShengao(179.23);
        qwe.setXingbie("男");
        System.out.println(qwe.getName()+"   编号为："+qwe.getBianhao()+"  年龄为："+qwe.getNianling()+"   性别为："+qwe.getXingbie()+"  身高为："+qwe.getShengao());

    }
}
