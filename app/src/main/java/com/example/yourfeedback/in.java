package com.example.yourfeedback;

import java.io.Serializable;

public class in implements Serializable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    public String getLpro() {
        return lpro;
    }

    public void setLpro(String lpro) {
        this.lpro = lpro;
    }

    public String getFbpro() {
        return fbpro;
    }

    public void setFbpro(String fbpro) {
        this.fbpro = fbpro;
    }

    public String getGhpro() {
        return ghpro;
    }

    public void setGhpro(String ghpro) {
        this.ghpro = ghpro;
    }

    public String getLresume() {
        return lresume;
    }

    public void setLresume(String lresume) {
        this.lresume = lresume;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }

    public String getExpe() {
        return expe;
    }

    public void setExpe(String expe) {
        this.expe = expe;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public in(String name, String email, String gender, String age, String college, String year, String mob, String expert, String tech, String working, String lpro, String fbpro, String ghpro, String lresume, String want, String expe, String tell, String ref) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.college = college;
        this.year = year;
        this.mob = mob;
        this.expert = expert;
        this.tech = tech;
        this.working = working;
        this.lpro = lpro;
        this.fbpro = fbpro;
        this.ghpro = ghpro;
        this.lresume = lresume;
        this.want = want;
        this.expe = expe;
        this.tell = tell;
        this.ref = ref;
    }

    String email;
    String gender;
    String age;
    String college;
    String year;
    String mob;
    String expert;
    String tech;
    String working;
    String lpro;
    String fbpro;
    String ghpro;
    String lresume;
    String want;
    String expe;
    String tell;
    String ref;
}

