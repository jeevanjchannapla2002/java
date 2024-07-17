class ZomatoRunner{
    public static void main(String orders[]) {
        System.out.println("---The Items Available on Zomato in Bangalore are----");
        double item1 = Zomato.takeOrder("Biryani");
        System.out.println("Biryani: " + item1);
        double item2 = Zomato.takeOrder("Dosa");
        System.out.println("Dosa: " + item2);
        double item3 = Zomato.takeOrder("Puliyogare");
        System.out.println("Puliyogare: " + item3);
        double item4 = Zomato.takeOrder("Neer Dosa");
        System.out.println("Neer Dosa: " + item4);
        double item5 = Zomato.takeOrder("Akki Roti");
        System.out.println("Akki Roti: " + item5);
        double item6 = Zomato.takeOrder("Mysore Masala Dosa");
        System.out.println("Mysore Masala Dosa: " + item6);
        double item7 = Zomato.takeOrder("Pulao");
        System.out.println("Pulao: " + item7);
        double item8 = Zomato.takeOrder("Ghee Roast Dosa");
        System.out.println("Ghee Roast Dosa: " + item8);
        double item9 = Zomato.takeOrder("Ragi Mudde");
        System.out.println("Ragi Mudde: " + item9);
        double item10 = Zomato.takeOrder("Rava Idli");
        System.out.println("Rava Idli: " + item10);
        double item11 = Zomato.takeOrder("Kesari Bath");
        System.out.println("Kesari Bath: " + item11);
        double item12 = Zomato.takeOrder("Chat");
        System.out.println("Chaat: " + item12);
        double item13 = Zomato.takeOrder("Mangalorean Fish Curry");
        System.out.println("Mangalorean Fish Curry: " + item13);
        System.out.println("---End of list---");
		 double item14 = Zomato.takeOrder("Biryani",4);
        System.out.println("Biryani: " + item1);
        double item15 = Zomato.takeOrder("Dosa",3);
        System.out.println("Dosa: " + item2);
	
	
	
	
	
	}








}
