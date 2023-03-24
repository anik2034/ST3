import java.util.ArrayList;
import java.util.List;

public class Student {

    private String fullName;
    private int age;
    private List<String> courses;

    public void setCourses(List<String> courses){
        this.courses = courses;
    }

    public boolean hasCourse(String course) {
        return this.courses.contains(course);
    }


    public int getNumberOfCourses(){
        return this.courses.size();
    }
    public String setFullName(String fullName){

        if(fullName.isEmpty() ||  !(fullName.matches("^[a-zA-Z\\s]*$"))){
          return "Full name is not valid";
        }
        this.fullName = fullName;
        return this.fullName;
    }

    public int setAge(int age){
        if(age < 18  || age > 80){
           //not valid
           return 0;
        }
        this.age = age;
        return this.age;
    }


}
