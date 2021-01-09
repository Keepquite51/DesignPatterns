package creational.SimpleFactory;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * @author li bing
 * @version 1.0
 * @create 2021-01-05 23:04
 **/
public class Factory {

    /** 配置文件 */
    private static final String CONFIG_FILE_PRODUCTS = "properties/products.properties";

    /**
     * 根据型号生产商品
     * @param productName 产品名
     * @return 具体产品
     */
    public static Product produce(String productName)
            throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        // 读取配置文件，获取所有可生产产品型号
        String path = Product.class.getClassLoader()
                .getResource("src/main/resources/properties/products.properties").getPath();
        File file = new File(path);
        InputStream in = new FileInputStream(file);
        Properties properties  = new Properties();
        properties.load(in);

        List<String> nameList = Arrays.asList(properties.getProperty("allProducts").split(","));
        if (nameList.contains(productName)){
            // 利用反射来动态生产
            Class<?> clazz = Class.forName(productName);
            return (Product) clazz.newInstance();
        }
        else {
            System.out.println("抱歉，尚无法生产此产品：" + productName);
            return null;
        }
    }
}
