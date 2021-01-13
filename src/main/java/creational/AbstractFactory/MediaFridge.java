package creational.AbstractFactory;

/**
 * 美的冰箱
 * @author li bing
 * @version 1.0
 * @create 2021-01-13 21:34
 **/
public class MediaFridge implements Fridge{
    /**
     * 冷藏
     */
    @Override
    public void refrigerate() {
        System.out.println("美的冰箱冷藏中...");
    }
}
