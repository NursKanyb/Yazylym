package com.any.Any.Model;

import javax.persistence.*;

@Entity
@Table(name = "resume", schema = "public")
public class ResumeM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name, surname, email, address, phone, langProf, education,
            hourly, skills, moreInfo;

    public ResumeM() {
    }

    public ResumeM(String name, String surname, String email, String address,
                   String phone, String langProf, String education, String hourly,
                   String skills, String moreInfo) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.langProf = langProf;
        this.education = education;
        this.hourly = hourly;
        this.skills = skills;
        this.moreInfo = moreInfo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLangProf() {
        return langProf;
    }

    public void setLangProf(String langProf) {
        this.langProf = langProf;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getHourly() {
        return hourly;
    }

    public void setHourly(String hourly) {
        this.hourly = hourly;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }
}
