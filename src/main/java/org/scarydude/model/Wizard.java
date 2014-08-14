package org.scarydude.model;

public class Wizard {
    private Integer id;
    private String name;
    private Integer age;
    private Double beardLength;
    private Integer spellsPower;

    public Wizard(Integer id, String name, Integer age, Double beardLength, Integer spellsPower) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.beardLength = beardLength;
        this.spellsPower = spellsPower;
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

    public Double getBeardLength() {
        return beardLength;
    }

    public void setBeardLength(Double beardLength) {
        this.beardLength = beardLength;
    }

    public Integer getSpellsPower() {
        return spellsPower;
    }

    public void setSpellsPower(Integer spellsPower) {
        this.spellsPower = spellsPower;
    }
}
