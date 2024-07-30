package com.example.MMS.Services;

import com.example.MMS.Entity.Vegetables;
import com.example.MMS.Repository.VegetableRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class VegetableServiceImple implements vegetablesService{

    @Autowired
    private VegetableRepo vegetablesRepo;

    @Override
    public List<Vegetables> getAllVegetables() {
        return  vegetablesRepo.findAll();
    }

    @Override
    public Vegetables saveOneVegetables(Vegetables vegetables) {
        return vegetablesRepo.save(vegetables);
    }

    @Override
    public Vegetables getOneVegetables(Long id) {
        Optional<Vegetables> findbyid=vegetablesRepo.findById(id);
        return findbyid.orElse(null);
    }

    @Override
    public Vegetables updateVegetables(Vegetables vegetables) {
        vegetablesRepo.findById(vegetables.getId());
        return null;
    }

    @Override
    public void DeleteVegetables(Long id) {
        vegetablesRepo.deleteById(id);

    }
}
