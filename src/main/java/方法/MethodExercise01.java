package 方法;

public class MethodExercise01 {
    public static void main(String[] args) {

        AAA a = new AAA();

        int num = 15;
        if (a.isOdd(num)) {
            System.out.println(num + " 是奇数");
        } else {
            System.out.println(num + " 是偶数");
        }

        a.printArray(5, 4, '#');

    }
}

class AAA {
    //1)	编写类 AA ，有一个方法：判断一个数是奇数 odd 还是偶数,  返回 boolean
    //思路
    //1. 方法的返回类型 boolean
    //2. 方法的名字 isOdd
    //3. 方法的形参 (int num)
    //4. 方法体 , 判断
    public boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    //2)	根据行、列、字符打印 对应行数和列数的字符，比如：行：4，列：4，字符#,则打印相应的效果
    //思路
    //1. 方法的返回类型 void
    //2. 方法的名字 print
    //3. 方法的形参 (int row, int col, char c)
    //4. 方法体 , 循环
    public void printArray(int row, int col, char c) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }
}
