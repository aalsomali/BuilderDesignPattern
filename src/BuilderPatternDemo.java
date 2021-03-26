import java.util.Scanner;
public class BuilderPatternDemo {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();
        Scanner in = new Scanner (System.in);
        
        Meal vegCokeMeal = mealBuilder.prepareVegCokeMeal();
        
        Meal vegPepsiMeal = mealBuilder.prepareVegPepsiMeal();
        
        Meal chickenCokeMeal = mealBuilder.prepareChickenCokeMeal();
        
        Meal chickenPepsiMeal = mealBuilder.prepareChickenPepsiMeal();
        
        System.out.println("Welcome to Meal Builder!\n\nPlease Choose Your Burger:\n"
                + "\t1- Veggie Burger\n\t2- Chicken Burger\n");
        int burger = in.nextInt();
        
        System.out.println("Please Choose Your Drink:\n"
                + "\t1- Coke\n\t2- Pepsi");
        int drink = in.nextInt();
        
        switch (burger) {
            case 1:
                switch (drink) {
                    case 1:
                        System.out.println("---------------------------------------");
                        System.out.println("Meal Summary");
                        vegCokeMeal.showItems();
                        System.out.println("Total Cost: " + vegCokeMeal.getCost());
                        break;
                    case 2:
                        System.out.println("---------------------------------------");
                        System.out.println("Meal Summary");
                        vegPepsiMeal.showItems();
                        System.out.println("Total Cost: " + vegPepsiMeal.getCost());
                        break;
                }
                break;
            case 2:
                switch (drink) {
                    case 1:
                        System.out.println("---------------------------------------");
                        System.out.println("Meal Summary");
                        chickenCokeMeal.showItems();
                        System.out.println("Total Cost: " + chickenCokeMeal.getCost());
                        break;
                    case 2:
                        System.out.println("---------------------------------------");
                        System.out.println("Meal Summary");
                        chickenPepsiMeal.showItems();
                        System.out.println("Total Cost: " + chickenPepsiMeal.getCost());
                        break;
                }
                break;
        }
        System.out.println("---------------------------------------");
        System.out.println("\nThank you!");
        
    }
    
}
