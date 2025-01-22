package com.example1;

public class Art {

    private final String name;
    private int agePicture;
    private final int size;

    public String getName() {
        return name;
    }

    public int getAgePicture() {
        return agePicture;
    }

    public int getSize() {
        return size;
    }

    public void setAgePicture(int agePicture) {
        this.agePicture = agePicture;
    }

    public Art(String name, int agePicture, int size) {
        this.name = name;
        this.agePicture = agePicture;
        this.size = size;
    }
}
