package com.example.AccessingUserData;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer ID;

    @Column(name="FIRSTNAME")
    private String firstname;

    @Column(name="MIDDLENAME")
    private String middlename;

    @Column(name="LASTNAME")
    private String lastname;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PHONENOS")
    private String phoneNos;

    @Column(name="LOCATION")
    private String location;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="LINKEDIN")
    private String linkedIn;

    @Column(name="BIRTHDATE")
    private Date birthdate;

    public User(String firstName, String middleName, String lastName, String email, String phonenos, String location, String address, String linkedin, Date birthdate){
        this.firstname=firstName;
        this.middlename=middleName;
        this.lastname=lastName;
        this.email=email;
        this.phoneNos=phonenos;
        this.location=location;
        this.address=address;
        this.linkedIn=linkedin;
        this.birthdate=birthdate;

    }

    public Integer getId(){
        return ID;
    }

    public String getFirstName(){
        return firstname;
    }

    public String getMiddleName(){
        return middlename;
    }

    public String getLastName(){
        return lastname;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNos(){
        return phoneNos;
    }

    public String getLocation(){
        return location;
    }

    public String getAddress(){
        return address;
    }

    public String getLinkedin(){
        return linkedIn;
    }

    public Date getBirthdate(){
        return birthdate;
    }
}