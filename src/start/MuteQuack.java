package start;

/*  Author: 北辰
    日期: 16/11/2019
    功能: 给"不会叫"的鸭子用
 */

public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<< Silence >>");
    }
}
