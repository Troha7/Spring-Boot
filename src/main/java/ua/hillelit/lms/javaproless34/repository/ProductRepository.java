package ua.hillelit.lms.javaproless34.repository;

import lombok.Value;
import org.springframework.stereotype.Repository;
import ua.hillelit.lms.javaproless34.model.Product;
import ua.hillelit.lms.javaproless34.model.ProductList;

/**
 * {@link ProductRepository} is a class for getting products from the {@link ProductList}.
 *
 * @author Dmytro Trotsenko on 03.01.2023
 */
@Value
@Repository
public class ProductRepository {
    ProductList products;

/**
 * Getting the product by id.
 *
 * @param id product id
 * @return {@link Product} object
 */
    public Product getProduct(Long id) {
        return products.getProduct(id);
    }

}
