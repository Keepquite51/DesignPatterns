package creational.AbstractFactory;

/**
 * 美的空调
 * @author li bing
 * @version 1.0
 * @create 2021-01-13 21:27
 **/
public class MediaAirConditioner implements AirConditioner{
    /**
     * 调节温度
     */
    @Override
    public void attemper() {
        System.out.println("美的空调正在调节温度...");
    }
}
