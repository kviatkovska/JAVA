package task3;
public abstract class Book implements Edition{
  public String name;
  public String type;
  public int quantity;
  
  @Override
  public String getName() {
	  return name;
  }
  @Override
  public String getType() {
	  return type;
  }
  @Override
  public int getQuantity() {
	  return quantity;
  }
  public Book(String n, String t, int q) {
	  this.name = n;
	  this.type = t;
	  this.quantity=q;
  }
  
}