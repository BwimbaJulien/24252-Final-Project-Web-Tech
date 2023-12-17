package com.myProject.Model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "needsblood")
public class NeedBloodModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false, name = "full_name")
    private String fullName;

    @Column(length = 100, nullable = false, name = "email")
    private String email;

    @Column(length = 45, nullable = false, name = "mobile_number")
    private String mobileNumber;

    @Column(length = 15, nullable = false, name = "gender")
    private String gender;

    @Column(length = 15, nullable = false, name = "blood_group")
    private String bloodGroup;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
