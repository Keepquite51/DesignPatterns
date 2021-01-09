package creational.FactoryMethod;

/**
 * 专门生产商品A的工厂A
 *
 * @author li bing
 * @version 1.0
 * @create 2021-01-09 17:07
 **/
public class ConcreteFactoryA implements Factory {

    /**
     * 生产商品A
     * @return A型商品
     */
    public Product produce() {
        return new ConcreteProductA();
    }
}
