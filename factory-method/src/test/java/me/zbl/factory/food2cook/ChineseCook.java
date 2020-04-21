package me.zbl.factory.food2cook;

public class ChineseCook implements Cook {



    @Override
    public Food cookFood(FoodType foodType) {
        return new ChineseFood(foodType);
    }
}
