package 包装一个狗类;


/*

题目
    抽象形成一个小狗类Dog
    属性：名字name 年龄age 品种kind 主人host 价格price
    功能：
        1)跑run：无参，打印：小狗Dog跑的老快了~
        2)吃eat：参数int n，打印：小狗今晚要吃n根肉骨头
        3)睡觉sleep：参数double num，打印：小狗睡了num个小时
        4)玩play：参数String host，返回值 String “飞盘”， 打印：小狗与主人host玩的很开心
        5)叫bark：打印：小狗喜欢汪汪叫，封装此方法，玩play()的时候才bark()
*/
public class Dog {
    private String name;
    private int age;
    private String kind;
    private String host;
    private float price;

    public static void main(String[] args) {
        Dog dog = new Dog("小黄", 2, "金毛", "阿泰", 1280);
        dog.run();
        dog.eat(3);
        dog.sleep(6);
        dog.play();
    }

    public Dog(String name, int age, String kind, String host, float price) {
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.host = host;
        this.price = price;
    }

    public void run() {
        System.out.println("小狗"+this.name+"跑的老快了~");
    }
    public void eat(int num) {
        System.out.println("小狗今晚要吃"+num+"根肉骨头");
    }
    public void sleep(float time) {
        System.out.println("小狗睡了"+time+"个小时");
    }
    public void play() {
        System.out.println("小狗与主人"+this.host+"玩的很开心");
        this.bark();
    }
    public void bark() {
        System.out.println("小狗喜欢汪汪叫");
    }
}
