package 构造方法;

public class ConstructorDetail {
    public static void main(String[] args) {
        Person1 p1 = new Person1("king", 40);//第 1 个构造器
        Person1 p2 = new Person1("tom");//第 2 个构造器

        Dog dog = new Dog();//使用的是默认的无参构造器
    }
}

class Dog {
    String name;
    //如果程序员没有定义构造器,系统会自动给类生成一个默认无参构造器(也叫默认构造器)
    //一旦定义了自己的构造器,默认的构造器就覆盖了,就不能再使用默认的无参构造器
    //除非显式的定义一下,即 Dog(){} 写(这点很重要)

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {//显式的定义一下,无参构造器
    }
}

class Person1 {
    String name;
    int age;//默认 0

    //第 1 个构造器
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //第 2 个构造器,  只指定人名，不需要指定年龄
    public Person1(String name) {
        this.name = name;
    }
}
