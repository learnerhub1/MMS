package com.example.MMS.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Entity
@Table(name = " custom_details")
@Data
public class Registration  implements java.io.Serializable{

    @Id
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "custom_name", nullable = false, length = 15)
    private String customname;

    @Column(name = "custom_ph_number", length = 16, unique = true)
    private String mobilenumber;

    @Column(name = "cust_village_name", nullable = false)
    private String villagename;

    @Column(name = "reg_date", nullable = false)
    private String datetime;

    public Registration() {
        this.datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public Registration(UUID id, String customname, String mobilenumber, String villagename) {
        this.id = id;
        this.customname = customname;
        this.mobilenumber = mobilenumber;
        this.villagename = villagename;
        this.datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    }