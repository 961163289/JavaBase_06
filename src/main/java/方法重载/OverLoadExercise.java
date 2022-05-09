package 方法重载;

public class OverLoadExercise {
    public static void main(String[] args) {

        //在主类的 main ()方法中分别用参数区别调用三个方法
        Methods method = new Methods();
        method.m(10); //100
        method.m(10, 20);//200
        method.m("韩顺平教育 hello");//字符串信息

        //测试
        System.out.println(method.max(10, 24)); // 24
        System.out.println(method.max(10.0, 21.4)); // 21.4
        System.out.println(method.max(10.0, 1.4, 30.0)); // 30.0
        System.out.println(method.max(10.0, 1.4, 30));   // 30.0

    }
}

/*
编写程序，类 Methods 中定义三个重载方法并调用。方法名为 m。
三个方法分别接收一个 int 参数、两个 int 参数、一个字符串参数。
分别执行平方运算并输出结果， 相乘并输出结果，输出字符串信息。
在主类的 main ()方法中分别用参数区别调用三个方法
*/

/*
定义三个重载方法 max()
第一个方法, 返回两个 int 值中的最大值
第二个方法, 返回两个 double 值中的最大值
第三个方法, 返回三个 double 值中的最大值
*/

class Methods {

    public int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2, double n3) {
        System.out.println("max(double n1, double n2, double n3)");
        double max = n1 > n2 ? n1 : n2;
        return max > n3 ? max : n3;
    }

    public double max(double n1, double n2, int n3) {
        System.out.println("max(double n1, double n2, int n3)");
        double max1 = n1 > n2 ? n1 : n2;
        return max1 > n3 ? max1 : n3;
    }


    public void m(int n) {
        System.out.println("平方 = " + (n * n));
    }

    public void m(int n1, int n2) {
        System.out.println("相乘 = " + (n1 * n2));
    }

    public void m(String str) {
        System.out.println("传入的 str = " + str);
    }
}