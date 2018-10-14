/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author danda
 */
class Ability {
    
    private long id;
    private String nameRus;
    private String nameEng;
    private String type;
    private int currentLevel;
    private int maxLevel;
    private int damage;
    private int damagePerSecond;
    private int intervalDamage;
    private int duration;
    private int cooldown;
    private int costNextLevel;
    private int nextLevelStudyTime;

    public Ability(long id, String nameRus, String nameEng, String type, int currentLevel, int maxLevel, int damage, int damagePerSecond, int intervalDamage, int duration, int cooldown, int costNextLevel, int nextLevelStudyTime) {
        this.id = id;
        this.nameRus = nameRus;
        this.nameEng = nameEng;
        this.type = type;
        this.currentLevel = currentLevel;
        this.maxLevel = maxLevel;
        this.damage = damage;
        this.damagePerSecond = damagePerSecond;
        this.intervalDamage = intervalDamage;
        this.duration = duration;
        this.cooldown = cooldown;
        this.costNextLevel = costNextLevel;
        this.nextLevelStudyTime = nextLevelStudyTime;
    }

    public long getId() {
        return id;
    }

    public String getNameRus() {
        return nameRus;
    }

    public String getNameEng() {
        return nameEng;
    }

    public String getType() {
        return type;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getDamage() {
        return damage;
    }

    public int getDamagePerSecond() {
        return damagePerSecond;
    }

    public int getIntervalDamage() {
        return intervalDamage;
    }

    public int getDuration() {
        return duration;
    }

    public int getCooldown() {
        return cooldown;
    }

    public int getCostNextLevel() {
        return costNextLevel;
    }

    public int getNextLevelStudyTime() {
        return nextLevelStudyTime;
    }

    @Override
    public String toString() {
        return id + ": " + nameEng;
    }
}
