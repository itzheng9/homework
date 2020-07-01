package Zoo.weiyang.gongchang;

public class Yazifood extends Factory{
    public Yazifood()
    {
        this.factoryfood = "鱼肉";
    }

    public void feedfood() {
        System.out.println("鸭子吃了" +  this.factoryfood);
    }
}
