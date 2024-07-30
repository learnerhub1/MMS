package com.example.MMS.Services;

import com.example.MMS.Entity.Registration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


public interface RegistrationService {

    List<Registration> getAllRegistration();

    Registration saveOneRegistration(Registration registration);

    Registration getOneRegistration(UUID id);

    public Registration updateRegistration(Registration registration);

    void deleteRegistration (UUID id);
}