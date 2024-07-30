package com.example.MMS.Repository;

import com.example.MMS.Entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, UUID> {

}
