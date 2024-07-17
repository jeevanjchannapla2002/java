import java.util.*;
class Gym{

	static String gymName = "Classic Fittness";
	static String ownerName = "N Nagraja";
	static String gymEquips[] = {null,null,null,null,null,null,null,null};
	static int gymindex;
	
	public static boolean createGymEquipments(String gymEquip){
	
	System.out.println("List of equipments strated");
		boolean isListCreated = false;
		if(gymEquips != null){
		gymEquips[gymindex] = gymEquip;
		gymindex++;
		isListCreated = true;
		}
		System.out.println("List of equipments ended");
		return isListCreated;
	} 
	public static void getEquipments(){
	System.out.println("Getting the list ");
	
	for(String gymEquip : gymEquips)
	System.out.println(gymEquip);

	System.out.println("Got the list");
	}
public static boolean deleteGymEquipments(String gymEquipToBeDeleted){
System.out.println("delete started");
boolean isGymEquipmentsDeleted=false;
int oldIndex,newSize;
for(oldIndex=0,newSize=0;oldIndex<gymEquips.length; oldIndex++){
if(gymEquips[oldIndex]!=gymEquipToBeDeleted)
{
	gymEquips[newSize]=gymEquips[oldIndex];
	newSize++;
}
}
gymEquips=Arrays.copyOf(gymEquips,newSize);
if(gymEquips!=null){
	isGymEquipmentsDeleted=true;
}
if(isGymEquipmentsDeleted==false){
	System.out.println(gymEquipToBeDeleted + "not found");
}
	System.out.println("delete ended");
	return isGymEquipmentsDeleted;
}
}

	
	
	
	
	
	
	
