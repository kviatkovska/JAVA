package task4;

import java.util.ArrayList;

public class Person {
        public int id;
        public String firstName;
        public String lastName;
        public int age;

        Person(int id, String firstName, String lastName, int age){
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

   public static void main(String[] args) {
       ArrayList<Person> list = new ArrayList<Person>();

       list.add(new Person(1, "Name1", "Lastname", 10));
       list.add(new Person(2, "DName2", "Lastname2", 20));
       list.add(new Person(3, "Name3", "Lastname3", 30));
       list.add(new Person(4, "DName3", "Lastname3", 30));

       for(Person person : list){
           if(person.firstName.charAt(0) == 'D'){
               System.out.println(person.id + " " + person.firstName + " " + person.lastName + " " + person.age);
           }
       }
   }
}
