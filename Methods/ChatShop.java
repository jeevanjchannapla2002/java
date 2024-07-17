class ChatShop{

	static	String  chatShopName  = "";
		static String address = "";
		
		
	static	String chatNames[] = {null, null, null};
	static double chatprices[] = {0.0, 0.0, 0.0}; 
	 static int index;
		
		public static boolean createChatNames(String chatName){
			System.out.println("Chat Shop opened");
			boolean	isChatNameCreated = false;
			//validation
					if(chatName != null){
						   chatNames[index] = chatName;
						   index++;
						   
					isChatNameCreated = true;
					
					}
					else{
						System.out.println("Chat name is null");
					
					}
			
			
			
			System.out.println("Chat Shop closed");
			return isChatNameCreated;	
		
		}
		
			public static double addChatPrice(double chatPrice ){
				//boolean	isChatPriceCreated = false;
		…
