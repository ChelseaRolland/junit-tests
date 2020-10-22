import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CohortTest {

    public Cohort moon;
    public Cohort slate;
    public Student chelsea;
    public Student alyis;
    public Student stratus;

    @Before
    public void setup() {
        //Empty
        slate = new Cohort();

        //Multiple Students
        moon = new Cohort();
        chelsea = new Student("Chelsea", 1L);
        alyis = new Student("Alyis", 2L);
        stratus = new Student("Stratus", 3L);

        moon.addStudent(chelsea);
        moon.addStudent(alyis);
    }

    @Test
    public void testAddStudent(){
        moon.addStudent(stratus);
        assertEquals(stratus, moon.getStudents().get(3));
    }

    @Test
    public void testCurrentStudent(){
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
