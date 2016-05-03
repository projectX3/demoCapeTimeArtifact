package demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.model.Tblcategory;

@RepositoryRestResource
public interface TblcategoryRepository extends CrudRepository<Tblcategory, Integer> {
    // List<Tbltodo> findByTblstatus(@Param("statusid") int todoStatusID);
}
