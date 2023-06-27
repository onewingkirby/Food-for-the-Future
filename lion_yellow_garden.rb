# Food for the Future - Ruby Program

# Food Class Definition
class Food
  attr_accessor :type
  attr_accessor :name
  attr_accessor :price
  attr_accessor :nutrition
 
  def initialize(type, name, price, nutrition)
    @type = type
    @name = name
    @price = price
    @nutrition = nutrition
  end
 
  def to_s
    "Type of Food: #{@type}\nName: #{@name}\nPrice: #{@price}\nNutrition: #{@nutrition}\n\n"
  end
end
 
# Food List from User Input 
def get_food_list
  puts "Please enter the information for the food item:"
  puts "What type of food is it?: "
  type = gets.chomp
  puts "What is the name of the food?: "
  name = gets.chomp
  puts "What is the price of the food?: "
  price = gets.to_f
  puts "What is the nutrition content of the food?: "
  nutrition = gets.to_i
 
  Food.new(type, name, price, nutrition)
end

# Initialize Array of Food Objects
food_array = []

# Prompt User for Number of Food Items
puts "How many food items would you like to enter?: "
num_foods = gets.to_i

# Create Food Objects and Store in Array
for i in 1..num_foods
  food_array.push(get_food_list)
end

# Display Food Array
puts "These are the food items you've entered:"
food_array.each { |food| puts food.to_s}

# Calculate and Display Average Price
# Initialize Variables
total_price = 0.0
avg_price = 0.0

# Calculate Total Price
food_array.each do |food|
total_price += food.price
end

# Calculate Average Price
avg_price = (total_price/num_foods).round(2)
 
# Display Average Price 
puts "The average price of the food items is: #{avg_price}"

# Calculate and Display Average Nutrition
# Initialize Variables
total_nutrition = 0
avg_nutrition = 0

# Calculate Total Nutrition
food_array.each do |food|
  total_nutrition += food.nutrition
end

# Calculate Average Nutrition
avg_nutrition = (total_nutrition/num_foods).round

# Display Average Nutrition
puts "The average nutrition content of the food items is: #{avg_nutrition}"