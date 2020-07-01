package Zoo.weiyang;

import Zoo.weiyang.gongchang.Factory;
import Zoo.weiyang.gongchang.Qiefood;
import Zoo.weiyang.gongchang.Shenshoufood;
import Zoo.weiyang.gongchang.Yazifood;

public class Weiyang {
    public  Factory goFactory(String operateString) {
        if (operateString == null) {
            return null;
        }
        if (operateString.equals("企鹅")) {
            return new Qiefood();
        }
        if (operateString.equals("鸭子")) {
            return new Yazifood();
        }
        if (operateString.equals("神兽")) {
            return new Shenshoufood();
        }
        return null;
    }
}
