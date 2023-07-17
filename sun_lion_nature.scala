//Define class for a food item
class FoodItem(val name: String, val cost: Double, val description: String, val calories: Int, val fatContent: Int, val proteinContent:Int, val allergenList: List[String]) {
  
  //Method to calculate total nutritional value of a food item
  def totalNutritionalValue(): Double = {
    return (calories * 4.0 + fatContent * 9.0 + proteinContent * 4.0)
  }
  
  //Method to compare to other food items
  def compareItem(otherItem: FoodItem): Boolean = {
    return this.totalNutritionalValue() > otherItem.totalNutritionalValue()
  }
  
  //Method to list allergens
  def listAllergens(): String = {
    var result: String = ""
    for(item <- allergenList) {
      result += item + " "
    }
    return result
  }
  
  //Method to display information about food item
  def displayItem(): Unit = {
    println("Item: " + name)
    println("Cost: " + cost)
    println("Description: " + description)
    println("Calories: " + calories)
    println("Fat Content: " + fatContent + " g")
    println("Protein Content: " + proteinContent + " g")
    println("Allergens: " + listAllergens())
    println("Total Nutritional Value: " + totalNutritionalValue() + " kcal")
  }
  
}

//Define class for menu
class FoodMenu(val menuItems: List[FoodItem]) {
  
  //Method to get list of menu items
  def getMenuItems(): List[FoodItem] = {
    return menuItems
  }
  
  //Method to lookup and display a food item
  def lookupAndDisplayItem(itemName: String): Unit = {
    for(item <- menuItems) {
      if(item.name == itemName) {
        item.displayItem()
      }
    }
  }
  
  //Method to sort menu items by nutritional value
  def sortMenuByNutritionalValue(): Unit = {
    var sortedMenu = menuItems.sortWith(_.totalNutritionalValue() > _.totalNutritionalValue())
    for(item <- sortedMenu) {
      item.displayItem()
    }
  }
  
  //Method to get menu item with highest nutritional value
  def highestNutritionalValue(): Unit = {
    var highestItem = menuItems.maxBy(_.totalNutritionalValue())
    highestItem.displayItem()
  }
  
  //Method to get menu item with lowest nutritional value
  def lowestNutritionalValue(): Unit = {
    var lowestItem = menuItems.minBy(_.totalNutritionalValue())
    lowestItem.displayItem()
  }
  
}

//Define class for a restaurant
class Restaurant(val name: String, val address: String, val menu: FoodMenu) {
  
  //Method to display restaurant information
  def displayRestaurant(): Unit = {
    println("Restaurant Name: " + name)
    println("Address: " + address)
    println("Menu: ")
    menu.sortMenuByNutritionalValue()
  }
  
  //Method to compare two restaurants
  def compareRestaurants(otherRestaurant: Restaurant): Boolean = {
    return this.menu.highestNutritionalValue() > otherRestaurant.menu.highestNutritionalValue()
  }
  
  //Method to recommend menu item
  def recommendMenuItem(): Unit = {
    println("We recommend the following item:")
    menu.highestNutritionalValue()
  }
  
}

//Create list of food items
val cheeseBurger = new FoodItem("Cheese Burger", 5.99, "1/4 lb burger with American cheese", 700, 40, 25, List("Meat","Dairy"))
val fishBurger = new FoodItem("Fish Burger", 6.99, "Battered cod fillet with tartar sauce", 450, 10, 25, List("Seafood"))
val gardenSalad = new FoodItem("Garden Salad", 4.99, "Mixed greens with tomatoes, cucumbers, carrots and balsamic vinaigrette", 200, 10, 5, List("Vegetarian"))
val frenchFries = new FoodItem("French Fries", 2.99, "Hand-cut and fried", 500, 30, 10, List("Potatoes"))

//Create menu
val foodMenu = new FoodMenu(List(cheeseBurger, fishBurger, gardenSalad, frenchFries))

//Create restaurant
val foodForTheFuture = new Restaurant("Food for the Future", "123 Main St, Anytown, USA", foodMenu)

//Display restaurant
foodForTheFuture.displayRestaurant()

//Recommend menu item
foodForTheFuture.recommendMenuItem()