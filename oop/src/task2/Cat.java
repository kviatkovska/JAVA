package task2;

import java.util.ArrayList;

public class Cat extends Animal {
    public static void main(String[] args) {
        private int id;
        public Cat(int id){
            this.id = id;
        }
        public int getId() {
            return id;
        }
        public void setId(int id){
            this.id = id;
        }
        List<Cats> catsList = new ArrayList<>();
        catsList.add(new Cat(1));
        catsList.add(new Cat(2));
        Cats.voice();
    }

}
