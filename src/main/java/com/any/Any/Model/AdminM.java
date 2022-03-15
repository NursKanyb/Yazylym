package com.any.Any.Model;

import javax.persistence.*;

@Entity
@Table(name = "addingJob", schema = "public")
public class AdminM {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name, questions, diplom, skill, moreInfo;
    public AdminM(){}

    public AdminM(String name, String questions, String diplom, String skill, String moreInfo) {
        this.name = name;
        this.questions = questions;
        this.diplom = diplom;
        this.skill = skill;
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

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getDiplom() {
        return diplom;
    }

    public void setDiplom(String diplom) {
        this.diplom = diplom;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }
}
