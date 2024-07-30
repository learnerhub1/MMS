package com.example.MMS.Services;

import com.example.MMS.Entity.Registration;
import com.example.MMS.Repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class RegistrationServicesimple  implements RegistrationService{

    @Autowired
    private RegistrationRepo registrationRepo;


    @Override
    public List<Registration> getAllRegistration() {
        return registrationRepo.findAll();
    }

    @Override
    public Registration saveOneRegistration(Registration registration) {

        return  registrationRepo.save(registration);
    }

    @Override
    public Registration getOneRegistration(UUID id) {
        Optional<Registration> registration = registrationRepo.findById(id);
        return registration.orElse(null);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        Optional<Registration> registration1 = registrationRepo.findById(registration.getId());
        if(registration1.isPresent()){
            Registration updatedRegistration = registration1.get();
            updatedRegistration.setCustomname(registration.getCustomname());
            updatedRegistration.setMobilenumber(registration.getMobilenumber());
            updatedRegistration.setVillagename(registration.getVillagename());
            updatedRegistration.setDatetime(registration.getDatetime());
            return registrationRepo.save(updatedRegistration);
        }
        return null;
    }

    @Override
    public void deleteRegistration(UUID id) {
        registrationRepo.deleteById(id);

    }
    }


