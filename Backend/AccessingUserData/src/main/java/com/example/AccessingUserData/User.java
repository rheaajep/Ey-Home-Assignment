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


    public void User(String firstName, String middleName, String lastName, String email, String phonenos, String location, String address, String linkedin){
        this.firstname=firstName;
        this.middlename=middleName;
        this.lastname=lastName;
        this.email=email;
        this.phoneNos=phonenos;
        this.location=location;
        this.address=address;
        this.linkedIn=linkedin;

    }

    public Integer getId(){
        return ID;
    }

    public void setId(Integer id){
        this.ID=id;
    }


    public String getFirstName(){
        return firstname;
    }

    public void setFirstName(String name){
        this.firstname=name;
    }

    public String getMiddleName(){
        return middlename;
    }

    public void setMiddleName(String name){
        this.middlename=name;
    }

    public String getLastName(){
        return lastname;
    }

    public void setLastName(String name){
        this.lastname=name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getPhoneNos(){
        return phoneNos;
    }

    public void setPhoneNos(String nos){
        this.phoneNos=nos;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location=location;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getLinkedin(){
        return linkedIn;
    }

    public void setLinkedin(String link){
        this.linkedIn=link;
    }

}