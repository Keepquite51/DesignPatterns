package creational.AbstractFactory;

/**
 * 海尔工厂
 * @author li bing
 * @version 1.0
 * @create 2021-01-13 21:36
 **/
public class HaierFactory implements Factory{
    /**
     * 生产海尔空调
     * @return 海尔空调
     */
    @Override
    public AirConditioner produceAirConditioner() {
        return new HaierAirConditioner();
    }

    /**
     * 生产海尔冰箱
     * @return 海尔冰箱
     */
    @Override
    public Fridge produceFridge() {
        return new HaierFridge();
    }
}
