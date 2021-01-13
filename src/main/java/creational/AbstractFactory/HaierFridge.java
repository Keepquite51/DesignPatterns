package creational.AbstractFactory;

/**
 * 海尔冰箱
 * @author li bing
 * @version 1.0
 * @create 2021-01-13 21:33
 **/
public class HaierFridge implements Fridge{
    /**
     * 冷藏
     */
    @Override
    public void refrigerate() {
        System.out.println("海尔冰箱冷藏中...");
    }
}
