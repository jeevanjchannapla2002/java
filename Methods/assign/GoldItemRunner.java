class GoldItemRunner{

public static void main(String gold[]){

System.out.println("main started");
    boolean goldCreate=GoldItem.createGoldNames("Nose Pin");
	System.out.println(goldCreate);
	goldCreate=GoldItem.createGoldNames("Diamond");
	System.out.println(goldCreate);
	goldCreate=GoldItem.createGoldNames("Anklet");
	System.out.println(goldCreate);
	goldCreate=GoldItem.createGoldNames("Crown");
	System.out.println(goldCreate);
	goldCreate=GoldItem.createGoldNames("Ear Stud");
	System.out.println(goldCreate);
	goldCreate=GoldItem.createGoldNames("Emerald");
	System.out.println(goldCreate);
	goldCreate=GoldItem.createGoldNames("Zircon");
	System.out.println(goldCreate);
	
	
	GoldItem.getGoldNames();
	boolean goldUpdate=GoldItem.updateGoldNames("Crown","Brooch");
	GoldItem.getGoldNames();
	System.out.println("main ended");
	

}


}
