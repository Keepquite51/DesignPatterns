package creational.AbstractFactory;

/**
 * @author li bing
 * @version 1.0
 * @create 2021-01-13 21:46
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        // 代码段1：生产海尔空调，冰箱并使用
        Factory haier = new HaierFactory();
        AirConditioner hac = haier.produceAirConditioner();
        hac.attemper();
        Fridge hf = haier.produceFridge();
        hf.refrigerate();

        // 代码段2：生产美的空调，冰箱并使用
        Factory media = new MediaFactory();
        AirConditioner mac = media.produceAirConditioner();
        mac.attemper();
        Fridge mf = media.produceFridge();
        mf.refrigerate();

        /*
        观察1和2代码段，发现只有具体工厂名不同，生产和使用的代码都是一样的！
        想生产格力的只需要进行扩展对应的产品和工厂就好了，从这点看完全遵循开闭原则。
        不过抽象工厂模式的不足也很明显，如果美的现在又搞洗衣机了，就需要修改接口和所有的实现类，
        因此对于扩展一个新的产品等级来说，不遵循开闭原则
         */
    }
}
