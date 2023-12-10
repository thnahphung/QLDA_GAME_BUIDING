package model;

import java.util.HashMap;

public class Round {
    private int id;
    private int width;
    private int height;
    private int time;
    private Image image;
    private int trueImagePosX;
    private int trueImagePosY;


    public Round() {

    }

    public Round(int id, int width, int height, int time, Image image, int trueImagePosX, int trueImagePosY) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.time = time;
        this.image = image;
        this.trueImagePosX = trueImagePosX;
        this.trueImagePosY = trueImagePosY;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getTrueImagePosX() {
        return trueImagePosX;
    }

    public void setTrueImagePosX(int trueImagePosX) {
        this.trueImagePosX = trueImagePosX;
    }

    public int getTrueImagePosY() {
        return trueImagePosY;
    }

    public void setTrueImagePosY(int trueImagePosY) {
        this.trueImagePosY = trueImagePosY;
    }
}
