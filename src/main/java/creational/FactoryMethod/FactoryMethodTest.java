package creational.FactoryMethod;

/**
 * 测试工厂方法模式
 *
 * @author li bing
 * @version 1.0
 * @create 2021-01-09 18:29
 **/
public class FactoryMethodTest {
    public static void main(String[] args) {
        Product pa = new ConcreteFactoryA().produce();
        pa.use();

        Product pb = new ConcreteFactoryB().produce();
        pb.use();
    }
}
