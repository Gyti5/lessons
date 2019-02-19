package lt.baltictalents.lessons678.repository.auth;

import lt.baltictalents.lessons678.model.Item;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface ItemRepository extends CrudRepository<Item, Long> {
    Item findByName(String name);
    List<Item> findAll();
}