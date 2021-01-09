package creational.FactoryMethod;

/**
 * @author li bing
 * @version 1.0
 * @create 2021-01-09 16:55
 **/
public interface Factory {

    /**
     *抽象方法：生产商品
     * @return 商品
     */
    Product produce();

}
