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
public class Item {

    private long id;
    private String nameRus;
    private String nameEng;
    private String type;
    private int level;
    private int heat;
    private float dodge;

    public Item(long id, String nameRus, String nameEng, String type, int level, int heat, float dodge) {
        this.id = id;
        this.nameRus = nameRus;
        this.nameEng = nameEng;
        this.type = type;
        this.level = level;
        this.heat = heat;
        this.dodge = dodge;
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

    public int getLevel() {
        return level;
    }

    public int getHeat() {
        return heat;
    }

    public float getDodge() {
        return dodge;
    }

    @Override
    public String toString() {
        return id + ": " + nameEng;
    }
}
