package me.zbl.factory.food2cook;

public enum FoodType {

    Hoot("热的"),Coold("凉的");
    private String name;
    FoodType(String foodType){this.name = foodType;}


    public String getName() {
        return name;
    }
}
