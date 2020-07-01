package Zoo.weiyang.gongchang;

public class Qiefood extends Factory {
    public Qiefood()
    {
        this.factoryfood = "鱼肉";
    }

    public void feedfood() {
        System.out.println("企鹅吃了" + this.factoryfood);
    }
}
