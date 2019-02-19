package lt.baltictalents.lessons678.service.auth;

import lt.baltictalents.lessons678.model.Product;
import lt.baltictalents.lessons678.repository.auth.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void save(Product product){
        productRepository.save(product);
    }


    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
	}
}
