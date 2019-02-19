package lt.baltictalents.lessons678.service.auth;

import java.util.List;

import lt.baltictalents.lessons678.model.Product;

public interface ProductService {
    void save(Product product);

    Product findByName(String name);

    List<Product> findAll();
}