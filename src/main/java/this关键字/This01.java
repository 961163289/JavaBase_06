package this关键字;

public class This01 {
    public static void main(String[] args) {

        Dog dog1 = new Dog("大壮", 3);
        System.out.println("dog1 的 hashcode=" + dog1.hashCode());
        //dog1 调用了 info()方法
        dog1.info();

        System.out.println("====================================");

        Dog dog2 = new Dog("大黄", 2);
        System.out.println("dog2 的 hashcode=" + dog2.hashCode());
        dog2.info();

    }
}

class Dog {
    String name;
    int age;

//    public Dog(String dName, int dAge) {//构造器
//        name = dName;
//        age = dAge;
//    }

    //如果我们构造器的形参, 能够直接写成属性名,就更好了
    //但是出现了一个问题, 根据变量的作用域原则
    //构造器的 name 是局部变量, 而不是属性
    //构造器的 age 是局部变量, 而不是属性
    //==> 引出 this 关键字来解决

    public Dog(String name, int age) {//构造器
        //this.name 就是当前对象的属性 name
        this.name = name;
        //this.age 就是当前对象的属性 age
        this.age = age;
        System.out.println("Dog构造器 this.hashCode() = " + this.hashCode());
    }

    public void info() {//成员方法,输出属性 x 信息
        System.out.println("info() this.hashCode() = " + this.hashCode());
        System.out.println(name + "\t" + age);
    }
}
