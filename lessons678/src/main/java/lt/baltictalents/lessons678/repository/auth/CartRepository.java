package lt.baltictalents.lessons678.repository.auth;

import lt.baltictalents.lessons678.model.Cart;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartRepository extends CrudRepository<Cart, Long>{
}