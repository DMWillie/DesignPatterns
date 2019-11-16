package start;

/*  Author: 北辰
    日期: 16/11/2019
    功能: 测试鸭子类的行为
 */

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        /*这会调用MallardDuck继承来的performQuack()方法,进而委托给该对象的
        QuackBehavior对象处理(也就是说,调用继承来的quackBehavior引用对象的quack()
         */
        mallard.performQuack();
        mallard.performFly();
    }
}
