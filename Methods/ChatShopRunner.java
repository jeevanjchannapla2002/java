class ChatShopRunner{

	public static void main(String chat[]){
	
		System.out.println("main started");
		
			boolean chatCreate = ChatShop.createChatNames("Pani puri");
				System.out.println(chatCreate);
			   double amount = ChatShop.addChatPrice(40.0);
					System.out.println(amount);
			
			chatCreate = ChatShop.createChatNames("aloo puri");
				System.out.println(chatCreate);
					amount = ChatShop.addChatPrice(50.0);
						System.out.println(amount);
				
			chatCreate = ChatShop.createChatNames("Bhel Puri");
				System.out.println(chatCreate);
					amount = ChatShop.addChatPrice(60.0);
						System.out.println(amount);
		
		ChatShop.getChatNames();
		
		ChatShop.getChatPrices();
		System.out.println("main ended");
	
	
	
	}




}