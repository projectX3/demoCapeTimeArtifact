package demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.model.Tbltodo;

@RepositoryRestResource
public interface TbltodoRepository extends CrudRepository<Tbltodo, Integer> {
    // List<Tbltodo> findByTblstatus(@Param("statusid") int todoStatusID);

    List<Tbltodo> findByTblstatus_statusID(@Param("statusid") int statusID);

    List<Tbltodo> findByTbluser1_userID(@Param("userid") int userID);

    List<Tbltodo> findByTbllist_listid(@Param("listid") int listID);

    // List<Tbltodo> findByTblstatusGreaterThan_statusID(@Param("statusid") int
    // statusid);

    Tbltodo findByTitle(@Param("title") String title);
}

// List<Task> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);
//
// List<Task> findByTaskStatus(@Param("status") String taskStatus);

