package lt.lessons.baltictalents.repository;

import lt.lessons.baltictalents.model.Studentas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentaiRepository extends CrudRepository<Studentas, Long> {
    List<Studentas> findAll();
}