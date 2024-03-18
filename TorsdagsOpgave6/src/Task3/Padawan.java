package Task3;

import java.util.ArrayList;

public class Padawan extends Person {
    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Padawan(String name, ArrayList<String> passedCourses) {
        super(name);

    }

    @Override
    public boolean addCourse(String course){
        if(passedCourses.contains(course)){
            System.out.println(getName() + " har allerede bestået " + course);
            return false;
        }else{
            currentCourses.add(course);
            System.out.println(getName() + " er nu tilmeldt " + course);
            return true;
        }
    }
}
