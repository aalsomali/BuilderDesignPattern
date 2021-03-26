public class MealBuilder {

    public Meal prepareVegCokeMeal() {
        
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
        
    }
    
    public Meal prepareVegPepsiMeal() {
        
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
        
    }
    
    public Meal prepareChickenCokeMeal() {
        
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
        
    }

    public Meal prepareChickenPepsiMeal() {
        
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
        
    }
    
   
   
}
