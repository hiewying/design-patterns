package kerryvending;

//Item
public enum Item{ 
	PEPSI("PEPSI", 100), COFFEE("COFFEE", 65), TEA("TEA", 50);
	private String name; 
	private int price; 
	private Item(String name, int price){ 
		this.name = name; this.price = price; 
	} 
	public String getName(){ 
		return name; 
	} 
	public int getPrice(){ 
		return price; 
	} 	
}