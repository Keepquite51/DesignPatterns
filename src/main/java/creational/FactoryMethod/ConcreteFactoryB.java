package creational.FactoryMethod;

/**
 * 专门生产商品B的工厂B
 *
 * @author li bing
 * @version 1.0
 * @create 2021-01-09 17:10
 **/
public class ConcreteFactoryB implements Factory {

    /**
     * 生产商品B
     * @return B型商品
     */
    public Product produce() {
        return new ConcreteProductB();
    }
}
