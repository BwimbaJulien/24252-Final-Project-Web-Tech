package com.myProject.Service;

import com.myProject.DonorNotFoundException;
import com.myProject.Model.DonorModel;
import com.myProject.Repository.DonorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonorService {

    @Autowired
    private DonorRepo repo;

    public void save(DonorModel donorModel){

        repo.save(donorModel);
    }

    public List<DonorModel> listAll(){
        return (List<DonorModel>) repo.findAll();
    }

    public DonorModel get(Integer id) throws DonorNotFoundException {
        Optional<DonorModel> result = repo.findById(id);
        if (result.isPresent()){
            return result.get();
        }
        throw new DonorNotFoundException("Could not find any Donor with ID " + id);
    }

    public void delete(Integer id) throws DonorNotFoundException{
        Long count = repo.countById(id);
        if (count == null || count == 0){

            throw new DonorNotFoundException("Could not find any Donor with ID " + id);
        }
        repo.deleteById(id);
    }
}
