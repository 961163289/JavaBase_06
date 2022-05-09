package 方法递归;

public class Recursion01 {
    public static void main(String[] args) {
        T t1 = new T();
        t1.test(4);//输出什么? n=2 n=3 n=4
        int num = 5;
        int res = t1.factorial(num);
        System.out.println("\n" + num + "的阶乘 = " + res);
    }
}

class T {
    public void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.print("n=" + n + " ");
    }

    //factorial 阶乘
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
