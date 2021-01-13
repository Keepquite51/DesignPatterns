package creational.AbstractFactory;

/**
 * 美的工厂
 * @author li bing
 * @version 1.0
 * @create 2021-01-13 21:44
 **/
public class MediaFactory implements Factory{
    /**
     * 生产美的空调
     * @return 美的空调
     */
    @Override
    public AirConditioner produceAirConditioner() {
        return new MediaAirConditioner();
    }

    /**
     * 生产美的冰箱
     * @return 美的冰箱
     */
    @Override
    public Fridge produceFridge() {
        return new MediaFridge();
    }
}
