package 类与对象;

public class Object03 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "小明";
        Person p2 = p1; //把 p1 赋给了 p2, 让 p2 指向 p1
        p1.age = 80;
        System.out.println(p2.age);//80

//        Person a = new Person();
//        a.age = 10;
//        a.name = "小明";
//        Person b = a;
//        System.out.println(b.name);//小明
//        b.age = 200;
//        b = null;
//        System.out.println(a.age); //200
//        System.out.println(b.age); //NullPointerException
    }
}


