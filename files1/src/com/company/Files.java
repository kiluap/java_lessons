package com.company;

public class Files implements Comparable<Files> {

    private String Name;
    private long lastMod;

    public Files(String Name,long lastMod){
    this.Name = Name; this.lastMod=lastMod;
    }

    public int compareTo(Files f) {
    return Long.valueOf(f.lastMod).compareTo(this.lastMod);
    }

    public String getName(){
    return Name;
    }
}


