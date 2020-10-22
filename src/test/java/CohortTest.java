import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CohortTest {

    public Cohort moonEmpty;
    public Cohort pulseOne;
    public Cohort slateMany;
    public Student chelsea;
    public Student alyis;
    public Student stratus;

    @Before
    public void setup() {
        //Instantiate
        moonEmpty = new Cohort();
        pulseOne = new Cohort();
        slateMany = new Cohort();

        //Students
        chelsea = new Student("Chelsea", 1L);
        alyis = new Student("Alyis", 2L);
        stratus = new Student("Stratus", 3L);

        //Adding Grades
        chelsea.addGrade(100);
        alyis.addGrade(80);
        alyis.addGrade(90);
        alyis.addGrade(70);

        //adding to cohort
        pulseOne.addStudent(chelsea);

        slateMany.addStudent(chelsea);
        slateMany.addStudent(alyis);
    }

    @Test
    public void testAddStudent(){
        slateMany.addStudent(stratus);
        assertEquals("Stratus", slateMany.getStudents().get(2).getName());
        slateMany.addStudent(new Student("Lofi Misses", 5L));
        assertEquals("Lofi Misses", slateMany.getStudents().get(3).getName());
        assertEquals(4, slateMany.getStudents().size());
    }

    @Test
    public void testCurrentStudent(){
        assertEquals(0, moonEmpty.getStudents().size());
        assertEquals(1, pulseOne.getStudents().size());

        assertEquals(1, slateMany.getStudents().get(0).getId());
        assertEquals(2, slateMany.getStudents().get(1).getId());
    }

    @Test
    public void testGetAverage(){
        assertEquals(Double.NaN, moonEmpty.getCohortAverage(), 0);
        assertEquals(100.0, pulseOne.getCohortAverage(), 0);
        assertEquals(90.0, slateMany.getCohortAverage(), 0);
    }

}
