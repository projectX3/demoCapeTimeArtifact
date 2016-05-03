package demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.model.Tblstatus;

@RepositoryRestResource
public interface TblstatusRepository extends CrudRepository<Tblstatus, Integer> {
    // List<Tbltodo> findByTblstatus(@Param("statusid") int todoStatusID);
}
