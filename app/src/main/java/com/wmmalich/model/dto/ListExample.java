package com.wmmalich.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by greg on 1/29/2018.
 */

public class ListExample {

    public ListExample(String name, String description, float money, String currency, float someNumbers, String type, String typeDescription, ArrayList<ItemExample> itemExampleList) {
        this.name = name;
        this.description = description;
        this.money = money;
        this.currency = currency;
        this.someNumbers = someNumbers;
        this.type = type;
        this.typeDescription = typeDescription;
        this.itemExampleList = itemExampleList;
    }

    @SerializedName("name")
    @Expose
    String name;

    @SerializedName("description")
    @Expose
    String description;

    @SerializedName("money")
    @Expose
    float money;

    @SerializedName("currency")
    @Expose
    String currency;

    @SerializedName("some_numbers")
    @Expose
    float someNumbers;

    @SerializedName("type")
    @Expose
    String type;

    @SerializedName("type_description")
    @Expose
    String typeDescription;

    @SerializedName("item_example_list")
    @Expose
    private ArrayList<ItemExample> itemExampleList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getSomeNumbers() {
        return someNumbers;
    }

    public void setSomeNumbers(float someNumbers) {
        this.someNumbers = someNumbers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public ArrayList<ItemExample> getItemExampleList() {
        return itemExampleList;
    }

    public void setItemExampleList(ArrayList<ItemExample> itemExampleList) {
        this.itemExampleList = itemExampleList;
    }
}
