package com.myProject.Repository;

import com.myProject.Model.AdminModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AdminRepo extends  CrudRepository<AdminModel, Integer> {

    Optional<AdminModel> findByPassword(String password);

}
