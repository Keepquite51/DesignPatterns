package creational.AbstractFactory;

/**
 * 海尔空调
 * @author li bing
 * @version 1.0
 * @create 2021-01-13 21:26
 **/
public class HaierAirConditioner implements AirConditioner{
    /**
     * 调节温度
     */
    @Override
    public void attemper() {
        System.out.println("海尔空调正在调节温度...");
    }
}
