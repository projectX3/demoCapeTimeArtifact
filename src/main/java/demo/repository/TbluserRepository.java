package demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.model.Tbluser;

@RepositoryRestResource
public interface TbluserRepository extends CrudRepository<Tbluser, Integer> {
    // List<Tbltodo> findByTblstatus(@Param("statusid") int todoStatusID);
}
