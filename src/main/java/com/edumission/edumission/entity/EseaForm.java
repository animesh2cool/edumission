package com.edumission.edumission.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "eseaformdetails")
public class EseaForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fullname")
    private String fname;
    @Column(name = "gname")
    private String gname;
    @Column(name = "dob")
    private String dob;
    @Column(name = "gender")
    private String gender;
    @Column(name = "address")
    private String address;
    @Column(name = "school")
    private String school;
    @Column(name = "class")
    private String classs;
    @Column(name = "roll")
    private String roll;
    @Column(name = "section")
    private String section;
    @Column(name = "wnumber")
    private String wnumber;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getGname() {
        return gname;
    }
    public void setGname(String gname) {
        this.gname = gname;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getClasss() {
        return classs;
    }
    public void setClasss(String classs) {
        this.classs = classs;
    }
    public String getRoll() {
        return roll;
    }
    public void setRoll(String roll) {
        this.roll = roll;
    }
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    public String getWnumber() {
        return wnumber;
    }
    public void setWnumber(String wnumber) {
        this.wnumber = wnumber;
    }
    public EseaForm() {
    }
    public EseaForm(Long id, String fname, String gname, String dob, String gender, String address, String school,
            String classs, String roll, String section, String wnumber) {
        this.id = id;
        this.fname = fname;
        this.gname = gname;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.school = school;
        this.classs = classs;
        this.roll = roll;
        this.section = section;
        this.wnumber = wnumber;
    }
    @Override
    public String toString() {
        return "EseaForm [id=" + id + ", fname=" + fname + ", gname=" + gname + ", dob=" + dob + ", gender=" + gender
                + ", address=" + address + ", school=" + school + ", classs=" + classs + ", roll=" + roll + ", section="
                + section + ", wnumber=" + wnumber + "]";
    }

    
}
