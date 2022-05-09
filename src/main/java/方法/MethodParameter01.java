package 方法;

public class MethodParameter01 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        BB obj = new BB();
        obj.swap(a, b);//调用 swap

        System.out.println("\nmain方法\na = " + a + ", b = " + b);

        //结论: 基本数据类型,传递的是值(值拷贝),形参的任何改变不影响实参!
    }
}

class BB {
    public void swap(int a, int b) {
        System.out.println("\na和b交换前的值\na = " + a + ", b = " + b);
        //完成了 a 和 b 的交换
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("\na和b交换后的值\na = " + a + ", b = " + b);
    }
}
