//1
package com.FoodForTheFuture

//2
class Food {

    //3
    data class Ingredients(val name: String)

    //4
    private val ingredients = mutableListOf<Ingredients>()

    //5
    fun addIngredient(ingredient: Ingredients) = ingredients.add(ingredient)

    //6
    fun getIngredients(): List<Ingredients> = ingredients

}

//7
class Recipe {

    //8
    data class Steps(val description: String)

    //9
    private val steps = mutableListOf<Steps>()

    //10
    fun addStep(step: Steps) = steps.add(step)

    //11
    fun getSteps(): List<Steps> = steps

}

//12
class Meal {

    //13
    data class Components(val name: String)

    //14
    private val components = mutableListOf<Components>()

    //15
    fun addComponent(component: Components) = components.add(component)

    //16
    fun getComponents(): List<Components> = components

}

//17
class Shop {

    //18
    data class Items(val name: String, val price: Double)

    //19
    private val items = mutableListOf<Items>()

    //20
    fun addItem(item: Items) = items.add(item)

    //21
    fun getItems(): List<Items> = items

}

//22
class Cooking {

    //23
    data class Utensils(val name: String)

    //24
    private val utensils = mutableListOf<Utensils>()

    //25
    fun addUtensil(utensil: Utensils) = utensils.add(utensil)

    //26
    fun getUtensils(): List<Utensils> = utensils

}

//27
class Restaurant {

    //28
    data class Dishes(val name: String, val price: Double)

    //29
    private val dishes = mutableListOf<Dishes>()

    //30
    fun addDish(dish: Dishes) = dishes.add(dish)

    //31
    fun getDishes(): List<Dishes> = dishes

}

//32
class Kitchen {

    //33
    data class Tools(val name: String)

    //34
    private val tools = mutableListOf<Tools>()

    //35
    fun addTool(tool: Tools) = tools.add(tool)

    //36
    fun getTools(): List<Tools>  = tools

}

//37
class Grocery {

    //38
    data class Produce(val name: String, val price: Double)

    //39
    private val produce = mutableListOf<Produce>()

    //40
    fun addProduce(produce: Produce) = produce.add(produce)

    //41
    fun getProduce(): List<Produce> = produce

}

//42
class FoodBanks {

    //43
    data class Supplies(val name: String)

    //44
    private val supplies = mutableListOf<Supplies>()

    //45
    fun addSupply(supply: Supplies) = supplies.add(supply)

    //46
    fun getSupplies(): List<Supplies> = supplies

}

//47
class FarmersMarkets {

    //48
    data class Goods(val name: String, val price: Double)

    //49
    private val goods = mutableListOf<Goods>()

    //50
    fun addGood(good: Goods) = goods.add(good)

    //51
    fun getGoods(): List<Goods> = goods

}

//52
class CommunityGardens {

    //53
    data class Crops(val name: String)

    //54
    private val crops = mutableListOf<Crops>()

    //55
    fun addCrop(crop: Crops) = crops.add(crop)

    //56
    fun getCrops(): List<Crops> = crops

}

//57
class FoodDelivery {

    //58
    data class Meals(val name: String, val price: Double)

    //59
    private val meals = mutableListOf<Meals>()

    //60
    fun addMeal(meal: Meals) = meals.add(meal)

    //61
    fun getMeals(): List<Meals> = meals

}

//62
class FoodTechnology {

    //63
    data class Machines(val name: String)

    //64
    private val machines = mutableListOf<Machines>()

    //65
    fun addMachine(machine: Machines) = machines.add(machine)

    //66
    fun getMachines(): List<Machines> = machines

}

//67
class FoodSafety {

    //68
    data class Practices(val name: String)

    //69
    private val practices = mutableListOf<Practices>()

    //70
    fun addPractice(practice: Practices) = practices.add(practice)

    //71
    fun getPractices(): List<Practices> = practices

}

//72
class FoodSustainability {

    //73
    data class Strategies(val name: String)

    //74
    private val strategies = mutableListOf<Strategies>()

    //75
    fun addStrategy(strategy: Strategies) = strategies.add(strategy)

    //76
    fun getStrategies(): List<Strategies> = strategies

}

//77
class FoodSecurity {

    //78
    data class Solutions(val name: String)

    //79
    private val solutions = mutableListOf<Solutions>()

    //80
    fun addSolution(solution: Solutions) = solutions.add(solution)

    //81
    fun getSolutions(): List<Solutions> = solutions

}

//82
class Nutrition {

    //83
    data class Information(val name: String)

    //84
    private val information = mutableListOf<Information>()

    //85
    fun addInformation(information: Information) = information.add(information)

    //86
    fun getInformation(): List<Information> = information

}

//87
class Health {

    //88
    data class Habits(val name: String)

    //89
    private val habits = mutableListOf<Habits>()

    //90
    fun addHabit(habit: Habits) = habits.add(habit)

    //91
    fun getHabits(): List<Habits> = habits

}

//92
class FoodWaste {

    //93
    data class Programs(val name: String)

    //94
    private val programs = mutableListOf<Programs>()

    //95
    fun addProgram(program: Programs) = programs.add(program)

    //96
    fun getPrograms(): List<Programs> = programs

}

//97
class FoodEducation {

    //98
    data class Resources(val name: String)

    //99
    private val resources = mutableListOf<Resources>()

    //100
    fun addResource(resource: Resources) = resources.add(resource)

    //101
    fun getResources(): List<Resources> = resources

}

//102
class GlobalFoodSystem {

    //103
    data class Policies(val name: String)

    //104
    private val policies = mutableListOf<Policies>()

    //105
    fun addPolicy(policy: Policies) = policies.add(policy)

    //106
    fun getPolicies(): List<Policies> = policies

}

//107
class FoodAccess {

    //108
    data class Issues(val name: String)

    //109
    private val issues = mutableListOf<Issues>()

    //110
    fun addIssue(issue: Issues) = issues.add(issue)

    //111
    fun getIssues(): List<Issues> = issues

}

//112
class FoodEconomy {

    //113
    data class Markets(val name: String)

    //114
    private val markets = mutableListOf<Markets>()

    //115
    fun addMarket(market: Markets) = markets.add(market)

    //116
    fun getMarkets(): List<Markets> = markets

}

//117
class FoodProduction {

    //118
    data class Techniques(val name: String)

    //119
    private val techniques = mutableListOf<Techniques>()

    //120
    fun addTechnique(technique: Techniques) = techniques.add(technique)

    //121
    fun getTechniques(): List<Techniques> = techniques

}

//122
class Aquaculture {

    //123
    data class Species(val name: String)

    //124
    private val species = mutableListOf<Species>()

    //125
    fun addSpecies(species: Species) = species.add(species)

    //126
    fun getSpecies(): List<Species> = species

}

//127
class PlantScience {

    //128
    data class Varieties(val name: String)

    //129
    private val varieties = mutableListOf<Varieties>()

    //130
    fun addVariety(variety: Varieties) = varieties.add(variety)

    //131
    fun getVarieties(): List<Varieties> = varieties

}

//132
class Livestock {

    //133
    data class Breeds(val name: String)

    //134
    private val breeds = mutableListOf<Breeds>()

    //135
    fun addBreed(breed: Breeds) = breeds.add(breed)

    //136
    fun getBreeds(): List<Breeds> = breeds

}

//137
class FoodSystems {

    //138
    data class Management(val name: String)

    //139
    private val management = mutableListOf<Management>()

    //140
    fun addManagement(management: Management) = management.add(management)

    //141
    fun getManagement(): List<Management> = management

}