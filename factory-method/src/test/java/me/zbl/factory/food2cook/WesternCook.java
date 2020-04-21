package me.zbl.factory.food2cook;

public class WesternCook implements Cook {




    @Override
    public Food cookFood(FoodType foodType) {
        return new WesternFood(foodType);
    }


}
