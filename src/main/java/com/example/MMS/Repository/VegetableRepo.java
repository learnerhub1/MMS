package com.example.MMS.Repository;

import com.example.MMS.Entity.Vegetables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VegetableRepo extends JpaRepository<Vegetables ,Long> {
}

