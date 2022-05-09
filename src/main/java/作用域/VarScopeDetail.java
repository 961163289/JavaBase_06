package 作用域;

public class VarScopeDetail {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.say();
    }
}

class Person {
    //细节: 属性可以加修饰符(public,protected,默认,private); 局部变量不能加修饰符
    public int age = 20;
    String name = "jack";

    public void say() {
        //细节: 属性和局部变量可以重名,访问时遵循就近原则
        String name = "King";
        System.out.println("say() name = " + name);
    }

    public void hi() {
        String address = "北京";
//        String address = "上海";//错误,重复定义变量
        String name = "hsp";//可以
    }
}

