package com.any.Any.Repo;

import com.any.Any.Model.ResumeM;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepo extends CrudRepository<ResumeM, Long> {
}
