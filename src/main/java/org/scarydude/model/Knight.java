package org.scarydude.model;

public class Knight {
    private Integer id;
    private String name;
    private Integer age;
    private Float swordLength;
    private Integer strength;
    private Integer numOfKills;

    public Knight(Integer id, String name, Integer age, Float swordLength, Integer strength, Integer numOfKills) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.swordLength = swordLength;
        this.strength = strength;
        this.numOfKills = numOfKills;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getSwordLength() {
        return swordLength;
    }

    public void setSwordLength(Float swordLength) {
        this.swordLength = swordLength;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getNumOfKills() {
        return numOfKills;
    }

    public void setNumOfKills(Integer numOfKills) {
        this.numOfKills = numOfKills;
    }
}
