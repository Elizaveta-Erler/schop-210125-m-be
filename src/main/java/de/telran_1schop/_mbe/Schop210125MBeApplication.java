package de.telran_1schop._mbe;

import de.telran_1schop._mbe.pojo.Category;
import de.telran_1schop._mbe.pojo.Order;
import de.telran_1schop._mbe.pojo.Product;
import de.telran_1schop._mbe.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Schop210125MBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Schop210125MBeApplication.class, args);

		Product product = new Product();
		product.setProduktId(1L);
		product.setName("Möhren");
		System.out.println("product");
		System.out.println("Ich habe gekauft " + product.getName());

		Set<Product> productSet = new HashSet<>();
		productSet.add(product);

		User user = new User();
		user.setUserId(1514);
		user.setRole("Admin");
		System.out.println("user");
		System.out.println("ist " + user.getRole());

		Set<User> userSet = new HashSet<>();
		userSet.add(user);

		Category category = new Category();
		category.setCategoryId(1548);
		category.setName("Obst");
		System.out.println("category");
		System.out.println("ist " + category.getName());

		Set<Category> categorySet = new HashSet<>();
		categorySet.add(category);

		Order order = new Order();
		order.setOrderId(1748);
		order.setDeliveryMethod("Selbstabholung");
		System.out.println("order");
		System.out.println("ist " + order.getDeliveryMethod());

		Set<Order> orderSet = new HashSet<>();
		orderSet.add(order);

	}
}
