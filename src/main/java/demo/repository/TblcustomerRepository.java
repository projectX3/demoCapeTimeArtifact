package demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.model.Tblcustomer;

@RepositoryRestResource
public interface TblcustomerRepository extends CrudRepository<Tblcustomer, Integer> {
    // List<Tbltodo> findByTblstatus(@Param("statusid") int todoStatusID);
}
