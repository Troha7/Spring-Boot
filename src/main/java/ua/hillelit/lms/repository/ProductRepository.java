package ua.hillelit.lms.repository;

import lombok.Value;
import org.springframework.stereotype.Repository;
import ua.hillelit.lms.model.Product;
import ua.hillelit.lms.model.ProductList;

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
