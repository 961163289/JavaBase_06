package 方法重载;

public class OverLoad01 {
    public static void main(String[] args) {

        /*
        方法重载
        注意事项和使用细节:
            1) 方法名: 必须相同
            2) 形参列表: 必须不同 (形参类型或个数或顺序,至少有一样不同,参数名无要求)
            3) 返回类型: 无要求
        */

//        System.out.println(100);
//        System.out.println("hello,world");
//        System.out.println('h');
//        System.out.println(1.1);
//        System.out.println(true);

        MyCalculator mc = new MyCalculator();
        System.out.println(mc.calculate(1, 2));
        System.out.println(mc.calculate(1.1, 2));
        System.out.println(mc.calculate(1, 2.1));
        System.out.println(mc.calculate(1, 2, 3));

    }
}


class MyCalculator {
    //两个Int的和
    public int calculate(int n1, int n2) {
        System.out.println("calculate(int n1, int n2) 被调用");
        return n1 + n2;
    }

    //没有构成方法重载, 仍然是错误的，因为是方法的重复定义
//    public void calculate(int n1, int n2) {
//        System.out.println("calculate(int n1, int n2) 被调用");
//        int res = n1 + n2;
//    }

    //看看下面是否构成重载, 没有构成，而是方法的重复定义,就错了
//    public int calculate(int a1, int a2) {
//        System.out.println("calculate(int a1, int a2) 被调用");
//        return a1 + a2;
//    }


    //一个Int, 一个Double的和
    public double calculate(int n1, double n2) {
        System.out.println("calculate(int n1, double n2) 被调用");
        return n1 + n2;
    }

    //一个double, 一个Int的和
    public double calculate(double n1, int n2) {
        System.out.println("calculate(double n1, int n2) 被调用");
        return n1 + n2;
    }

    //三个Int的和
    public int calculate(int n1, int n2, int n3) {
        System.out.println("calculate(int n1, int n2, int n3) 被调用");
        return n1 + n2 + n3;
    }
}



