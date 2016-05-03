package demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demo.model.Tblpriority;

@RepositoryRestResource
public interface TblpriorityRepository extends CrudRepository<Tblpriority, Integer> {
    // List<Tbltodo> findByTblstatus(@Param("statusid") int todoStatusID);
    List<Tblpriority> findByPriorityID(@Param("id") Integer id);
}

// List<Task> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);
//
// List<Task> findByTaskStatus(@Param("status") String taskStatus);

