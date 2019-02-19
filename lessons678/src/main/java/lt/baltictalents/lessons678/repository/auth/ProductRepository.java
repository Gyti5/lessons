package lt.baltictalents.lessons678.repository.auth;

import lt.baltictalents.lessons678.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long>{
    Product findByName(String name);
    List<Product> findAll();
}