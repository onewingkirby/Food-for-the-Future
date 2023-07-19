//File Declaration
let foodForFuture = { 
    
    //Array of food objects 
    food: [
        {
            name: 'Fruit',
            ingredients: ['apples', 'oranges', 'bananas', 'strawberries'],
            healthBenefits: 'A diet rich in fruits and vegetables helps to maintain a healthy weight and reduce risk of heart disease, stroke, cancer and diabetes.'
        },
        {
            name: 'Grains',
            ingredients: ['rice', 'oats', 'quinoa', 'couscous'],
            healthBenefits: 'Grains contain various important nutrients, including fiber, B vitamins and minerals. They provide a source of energy, which is important for keeping your body functioning properly.'
        },
        {
            name: 'Vegetables',
            ingredients: ['broccoli', 'tomatoes', 'carrots', 'spinach'],
            healthBenefits: 'Vegetables are loaded with many vitamins, minerals and other essential nutrients. Eating a variety of vegetables can help you get the nutrients your body needs for health and wellbeing.'
        },
        {
            name: 'Protein',
            ingredients: ['beans', 'lentils', 'tofu', 'tempeh'],
            healthBenefits: 'Protein is important for a healthy body. It helps build and maintain your muscles, organs, skin, hair and nails and is essential for energy and growth.'
        },
        {
            name: 'Dairy',
            ingredients: ['milk', 'yogurt', 'cheese', 'eggs'],
            healthBenefits: 'Dairy is an important and nutritious food group. It provides calcium and vitamin D, which are essential for strong bones and teeth and for reducing the risk of osteoporosis.'
        },
        {
            name: 'Nuts and Seeds',
            ingredients: ['almonds', 'walnuts', 'pumpkin seeds', 'flaxseeds'],
            healthBenefits: 'Nuts and seeds are very nutritious and are an excellent source of healthy fats, fiber, protein, vitamins and minerals. Eating nuts and seeds as part of a healthy diet can help reduce cholesterol levels and improve heart health.'
        },
    ],
    
    //Function to add food objects to the array of food objects
    addFood: (name, ingredients, healthBenefits) => {
        foodForFuture.food.push({
            name: name,
            ingredients: ingredients,
            healthBenefits: healthBenefits
        });
    },
    
    //Function to remove food objects from the array of food objects
    removeFood: (name) => {
        for (let i=0; i<foodForFuture.food.length; i++){
            if (foodForFuture.food[i].name === name){
                foodForFuture.food.splice(i, 1);
            }
        }
    },
    
    //Function to print out all the food objects in the array of food objects
    listFoods: () => {
        foodForFuture.food.forEach(food => {
            console.log(food.name);
            console.log("Ingredients: " + food.ingredients);
            console.log("Health Benefits: " + food.healthBenefits);
            console.log("\n");
        });
    },
    
    //Function to print out the ingredients of a specified food object
    listIngredients: (name) => {
        foodForFuture.food.forEach(food => {
            if (food.name === name){
                console.log("Ingredients of " + name);
                food.ingredients.forEach(ingredient => {
                    console.log(ingredient);
                });
            }
        });
    },
    
    //Function to print out the health benefits of a specified food object
    listHealthBenefits: (name) => {
        foodForFuture.food.forEach(food => {
            if (food.name === name){
                console.log("Health Benefits of " + name);
                console.log(food.healthBenefits);
            }
        });
    }
    
};