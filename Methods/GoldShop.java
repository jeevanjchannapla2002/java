import java.util.Arrays;
class GoldShop{
	
		static String name = "MALABAR";
	
	
		static String goldNames[] = {null,null,null,null,null,null,null};
		static int goldNameindex;
		
	public static boolean addGoldItem(String goldName){
	
		System.out.println("Gold name list is  Started");
		
			boolean isCreatedGoldName = false;
				if(goldNameindex < goldNames.length){
					if(goldName != null){
						goldNames[goldNameindex] = goldName;
						goldNameindex++;				
			      isCreatedGoldName  = true;
					}
				else System.out.println("The item list is full ");
			}

				else System.out.println("The item is not found ");
				System.out.println("Create chart name ended ");
	

			return isCreatedGoldName;

	}
	
			public static void getAllGoldItems(){
	
				System.out.println("Get GoldNames Started ");
				for(String goldName : goldNames)
				System.out.println(goldName);
				
				System.out.println("Get method ended");
			}
	
			public static boolean updateGoldItems(String oldGoldName , String newGoldName){
				System.out.println("UpdateGoldItems started");
				boolean isGoldItemUpadted = false;
				for (int index = 0; index < goldNames.length; index++ ){
				if(oldGoldName == goldNames[index]){
				goldNames[index] = newGoldName;
				isGoldItemUpadted = true;
			
		}
		
	}
	if (isGoldItemUpadted == false)
			System.out.println("The goldname is not found");
	return isGoldItemUpadted;
}	
	
		public static boolean deleteGoldItem(String goldNameToBeDeleted){
			System.out.println("deleted item list is started");
			boolean isDeletedGoldItem = false;
			int newIndex, oldIndex;
				for(newIndex = 0, oldIndex = 0; oldIndex < goldNames.length ; oldIndex++){
					if(goldNames[oldIndex] != goldNameToBeDeleted){
							goldNames[newIndex] = goldNames[newIndex];
							newIndex++;
					
					}
					else{
					
					isDeletedGoldItem = true;
					}
					
				}
				goldNames = Arrays.copyOf(goldNames, newIndex);
				
				if (isDeletedGoldItem == false)
				{
				
					System.out.println("not found" + goldNameToBeDeleted );
				}
			System.out.println("deleted item list is ended");
			return isDeletedGoldItem;
		
		}
	
	
	

	
	
}