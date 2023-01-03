package ua.hillelit.lms.javaproless34;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import ua.hillelit.lms.javaproless34.service.Cart;


@SpringBootApplication
public class JavaProLess34Application {

    @Autowired
    private Cart cart1;
    @Autowired
    private Cart cart2;

    public static void main(String[] args) {
        SpringApplication.run(JavaProLess34Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void inited() {

        System.out.println("All products in repository: \n" + cart1.getProductRepository());

        cart1.addProduct(0L);
        cart1.addProduct(3L);
        System.out.println("Added products to cart1: " + cart1.getProducts());

        cart1.removeProduct(0L);
        System.out.println("Removed product from cart1: " + cart1.getProducts());

        cart2.addProduct(1L);
        cart2.addProduct(2L);
        System.out.println("Added products to cart2: " + cart2.getProducts());

        cart2.removeProduct(2L);
        System.out.println("Removed product from cart2: " + cart2.getProducts());
    }

}
