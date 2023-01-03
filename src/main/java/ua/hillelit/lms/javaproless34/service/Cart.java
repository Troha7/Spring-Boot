package ua.hillelit.lms.javaproless34.service;

import lombok.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ua.hillelit.lms.javaproless34.ProductRepository;
import ua.hillelit.lms.javaproless34.model.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link Cart} is a class for storing a list of products for this cart,
 * and for adding and removing products from the cart.
 *
 * @author Dmytro Trotsenko on 02.01.2023
 */

@Value
@Service
@Scope("prototype")
public class Cart {

    ProductRepository productRepository;
    Map<Long, Product> products = new HashMap<>();

    /**
     * Adding product to the cart.
     *
     * @param id id product id
     */
    public void addProduct(Long id) {
        products.put(id, productRepository.getProduct(id));
    }

    /**
     * Removing the product from the cart.
     *
     * @param id product id
     */
    public void removeProduct(Long id) {
        products.remove(id, productRepository.getProduct(id));
    }

}
