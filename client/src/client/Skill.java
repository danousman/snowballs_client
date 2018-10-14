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
public class Skill {

    private long id;
    private String nameRus;
    private String nameEng;
    private String type;
    private int currentLevel;
    private int maxLevel;
    private float currentBonus;
    private int costNextLevel;
    private int nextLevelStudyTime;

    public Skill(long id, String nameRus, String nameEng, String type, int currentLevel, int maxLevel, float currentBonus, int costNextLevel, int nextLevelStudyTime) {
        this.id = id;
        this.nameRus = nameRus;
        this.nameEng = nameEng;
        this.type = type;
        this.currentLevel = currentLevel;
        this.maxLevel = maxLevel;
        this.currentBonus = currentBonus;
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

    public float getCurrentBonus() {
        return currentBonus;
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
