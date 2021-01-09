package creational.FactoryMethod;

/**
 * @author li bing
 * @version 1.0
 * @create 2021-01-06 19:53
 **/
public class ConcreteProductB implements Product {

    public ConcreteProductB() {
    }

    /**
     * 使用产品
     */
    public void use() {
        System.out.println("Product B is using!");
    }
}
