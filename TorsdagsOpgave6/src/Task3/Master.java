package Task3;

import java.util.ArrayList;

public class Master extends Person {
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Master(String name, ArrayList<String> canTeach) {
        super(name);
    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            System.out.println(getName() + " kan undervise i " + course);
            currentCourses.add(course);
            return true;
        } else {
            System.out.println(getName() + " kan ikke undervise i " + course);
            return false;
        }
    }


}
