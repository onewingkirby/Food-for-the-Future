#include <iostream>

#define PI 3.1415

using namespace std;

class FoodForTheFuture {
public:
	int _calories;
	int _nutrients;
	float _price;

	FoodForTheFuture(int calories, int nutrients, float price) : _calories(calories), _nutrients(nutrients), _price(price) {
	}

	int getCalories(){
		return _calories;
	}

	int getNutrients(){
		return _nutrients;
	}

	float getPrice() {
		return _price;
	}

	void setCalories(int calories) {
		_calories = calories;
	}

	void setNutrients(int nutrients) {
		_nutrients = nutrients;
	}

	void setPrice(float price) {
		_price = price;
	}
};

class Cheese : public FoodForTheFuture {
public:
	Cheese(int calories, int nutrients, float price) : FoodForTheFuture(calories, nutrients, price) {
	}

	float getCheesePrice() {
		return _price;
	}
};

class Fruit : public FoodForTheFuture {
public:
	Fruit(int calories, int nutrients, float price) : FoodForTheFuture(calories, nutrients, price) {
	}

	float getFruitPrice() {
		return _price;
	}
};

class Vegetable : public FoodForTheFuture {
public:
	Vegetable(int calories, int nutrients, float price) : FoodForTheFuture(calories, nutrients, price) {
	}

	float getVegetablePrice() {
		return _price;
	}
};

int main() {
	Cheese cheese(200, 5, 10.99);
	Fruit fruit(150, 10, 5.99);
	Vegetable vegetable(100, 3, 3.99);

	cout << "Cheese Price: " << cheese.getCheesePrice() << endl;
	cout << "Fruit Price: " << fruit.getFruitPrice() << endl;
	cout << "Vegetable Price: " << vegetable.getVegetablePrice() << endl;

	return 0;
}