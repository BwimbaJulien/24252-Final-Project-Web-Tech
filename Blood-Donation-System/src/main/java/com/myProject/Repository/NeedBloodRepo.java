package com.myProject.Repository;

import com.myProject.Model.NeedBloodModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeedBloodRepo extends CrudRepository <NeedBloodModel, Integer> {

    List<NeedBloodModel> findByBloodGroup(String bloodGroup);

}
