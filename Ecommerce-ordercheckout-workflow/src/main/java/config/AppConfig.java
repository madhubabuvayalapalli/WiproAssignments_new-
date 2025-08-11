package config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import service.CartValidator;
import service.CartValidatorImpl;
import service.InventoryService;
import service.InventoryServiceImpl;
import service.OrderService;
import service.OrderServiceImpl;

@Configuration
@ComponentScan(basePackages="service")
public class AppConfig {
	
	@Bean
    public InventoryService inventoryService() {
        return new InventoryServiceImpl();
    }

    @Bean
    public CartValidator cartValidator() {
        return new CartValidatorImpl();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(cartValidator(), inventoryService());
    }
  
}