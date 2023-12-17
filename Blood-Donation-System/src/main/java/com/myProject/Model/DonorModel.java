package com.myProject.Model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "alldonors")
public class DonorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false, name = "full_name")
    private String fullName;

    @Column(length = 45, nullable = false, name = "father_name")
    private String fatherName;

    @Column(length = 45, nullable = false, name = "mother_name")
    private String motherName;

    @Column(length = 45, nullable = false, name = "mobile_number")
    private String mobileNumber;

    @Column(length = 50, nullable = false, name = "email")
    private String email;

    @Column(length = 15, nullable = false, name = "gender")
    private String gender;

    @Column(length = 15, nullable = false, name = "blood_group")
    private String bloodGroup;

    @Column(length = 45, nullable = false, name = "address")
    private String address;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
