package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Padawan padawan1 = new Padawan("Franck", new ArrayList<String>());
        Padawan padawan2 = new Padawan("Falcho", new ArrayList<String>());
        Master master1 = new Master("André", new ArrayList<String>());
        Master master2 = new Master("Qui-Gon", new ArrayList<String>());


        //System.out.println("\n" + "Testing passed courses and can teach\n");
        padawan1.passedCourses.add("Java 1.0");
        master1.canTeach.add("Java 1.0");
        master1.canTeach.add("Lightsabers for beginners");

        //System.out.println("Testing courses added\n");
        padawan1.addCourse("Lightsabers for beginners");
        padawan2.addCourse("Lightsabers for beginners");
        master1.addCourse("Lightsabers for beginners");
        master2.addCourse("Lightsabers for beginners");


        persons.add(padawan1);
        persons.add(padawan2);
        persons.add(master1);
        persons.add(master2);

        for(int i = 0; i < persons.size(); i++){
           persons.get(i).addCourse("Java 1.0");
        }
    }
}
