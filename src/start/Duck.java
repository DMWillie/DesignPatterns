package start;

/*  Author: 北辰
    日期: 16/11/2019
    功能: Duck抽象类,所有鸭子的父类,具备飞行和会叫的两种行为
 */

public abstract class Duck {

    //为行为接口类型声明两个引用变量,所有的鸭子子类都继承它们
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){
    }

    public abstract void display();

    /**委托给行为类*/
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    //鸭子类的公共行为
    public void swim(){
       System.out.println("All ducks float, even decoys!");
    }
}
