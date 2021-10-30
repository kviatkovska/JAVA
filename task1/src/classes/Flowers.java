package classes;
public class Flowers {
	private int Id;
	private String Name;
	private String Color;
	private int Price;
	private String Shop;
	public Flowers (int Id, String Name, String Color, int Price, String Shop) {
	this.Id = Id;
	this.Name = Name;
	this.Color = Color;
	this.Price = Price;
	this.Shop = Shop;
	}

	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getColor() {
		return Color;
	}
	
	public void setColor(String color) {
		Color = color;
	}
	
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	public String getShop() {
		return Shop;
	}
	
	public void setShop(String shop) {
		Shop = shop;
	}
	
	@Override
	public String toString () {
		return ("¹ " + Id + "\n" + 
	            "Name: " + Name + "\n" + 
				"Color: " + Color + "\n" + 
	            "Price: " + Price + "\n" + 
				"Shop: " + Shop + "\n");
	}
	
}