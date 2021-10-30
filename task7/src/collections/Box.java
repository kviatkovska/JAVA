package collections;
public class Box {
    private int id;
    private String name;
    private int grams;

    public Box() {
    }

    public Box(int id, String name, int grams) {
        this.id = id;
        this.name = name;
        this.grams = grams;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", grams=" + grams +
                '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

	
}
