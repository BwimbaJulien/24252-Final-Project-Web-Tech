package com.myProject.Repository;

import com.myProject.Model.DonorModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepo extends CrudRepository <DonorModel, Integer> {

    public Long countById(Integer id);

}
