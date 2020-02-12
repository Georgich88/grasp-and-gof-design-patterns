package com.foxminded.isaev.bridge.application;

import com.foxminded.isaev.bridge.cafe.AmericanCuisine;
import com.foxminded.isaev.bridge.cafe.Cuisine;
import com.foxminded.isaev.bridge.cafe.JapaneseCuisine;
import com.foxminded.isaev.bridge.cafe.UkrainianCuisine;
import com.foxminded.isaev.bridge.courses.*;

import java.util.List;

public class Application {

    public static void main(String[] args){
        
        var americanCuisine = new AmericanCuisine();
        var japaneseCuisine = new JapaneseCuisine();
        var ukrainianCuisine = new UkrainianCuisine();

        cookComboMeal(americanCuisine);
        cookComboMeal(japaneseCuisine);
        cookComboMeal(ukrainianCuisine);
    }

    private static void cookComboMeal(Cuisine cuisine) {

        List<Course> comboMeal = List.of(
                new Starter(cuisine),
                new MainCourse(cuisine),
                new ThirdCourse(cuisine),
                new Dessert(cuisine));

        comboMeal.forEach(Course::cook);



    }

}
