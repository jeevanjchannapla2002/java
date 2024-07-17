class Zomato{

    public static double takeOrder(String foodItems){
        if(foodItems == "Biryani"){
            return 299.00;
        }
        if(foodItems == "Dosa"){
            return 109.00;
        }
        if(foodItems == "Puliyogare"){
            return 129.00;
        }
        if(foodItems == "Neer Dosa"){
            return 119.00;
        }
        if(foodItems == "Akki Roti"){
            return 99.00;
        }
        if(foodItems == "Mysore Masala Dosa"){
            return 139.00;
        }
        if(foodItems == "Pulao"){
            return 159.00;
        }
        if(foodItems == "Ghee Roast Dosa"){
            return 149.00;
        }
        if(foodItems == "Ragi Mudde"){
            return 109.00;
        }
        if(foodItems == "Rava Idli"){
            return 79.00;
        }
        if(foodItems == "Kesari Bath"){
            return 89.00;
        }
        if(foodItems == "Chaat"){
            return 99.00;
        }
        if(foodItems == "Mangalorean Fish Curry"){
            return 219.00;
        }
        else {
            System.out.println(foodItems + " not found");
        }
		return 0.0;
	}
	
	public static double takeOrder(String foodItems,int quantity){
	double price = takeOrder(foodItems);
        if (price > 0) {
			price *= quantity;
            System.out.println("Order placed for: "+foodItems+"of "+ quantity);
            return price;
		}
		else{
			 System.out.println("please select the item correctly!!");
		}
		return price;
}
}
