import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    public Student chelsea;

    @Before
    public void setup(){
        chelsea = new Student("Chelsea", 1L);
    }

    @Test
    public void testCreateStudentInstance(){
        assertNotNull(chelsea);
        Student coven = new Student("Coven", 2L);
        assertNotNull(chelsea);
        assertNotNull(coven);
    }

   @Test
    public void testStudentFields(){
       assertEquals("Chelsea", chelsea.getName());
       assertEquals(1L, chelsea.getId());
   }

   @Test
    public void testAddGrade(){
       chelsea.addGrade(100);
       assertEquals(100, (int) chelsea.getGrades().get(0));

   }

   @Test
    public void testGetAverage(){
       chelsea.addGrade(100);
       chelsea.addGrade(80);
       assertEquals(90.0, chelsea.getGradeAverage(), 0);
       chelsea.addGrade(90);
       assertEquals(93.33, chelsea.getGradeAverage(), 0.5);
   }

}
