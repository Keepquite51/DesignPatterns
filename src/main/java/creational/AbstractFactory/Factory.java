package creational.AbstractFactory;

/**
 * 工厂接口
 * @author li bing
 * @version 1.0
 * @create 2021-01-13 21:29
 **/
public interface Factory {

    /**
     * 生产空调
     */
    AirConditioner produceAirConditioner();

    /**
     * 生产冰箱
     */
    Fridge produceFridge();

}
