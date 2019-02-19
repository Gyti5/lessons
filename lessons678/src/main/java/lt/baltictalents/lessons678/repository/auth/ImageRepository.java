package lt.baltictalents.lessons678.repository.auth;

import lt.baltictalents.lessons678.model.Image;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImageRepository extends CrudRepository<Image, Long>{
        List<Image> findAll();

}