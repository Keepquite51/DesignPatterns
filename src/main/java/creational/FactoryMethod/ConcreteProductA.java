package creational.FactoryMethod;

/**
 * @author li bing
 * @version 1.0
 * @create 2021-01-06 19:51
 **/
public class ConcreteProductA implements Product {

    public ConcreteProductA() {
    }

    public void use() {
        System.out.println("Product A is using!");
    }
}
