package 作用域;

public class VarScope {
    public static void main(String[] args) {

    }
}

class Cat {

    //全局变量,也就是属性,作用域为整个整体 Cat类; cry eat 等方法使用属性
    //属性在定义时,可以直接赋值
    int age = 10;

    //全局变量(属性)可以不赋值,直接使用,因为有默认值
    double weight; //默认值是0.0

    public void hi() {
        //局部变量必须赋值后,才能使用,因为没有默认值
        int num = 1;
        String address = "北 京 的 猫";
        System.out.println("num = " + num);
        System.out.println("address = " + address);
        System.out.println("weight = " + weight);//属性
    }

    public void cry() {
        //1. 局部变量一般是指在成员方法中定义的变量
        //2. n 和 name 就是局部变量
        //3. n 和 name 的作用域在 cry 方法中
        int n = 10;
        String name = "jack";
        System.out.println("在 cry 中使用属性 age = " + age);
    }

    public void eat() {
        System.out.println("在 eat 中使用属性 age = " + age);
//        System.out.println("在 eat 中使用 cry 的变量 name = " + name);//错误
    }

}


