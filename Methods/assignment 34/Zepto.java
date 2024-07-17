class Zepto{

    public static double takeOrder(String foodItems){
        
		
		if (foodItems == "Kurkure"){
            return 20.00;
         }
          if (foodItems == "Apple Juice"){
            return 50.00;
        }
        if (foodItems == "Cheese Slices"){
            return 30.00;
        }
        if (foodItems == "Chocolate Box"){
            return 100.00;
        }
        if (foodItems == "Amul Butter"){
            return 60.00;
        }
        if (foodItems == "Banana"){
            return 10.00;
        }
        if (foodItems == "Milk"){
            return 25.00;
        }
        if (foodItems == "Bread"){
            return 30.00;
        }
        if (foodItems == "Eggs"){
            return 40.00;
        }
        if (foodItems == "Peanut Butter"){
            return 70.00;
        }
        if (foodItems == "Yogurt"){
            return 15.00;
        }
        if (foodItems == "Instant Noodles"){
            return 40.00;
        }
        if (foodItems == "Cereal"){
            return 55.00;
        }
        if (foodItems == "Ice Cream"){
            return 80.00;
        }
        if (foodItems == "Chips"){
            return 25.00;
        }
        else {
            System.out.println(foodItems + " not found");
		
        }
    
	return 0.0;
	}
	 public static double takeOrder(String foodItems, int quantity){
        double price = 0.0;

        if (foodItems == "Kurkure") {
            price = 20.00 * quantity;
			return price;
        }
        if (foodItems == "Apple Juice") {
            price = 50.00 * quantity;
			return price;
        }
        if (foodItems == "Cheese Slices") {
            price = 30.00 * quantity;
			return price;
        }
        if (foodItems == "Chocolate Box") {
            price = 100.00 * quantity;
			return price;
        }
        if (foodItems == "Amul Butter") {
            price = 60.00 * quantity;
			return price;
        }
        if (foodItems == "Banana") {
            price = 10.00 * quantity;
			return price;
        }
        if (foodItems == "Milk") {
            price = 25.00 * quantity;
			return price;
        }
        if (foodItems == "Bread") {
            price = 30.00 * quantity;
			return price;
        }
        if (foodItems == "Eggs") {
            price = 40.00 * quantity;
			return price;
        }
        if (foodItems == "Peanut Butter") {
            price = 70.00 * quantity;
			return price;
        }
        if (foodItems == "Yogurt") {
            price = 15.00 * quantity;
			return price;
        }
        if (foodItems == "Instant Noodles") {
            price = 40.00 * quantity;
			return price;
        }
        if (foodItems == "Cereal") {
            price = 55.00 * quantity;
			return price;
        }
        if (foodItems == "Ice Cream") {
            price = 80.00 * quantity;
			return price;
        }
        if (foodItems == "Chips") {
            price = 25.00 * quantity;
			return price;
        }
        
        else {
            System.out.println("item not found");
		
        }
	return price;
	}
	
	
}
