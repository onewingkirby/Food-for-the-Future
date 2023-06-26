public class FoodForTheFuture
{
    private static final int MAX_FOOD_AMOUNT = 2000;
  
    public static void main(String[] args)
    {
        int currentFoodAmount = 0;
        for (int i = 0; i < MAX_FOOD_AMOUNT; i++)
        {
            distributeFood();
            currentFoodAmount++;
        }
        System.out.println("Distributed " + currentFoodAmount + " servings of food!");
    }
  
    private static void distributeFood()
    {
        //code to distribute food
    }
}