package ua.hillelit.lms.javaproless34.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.hillelit.lms.javaproless34.model.Product;
import ua.hillelit.lms.javaproless34.model.ProductList;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link ProductConfig} is a class for creation and configuration {@link ProductList}.
 *
 * @author Dmytro Trotsenko on 02.01.2023
 */
@Configuration
public class ProductConfig {

    /**
     * Create new product list and add {@link Product}
     *
     * @return new {@link ProductList}
     */
    @Bean
    public ProductList products() {
        Map<Long, Product> products = new HashMap<>();
        products.put(0L, new Product(0L, "Milk", 40.0));
        products.put(1L, new Product(1L, "Bread", 18.50));
        products.put(2L, new Product(2L, "Coca-Cola", 50.0));
        products.put(3L, new Product(3L, "Sugar", 35.0));
        return new ProductList(products);
    }

}
