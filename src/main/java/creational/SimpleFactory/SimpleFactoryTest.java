package creational.SimpleFactory;

import java.io.IOException;

/**
 * @author li bing
 * @version 1.0
 * @create 2021-01-06 20:06
 **/
public class SimpleFactoryTest {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, IOException {
        // 使用工厂生产商品A
        Product pa = Factory.produce("ConcreteProductA");
        if (null != pa){
            pa.use();
        }

        // 使用工厂生产商品B
        Product pb = Factory.produce("ConcreteProductB");
        if (null != pb){
            pb.use();
        }

        // 使用工厂生产商品C
        Product pc = Factory.produce("ConcreteProductC");
        if (null != pc){
            pc.use();
        }



    }
}
