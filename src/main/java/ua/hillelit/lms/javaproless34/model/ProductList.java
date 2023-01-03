package ua.hillelit.lms.javaproless34.model;

import lombok.Value;

import java.util.Map;

/**
 * {@link ProductList} is a class for storing a list of products.
 *
 * @author Dmytro Trotsenko on 02.01.2023
 */

@Value
public class ProductList {

    Map<Long, Product> products;

    /**
     * Getting the product by id.
     *
     * @param id product id
     * @return {@link Product} object
     */
    public Product getProduct(Long id) {
        return products.get(id);
    }
}
