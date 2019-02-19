package lt.lessons.baltictalents.repository;

import lt.lessons.baltictalents.model.BaseEntity;
import lt.lessons.baltictalents.model.Pazymys;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PazymiaiRepository extends CrudRepository<BaseEntity, Long> {
    Pazymys findByCourse(String Course);
    Pazymys findByType(String Type);
    List<BaseEntity> findAll();
}
