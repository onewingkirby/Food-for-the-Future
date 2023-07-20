import scala.collection.mutable.ListBuffer

//A class to represent a food item
class FoodItem(val name: String, val category: String){
    var quantity = 0

    def getQuantity(): Int = quantity

    def setQuantity(newQuantity: Int): Unit ={
        quantity = newQuantity
    }

    override def toString(): String = {
        s"FoodItem($name, $category)"
    }
}

//A class to represent a grocery store
class GroceryStore(val name: String, val items: ListBuffer[FoodItem]){
    def addItem(item: FoodItem){
        items += item
    }

    def removeItem(item: FoodItem){
        items -= item
    }

    override def toString(): String = {
        s"GroceryStore($name, $items)"
    }
}

//A class to represent a restaurant
class Restaurant(val name: String, val items: ListBuffer[FoodItem]){
    def addItem(item: FoodItem){
        items += item
    }

    def removeItem(item: FoodItem){
        items -= item
    }

    override def toString(): String = {
        s"Restaurant($name, $items)"
    }
}

//A class to represent a budget
class Budget(val limit: Double){
    var total = 0.0

    def addToBudget(amount: Double){
        total += amount
    }

    def removeFromBudget(amount: Double): Double ={
        val diff = total - amount
        if (diff >= 0)
            total -= amount
        diff
    }

    override def toString(): String = {
        s"Budget(limit: $limit, total: $total)"
    }
}

//A class to represent a person
class Person(val name: String, val budget: Budget){
   val storeHistory = ListBuffer[String]()
   val restaurantHistory = ListBuffer[String]()

   def addToStoreHistory(store: String){
        storeHistory += store
   }

   def addToRestaurantHistory(restaurant: String){
       restaurantHistory += restaurant
   }

   override def toString(): String = {
        s"Person($name, $budget, visited Stores: $storeHistory, visited Restaurants: $restaurantHistory)"
   }
}

//A class to represent a meal
class Meal(val name: String, val items: ListBuffer[FoodItem]){
    var calories = 0

    def getCalories(): Int = calories

    def setCalories(newCalories: Int) ={
        calories = newCalories
    }
    override def toString(): String = {
        s"Meal($name, $items)"
    }
}

/**
 * A class to represent a meal planner which helps people
 * to plan a nutritious and budgeted meals 
 */
class MealPlanner(){
    //Keeps track of the number of people 
    var numOfPeople = 0

    //A ListBuffer containing a list of food items
    val foodItemList = ListBuffer[FoodItem]()

    //A ListBuffer containing a list of grocery stores
    val groceryStoreList = ListBuffer[GroceryStore]()

    //A ListBuffer containing a list of restaurants
    val restaurantList = ListBuffer[Restaurant]()

    //A listBuffer containing a list of meals
    val mealList = ListBuffer[Meal]()

    def addPerson(person: Person): Unit = {
        numOfPeople += 1
    }

    def removePerson(person: Person): Unit = {
        numOfPeople -= 1
    }

    /**
     * This method allows user to add a food item (and its quantity) to the foodItemList.
     */
    def addFoodItem(foodItem: FoodItem, quantity: Int): Unit = {
        foodItem.setQuantity(quantity)
        foodItemList += foodItem
    }

    /**
     * This method allows user to remove a food item from the foodItemList.
     */
    def removeFoodItem(foodItem: FoodItem): Unit = {
        foodItemList -= foodItem
    }

    /**
     * This method allows user to add a grocery store to the groceryStoreList.
     */
    def addGroceryStore(groceryStore: GroceryStore): Unit = {
        groceryStoreList += groceryStore
    }

    /**
     * This method allows user to remove a grocery store from the groceryStoreList.
     */
    def removeGroceryStore(groceryStore: GroceryStore): Unit = {
        groceryStoreList -= groceryStore
    }

    /**
     * This method allows user to add a restaurant to the restaurantList.
     */
    def addRestaurant(restaurant: Restaurant): Unit = {
        restaurantList += restaurant
    }

    /**
     * This method allows user to remove a restaurant from the restaurantList.
     */
    def removeRestaurant(restaurant: Restaurant): Unit = {
        restaurantList -= restaurant
    }

    /**
     * This method allows user to create a new meal and add it to the mealList.
     */
    def createMeal(name: String, items: ListBuffer[FoodItem]): Unit = {
        var newMeal = new Meal(name, items)
        mealList += newMeal
    }

    /**
     * This method allows user to remove a meal from the mealList.
     */
    def removeMeal(meal: Meal): Unit = {
        mealList -= meal
    }

    /**
     * This method allows user to plan a nutritious meal with a budget for a specific number of people.
     */
    def planMeal(numPeople: Int, budget: Double): ListBuffer[Meal] = {
        //Keeps track of the meal list
        var mealList = ListBuffer[Meal]()
        //Calculate the per person budget
        val perPersonBudget = budget/numPeople

        //Choose food items that are healthy and within the budget
        var healthyFoodItems = foodItemList.filter(foodItem => {
            foodItem.category == "Healthy" && foodItem.quantity * foodItem.getQuantity() <= perPersonBudget
        })

        //Create meals with the healthy food items
        healthyFoodItems.foreach(healthyFoodItem => {
            mealList += new Meal(healthyFoodItem.name, ListBuffer(healthyFoodItem))
        })

        mealList
    }

    /**
     * This method allows user to plan a meal with food items provided by a grocery store.
     */
    def planMealWithGroceryStore(groceryStore: GroceryStore, budget: Double): ListBuffer[Meal] = {
        //Keeps track of the meal list
        var mealList = ListBuffer[Meal]()

        //Choose food items within the budget
        var affordableFoodItems = groceryStore.items.filter(foodItem => foodItem.quantity * foodItem.getQuantity() <= budget)

        //Create meals with the food items
        affordableFoodItems.foreach(affordableFoodItem => {
            mealList += new Meal(affordableFoodItem.name, ListBuffer(affordableFoodItem))
        })

        mealList
    }

    /**
     * This method allows user to plan a meal with food items provided by a restaurant.
     */
    def planMealWithRestaurant(restaurant: Restaurant, budget: Double): ListBuffer[Meal] = {
        //Keeps track of the meal list
        var mealList = ListBuffer[Meal]()

        //Choose food items within the budget
        var affordableFoodItems = restaurant.items.filter(foodItem => foodItem.quantity * foodItem.getQuantity() <= budget)

        //Create meals with the food items
        affordableFoodItems.foreach(affordableFoodItem => {
            mealList += new Meal(affordableFoodItem.name, ListBuffer(affordableFoodItem))
        })

        mealList
    }

    override def toString(): String = {
        s"MealPlanner(People: $numOfPeople, FoodItems: $foodItemList, GroceryStores: $groceryStoreList, Restaurants: $restaurantList, Meals: $mealList)"
    }
}