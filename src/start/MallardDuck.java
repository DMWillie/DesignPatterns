package start;

/*  Author: 北辰
    日期: 16/11/2019
    功能: 绿头鸭类,具备呱呱叫和会飞的行为,使用面向接口编程的设计模式
 */

public class MallardDuck extends Duck {

    public MallardDuck(){
        //使用Quack类处理呱呱叫,当performQuack()被调用时,叫的职责被委托给Quack对象
                    //从而我们得到了呱呱叫
        quackBehavior = new Quack();
        //使用FlyWithWings作为其FlyBehavior类型
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard Duck");
    }
}
