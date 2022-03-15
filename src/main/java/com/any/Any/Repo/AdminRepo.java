package com.any.Any.Repo;

import com.any.Any.Model.AdminM;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends CrudRepository<AdminM, Long> {
    Long deleteById(long id);
}
