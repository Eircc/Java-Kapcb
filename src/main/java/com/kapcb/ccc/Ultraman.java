package com.kapcb.basic.monsterGame;

/**
 * @author kapcb
 * @version 1.0.0
 * @classname Ultraman
 * @description TODO
 * @date 2020/10/10 14:26
 */
public class Ultraman {
    private String name = "雷欧";
    private Integer age = 1;
    private Double height = 10.00;
    private Long attack = 1000L;
    private Long defense = 1000L;
    private Float attackSpeed = 1.0F;
    private Boolean isLive = true;

    public Ultraman() {

    }

    public Ultraman(String name, Integer age, Double height, Long attack, Long defense, Float attackSpeed, Boolean isLive) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.attack = attack;
        this.defense = defense;
        this.attackSpeed = attackSpeed;
        this.isLive = isLive;
    }

    public Ultraman(String name, Long attack, Long defense, Float attackSpeed) {
        this.name = name;
        this.age = 22;
        this.height = 55.5;
        this.attack = attack;
        this.defense = defense;
        this.attackSpeed = attackSpeed;
        isLive = true;
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

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Long getAttack() {
        return attack;
    }

    public void setAttack(Long attack) {
        this.attack = attack;
    }

    public Long getDefense() {
        return defense;
    }

    public void setDefense(Long defense) {
        this.defense = defense;
    }

    public Float getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(Float attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public Boolean getLive() {
        return isLive;
    }

    public void setLive(Boolean live) {
        isLive = live;
    }
}
