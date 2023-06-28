// Line 1
const futureFood = {
  name: "",
  description: "",
  forms: []
};

// Line 2
class FutureFoodForm {
  constructor(name, description) {
    this.name = name;
    this.description = description;
  }
}

// Line 3
class PlantBasedProteinForm extends FutureFoodForm {
  constructor(name, description, calories, proteins) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
  }
}

// Line 4
class InsectBasedProteinForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, type) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.type = type;
  }
}

// Line 5
class AlgaeBasedProteinForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, color) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.color = color;
  }
}

// Line 6
class CellCulturedMeatForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, type) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.type = type;
  }
}

// Line 7
class LabGrownMeatForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, type) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.type = type;
  }
}

// Line 8
class InsectBasedSnackForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, type) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.type = type;
  }
}

// Line 9
class AlgaeBasedSnackForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, color) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.color = color;
  }
}

// Line 10
class SeaweedBasedSnackForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, flavor) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.flavor = flavor;
  }
}

// Line 11
class PlantBasedBeverageForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, sugars) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.sugars = sugars;
  }
}

// Line 12
class InsectBasedBeverageForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, type) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.type = type;
  }
}

// Line 13
class AlgaeBasedBeverageForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, color) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.color = color;
  }
}

// Line 14
class SeaweedBasedBeverageForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, flavor) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.flavor = flavor;
  }
}

// Line 15
class PlantBasedDairyForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, calcium, lactose) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.calcium = calcium;
    this.lactose = lactose;
  }
}

// Line 16
class InsectBasedDairyForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, type) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.type = type;
  }
}

// Line 17
class AlgaeBasedDairyForm extends FutureFoodForm {
  constructor(name, description, calories, proteins, calcium, color) {
    super(name, description);
    this.calories = calories;
    this.proteins = proteins;
    this.calcium = calcium;
    this.color = color;
  }
}

// Line 18
futureFood.name = "Food for the Future";
futureFood.description = "A selection of food forms designed to provide sustenance to future generations.";

// Line 19
futureFood.forms.push(new PlantBasedProteinForm(
  "Plant-Based Burger", 
  "A vegan, plant-based burger made from peas, soy, and wheat.", 
  200, 
  15
));

// Line 20
futureFood.forms.push(new InsectBasedProteinForm(
  "Cricket Burger",
  "A sustainable, insect-based burger made from crickets.",
  250,
  30,
  "Cricket"
));

// Line 21
futureFood.forms.push(new AlgaeBasedProteinForm(
  "Algae Burger",
  "A sustainable, algae-based burger made from spirulina.",
  280,
  28,
  "Green"
));

// Line 22
futureFood.forms.push(new CellCulturedMeatForm(
  "Cultured Chicken Breast",
  "A sustainable, cell-cultured chicken breast made from animal cells.",
  300,
  32,
  "Chicken"
));

// Line 23
futureFood.forms.push(new LabGrownMeatForm(
  "Lab-Grown Steak",
  "A sustainable, lab-grown steak made from animal cells.",
  350,
  40,
  "Beef"
));

// Line 24
futureFood.forms.push(new InsectBasedSnackForm(
  "Beetle Chips",
  "A sustainable, insect-based snack made from beetles.",
  200, 
  10,
  "Beetle"
));

// Line 25
futureFood.forms.push(new AlgaeBasedSnackForm(
  "Kelp Chips",
  "A sustainable, algae-based snack made from kelp.",
  150,
  6,
  "Green"
));

// Line 26
futureFood.forms.push(new SeaweedBasedSnackForm(
  "Seaweed Snack",
  "A sustainable, seaweed-based snack made from seaweed.",
  100,
  4,
  "Umami"
));

// Line 27
futureFood.forms.push(new PlantBasedBeverageForm(
  "Oatmilk Smoothie",
  "A vegan, plant-based smoothie made from oats and fruits.",
  250,
  10,
  5
));

// Line 28
futureFood.forms.push(new InsectBasedBeverageForm(
  "Cricket Smoothie",
  "A sustainable, insect-based smoothie made from crickets and fruits.",
  300,
  20,
  "Cricket"
));

// Line 29
futureFood.forms.push(new AlgaeBasedBeverageForm(
  "Algae Smoothie",
  "A sustainable, algae-based smoothie made from spirulina and fruits.",
  350,
  25,
  "Green"
));

// Line 30
futureFood.forms.push(new SeaweedBasedBeverageForm(
  "Seaweed Smoothie",
  "A sustainable, seaweed-based smoothie made from seaweed and fruits.",
  400,
  30,
  "Umami"
));

// Line 31
futureFood.forms.push(new PlantBasedDairyForm(
  "Almond Milk",
  "A vegan, plant-based milk made from almonds.",
  150,
  8,
  50,
  0
));

// Line 32
futureFood.forms.push(new InsectBasedDairyForm(
  "Cricket Milk",
  "A sustainable, insect-based milk made from crickets.",
  200,
  15,
  "Cricket"
));

// Line 33
futureFood.forms.push(new AlgaeBasedDairyForm(
  "Algae Milk",
  "A sustainable, algae-based milk made from spirulina.",
  300,
  20,
  100,
  "Green"
));

// Line 34
const store = {
  name: "Food for the Future Store",
  description: "A store created to provide food forms designed to provide sustenance to future generations.",
  items: [],
};

// Line 35
class StoreItem {
  constructor(name, description, quantity, price) {
    this.name = name;
    this.description = description;
    this.quantity = quantity;
    this.price = price;
  }
}

// Line 36
class PlantBasedProteinItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
  }
}

// Line 37
class InsectBasedProteinItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, type) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.type = type;
  }
}

// Line 38
class AlgaeBasedProteinItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, color) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.color = color;
  }
}

// Line 39
class CellCulturedMeatItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, type) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.type = type;
  }
}

// Line 40
class LabGrownMeatItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, type) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.type = type;
  }
}

// Line 41
class InsectBasedSnackItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, type) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.type = type;
  }
}

// Line 42
class AlgaeBasedSnackItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, color) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.color = color;
  }
}

// Line 43
class SeaweedBasedSnackItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, flavor) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.flavor = flavor;
  }
}

// Line 44
class PlantBasedBeverageItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, sugars) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.sugars = sugars;
  }
}

// Line 45
class InsectBasedBeverageItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, type) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.type = type;
  }
}

// Line 46
class AlgaeBasedBeverageItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, color) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.color = color;
  }
}

// Line 47
class SeaweedBasedBeverageItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, flavor) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.flavor = flavor;
  }
}

// Line 48
class PlantBasedDairyItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, calcium, lactose) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.calcium = calcium;
    this.lactose = lactose;
  }
}

// Line 49
class InsectBasedDairyItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, type) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.type = type;
  }
}

// Line 50
class AlgaeBasedDairyItem extends StoreItem {
  constructor(name, description, quantity, price, calories, proteins, calcium, color) {
    super(name, description, quantity, price);
    this.calories = calories;
    this.proteins = proteins;
    this.calcium = calcium;
    this.color = color;
  }
}

// Line 51
store.items.push(new PlantBasedProteinItem(
  "Plant-Based