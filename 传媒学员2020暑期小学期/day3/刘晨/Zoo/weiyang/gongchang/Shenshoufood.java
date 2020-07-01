package Zoo.weiyang.gongchang;

public class Shenshoufood extends Factory {
    public Shenshoufood()
    {
        this.factoryfood = "鸭子企鹅";
    }
    public void feedfood() {
        System.out.println("神兽吃了" + this.factoryfood);
    }
}
