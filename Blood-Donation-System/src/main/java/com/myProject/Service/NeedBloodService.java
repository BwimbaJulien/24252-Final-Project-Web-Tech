package com.myProject.Service;

import com.myProject.Model.NeedBloodModel;
import com.myProject.Repository.NeedBloodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeedBloodService {

    @Autowired
    private NeedBloodRepo repo;

    public List<NeedBloodModel> listAll(){

        return (List<NeedBloodModel>) repo.findAll();
    }

    public void save(NeedBloodModel needBloodModel){

        repo.save(needBloodModel);
    }

    public List<NeedBloodModel> findByBloodGroup(String bloodGroup) {
        return repo.findByBloodGroup(bloodGroup);
    }
}
