package com.example.MMS.Services;


import com.example.MMS.Entity.Registration;
import com.example.MMS.Entity.Vegetables;

import java.util.List;
import java.util.UUID;

public interface vegetablesService {

    List<Vegetables> getAllVegetables();
    Vegetables saveOneVegetables(Vegetables vegetables);
    Vegetables getOneVegetables (Long id);
    Vegetables updateVegetables(Vegetables vegetables);
    void DeleteVegetables(Long id);


}
