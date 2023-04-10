package org.example.config;
import org.example.demo.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig {
//@Bean the name is same as method name , the name is customized using "name" parameter
    @Bean(name="customerBean")
    public Customer customer(){
        return new Customer();
    }
}
