package demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.model.Tbltask;

@RepositoryRestResource
public interface TbltaskRepository extends CrudRepository<Tbltask, Integer> {

    List<Tbltask> findByTbltodo_TodoID(@Param("todoid") int todoid);

}
