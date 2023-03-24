import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class StudentTest {

    @Test
    public void testHasCourse() {
        List<String> courses = new ArrayList<>();
        courses.add("History of Magic");
        courses.add("Defense Against the Dark Arts");
        Student st1 = new Student();
        st1.setAge(18);
        st1.setFullName("Hermione Granger");
        st1.setCourses(courses);
        assertEquals(false, st1.hasCourse("Transfiguration"), "Granger does not have Transfiguration");
        assertEquals(true, st1.hasCourse("History of Magic"), "Granger has History of Magic");

    }

    @Test
    public void testGetNumberOfCourses() {
        List<String> courses = new ArrayList<>();
        courses.add("Music Theory");

        Student st1 = new Student();
        st1.setAge(37);
        st1.setFullName("Lana Del Rey");
        st1.setCourses(courses);
        assertEquals(1, st1.getNumberOfCourses(), "Lana has 1 course");
        courses = new ArrayList<>();
        st1.setCourses(courses);
        assertEquals(0, st1.getNumberOfCourses(), "Lana has 0 courses");
    }

    @Test
    public void testSetFullName() {
        List<String> courses = new ArrayList<>();
        courses.add("Creative Writing");

        Student st1 = new Student();
        st1.setAge(46);
        st1.setCourses(courses);
        assertEquals("Oscar Wilde", st1.setFullName("Oscar Wilde"), "Student is Oscar Wilde");
        assertEquals("Full name is not valid", st1.setFullName(""), "Name is empty");
        assertEquals("Full name is not valid", st1.setFullName("Oscar777"), "Name contains numbers");
        assertEquals("Full name is not valid", st1.setFullName("Wilde!"), "Name contains special characters");
    }

    @Test
    public void testSetAge() {
        List<String> courses = new ArrayList<>();
        courses.add("French Cooking");
        courses.add("Art of Culinary");

        Student st1 = new Student();
        st1.setFullName("Gordon Ramsey");
        st1.setCourses(courses);
        assertEquals(56, st1.setAge(56), "Ramsey is 56");
        assertEquals(0, st1.setAge(13), "Age is less than 18");
        assertEquals(0, st1.setAge(89), "Age is more than 80");
    }
}