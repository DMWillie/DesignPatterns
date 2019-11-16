package start;

/*  Author: 北辰
    日期: 16/11/2019
    功能: 飞行行为的实现,给"不会"飞的鸭子用(包括橡皮鸭和诱饵鸭)
 */

public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("I can't fly");
    }
}
