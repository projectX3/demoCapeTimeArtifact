package demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import demo.model.Tbllist;

// @RepositoryRestResource
public interface TbllistRepository extends CrudRepository<Tbllist, Integer> {
    // List<Tbltodo> findByTblstatus(@Param("statusid") int todoStatusID);
    List<Tbllist> findByName(@Param("namein") String namein);

    List<Tbllist> findByListid(@Param("listid") int listid);
    
    List<Tbllist> findByUserid(@Param("userid") int userid);
}
