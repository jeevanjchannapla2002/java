class GoldShopRunner{

	public static void main(String[] args){
	
	boolean isAdded = GoldShop.addGoldItem("Ring");
	System.out.println("The Gold added is :  " + isAdded);
	
		isAdded = GoldShop.addGoldItem("EarRing");
	System.out.println("The Gold added is :  " + isAdded);
	 
		isAdded = GoldShop.addGoldItem("Choker");
	System.out.println("The Gold added is :  " + isAdded);
		
		isAdded = GoldShop.addGoldItem("Braclet");
	System.out.println("The Gold added is :  " + isAdded);
	
		isAdded = GoldShop.addGoldItem("Anklets");
	System.out.println("The Gold added is :  " + isAdded);
		
		isAdded = GoldShop.addGoldItem("Bangles");
	System.out.println("The Gold added is :  " + isAdded);
	
		isAdded = GoldShop.addGoldItem("Chains");
	System.out.println("The Gold added is :  " + isAdded);
	
	
	GoldShop.getAllGoldItems();
	
	boolean Update = GoldShop.updateGoldItems( "Bangles","RoseGoldChain" );
	System.out.println(Update);
	GoldShop.getAllGoldItems();
	
	boolean delete = GoldShop.deleteGoldItem("papidi");
	System.out.println(delete);
	GoldShop.getAllGoldItems();
	
	}


}