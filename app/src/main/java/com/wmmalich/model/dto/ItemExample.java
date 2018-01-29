package com.wmmalich.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by greg on 1/29/2018.
 */

public class ItemExample {

    public ItemExample(String name, boolean up, float percent, String image) {
        this.name = name;
        this.up = up;
        this.percent = percent;
        this.image = image;
    }

    @SerializedName("name")
    @Expose
    String name;

    @SerializedName("up")
    @Expose
    boolean up;

    @SerializedName("percent")
    @Expose
    float percent;

    @SerializedName("image")
    @Expose
    String image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
