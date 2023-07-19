import java.util.ArrayList;

public class FoodForTheFuture {
	
	private ArrayList<String> foodList;
	
	public FoodForTheFuture() {
		foodList = new ArrayList<String>();
	}
	
	public void addFood(String foodName) {
		foodList.add(foodName);
	}

	public void restoreFoodList() {
		foodList.clear();
		foodList.add("Fruits");
		foodList.add("Vegetables");
		foodList.add("Legumes");
		foodList.add("Grains");
		foodList.add("Dairy");
		foodList.add("Meat");
		foodList.add("Fish");
		foodList.add("Eggs");
	}
	
	public void displayFoodList() {
		for (String food : foodList){
			System.out.println(food);
		}
	}
	
	public void findFoodByName(String name) {
		for (String food : foodList) {
			if (food.equals(name)) {
				System.out.println("Found the food: " + food);
				break;
			} else {
				System.out.println("Food not found.");
				break;
			}
		}
	}
	
	public void searchFoodByIngredient(String ingredient) {
		System.out.println("Searching food containing " + ingredient);
		for (String food : foodList) {
			if (food.contains(ingredient)) {
				System.out.println("Found the food: " + food);
			}
		}
	}
	
	public void removeFoodByName(String name) {
		for (String food : foodList) {
			if (food.equals(name)) {
				foodList.remove(food);
				break;
			} else {
				System.out.println("Food not found.");
				break;
			}
		}
		System.out.println("Food removed successfully");
	}
	
	public void sortFoodByCalories() {
		// sort foodList by calories 
	}
	 
	public void addNewFoodGroup(String foodGroupName) {
		foodList.add(foodGroupName);
		System.out.println("Food group added successfully");
	}
	
	public void calculateCalories(String foodName) {
		// calculate calories of a food 
	}

	public void displayNutritionFacts(String foodName) {
		// display nutrition facts 
	}
	
	public void saveFoodListToFile() {
		// save foodlist to file
	}
	
	public void loadFoodListFromFile() {
		// load foodlist from file
	}
	
	public void rateFood() {
		// rate food 
	}
	
	public void suggestFoodBasedOnPreferences() {
		// suggest food based on user preferences 
	}
	
	public void filterFoodByAllergy() {
		// filter foodList based on allergies
	}
	
	public void updateRecommendedFoodList() {
		// update recommended Food List based on user ratings
	}
	
	public void compareFoodNutrients() {
		// compare and contrast different food nutrients 
	}
	
	public void storeFavoriteFood() {
		// store favorite food list
	}
	
	public void findCheapestFoodSource() {
		// find the cheapest food source for a food item
	}
	
	public void checkFoodExpiry() {
		// check food expiry dates
	}
	
	public void searchRecipeByIngredients() {
		// search for recipes by ingredients
	}
	
	public void orderHealthyFoodOnline() {
		// order healthy food online 
	}
	
	public void findFoodSubstitute() {
		// find food substitutes 
	}
	
	public void findNutrientDenseFood() {
		// find nutrient dense food 
	}
	
	public void identifyOrganicFood() {
		// identify organic food
	}
	
	public void recommendPlantBasedDiet() {
		// recommend plant based diet
	}
	
	public void findSeasonalFood() {
		// find seasonal food
	}
	
	public void identifyGlutenFreeFood() {
		// identify gluten free food
	}
	
	public void removeProcessedFood() {
		// remove processed food from food list
	}
	
	public void findVeganRecipes() {
		// find vegan recipes
	}
	
	public void searchWholeFoods() {
		// search for whole foods
	}
	
	public void identifyHealthySnacks() {
		// identify healthy snacks 
	}
	
	public void findFoodsWithLowGlycemicIndex() {
		// find foods with low glycemic index
	}
	
	public void locateLocalFarmersMarket() {
		// locate local farmers market
	}
	
	public void findHealthyCateringServices() {
		// find healthy catering services 
	}
	
	public void compareFoodLabels() {
		// compare food labels
	}
	
	public void identifySustainableFoodSources() {
		// identify sustainable food sources
	}
	
	public void shopAtBulkFoodStores() {
		// shop at bulk food stores 
	}
	
	public void joinCommunitySupportedAgriculture() {
		// join community supported agriculture
	}
	
	public void calculateFoodCarbonFootprint() {
		// calculate food carbon footprint
	}
	
	public void researchFoodHistory() {
		// research food history
	}
	
	public void locateHealthyRestaurants() {
		// locate healthy restaurants
	}
	
	public void growOrganicFood() {
		// grow organic food
	}
	
	public void identifyFoodWaste() {
		// identify food waste 
	}
	
	public void compostFoodScraps() {
		// compost food scraps
	}
	
	public void preserveFood() {
		// preserve food
	}
	
	public void eatLessMeat() {
		// eat less meat
	}
	
	public void useReusableFoodContainers() {
		// use reusable food containers
	}
	
	public void reduceFoodPackaging() {
		// reduce food packaging
	}
 
	public void compostFoodWaste() {
		// compost food waste
	}
	
	public void developVegetarianMealPlan() {
		// develop vegetarian meal plan
	}
	
	public void recycleFoodContainers() {
		// recycle food containers
	}
	
	public void purchaseLocalFood() {
		// purchase local food
	}
	
	public void bakeAtHome() {
		// bake at home
	}
	
	public void reduceFoodMiles() {
		// reduce food miles
	}
	
	public void cookAtHomeMoreOften() {
		// cook at home more often
	}
	
	public void joinFoodBank() {
		// join food bank
	}
	
	public void donateFoodToNeedy() {
		// donate food to needy
	}
	
	public void avoidFoodShaming() {
		// avoid food shaming
	}
	
	public void educateChildrenAboutNutrition() {
		// educate children about nutrition
	}
	
	public void shopAtCooperatives() {
		// shop at cooperatives
	}
	
	public void reduceFoodAdditives() {
		// reduce food additives 
	}
	
	public void plantGardens() {
		// plant gardens
	}
	
	public void reduceFoodWaste() {
		// reduce food waste
	}
	
	public void learnAboutOrganicFarming() {
		// learn about organic farming
	}
	
	public void supportLocalFoodSystems() {
		// support local food systems 
	}
	
	public void reduceFoodPackagingWastage() {
		// reduce food packaging wastage
	}
	
	public void eatHealthyMealsTogether() {
		// eat healthy meals together
	}
	
	public void saveLeftoverFood() {
		// save leftover food
	}
}