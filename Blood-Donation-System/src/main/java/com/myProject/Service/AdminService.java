package com.myProject.Service;

import com.myProject.Model.AdminModel;
import com.myProject.Repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepo repo;

//    public List<AdminRepo> listAll(){
//
//        return (List<AdminModel>) repo.findAll();
//    }

    public void save(AdminModel adminModel){

        repo.save(adminModel);
    }

    public AdminModel findAdminByPassword(String password){
        Optional<AdminModel> optionalAdmin = repo.findByPassword(password);
        return optionalAdmin.orElse(null);
    }
}
