package fr.estia.account;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "customer", url = "http://localhost:8082/")
public interface CustomerClient {
    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable Long id);
    @GetMapping("/customers")
    public List<Customer> getCustomers();
}
