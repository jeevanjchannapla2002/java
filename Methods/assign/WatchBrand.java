import java.util.Arrays;
class WatchBrand{
static String  watchBrandName="sari";
static String address="";

   static String watchNames[]={null,null,null,null,null,null,null,null,null,null};
   static int watchNameindex;
   
   public static boolean createWatchNames(String watchName){
   System.out.println("watch Brand started");
   boolean isWatchNameCreated=false;
   if(watchNameindex<watchNames.length){
   if(watchName !=null){
   watchNames[watchNameindex]=watchName;
   watchNameindex++;
   isWatchNameCreated=true;
   }
   else{
   System.out.println("Watch name is null ");
   }
   }
   System.out.println("Watch Brand ended ");
   return isWatchNameCreated;
   }
   public static boolean updateWatchNames(String oldWatchName, String newWatchName){
				System.out.println("newChatName updated");
	boolean isUpdateWatchName = false;
					for(int index = 0;index<watchNames.length; index++){
						if(oldWatchName == watchNames[index]){
							watchNames[index] = newWatchName;
							isUpdateWatchName = true;
						}
					}
					if(isUpdateWatchName == false){
							System.out.println(oldWatchName + "not found");
					}
				System.out.println(" updated watchName ended");
				return isUpdateWatchName;
			}			
		public static void getWatchNames(){
			for(String watchName:watchNames)
				System.out.println("The name of watch: " + watchName);
				
	}

	public static boolean deleteWatchName(String watchNametobeDeleted){
	System.out.println("deleteWatchName started");
	boolean isWatchNameDeleted =false;
	int newIndex,oldIndex;
	for(newIndex=0,oldIndex=0;oldIndex<watchNames.length;oldIndex++){
		if(watchNames[oldIndex]!= watchNametobeDeleted){
			watchNames[newIndex] = watchNames[oldIndex];
			newIndex++;
		}
	}
	watchNames = Arrays.copyOf(watchNames,newIndex);
	if(watchNames!=null){
		isWatchNameDeleted=true;
	}
	if(isWatchNameDeleted==false){
           System.out.println(watchNametobeDeleted+" not found"); 
	}
		System.out.println("deleteWatchName deleted");
			 return isWatchNameDeleted;
}
}