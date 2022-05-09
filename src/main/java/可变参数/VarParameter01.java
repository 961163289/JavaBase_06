package 可变参数;

public class VarParameter01 {
    public static void main(String[] args) {
        HspMethod m = new HspMethod();
        System.out.println("和 = " + m.sum(1, 5, 100)); //106
        System.out.println("和 = " + m.sum(1, 19));     //20
    }
}

class HspMethod {

    //老韩解读
    //1. int... 表示接受的是可变参数，类型是 int ,即可以接收多个 int(0-多)
    //2. 使用可变参数时，可以当做数组来使用 即 nums 可以当做数组
    //3. 遍历 nums 求和即可
    public int sum(int... nums) {
//        System.out.println("接收的参数个数 = " + nums.length);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}


