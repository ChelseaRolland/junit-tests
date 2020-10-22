import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String studentName, long studentID) {
        this.name = studentName;
        this.id = studentID;
        this.grades = new ArrayList<>();
    }


    //getters
    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    //methods
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for (int grade: getGrades()) {
            total += grade;
        }
        return total / getGrades().size();
    }

    public void deleteGrade(int grade) {
        for (int grades : getGrades()) {
            if (grades == grade) {
                getGrades().remove(getGrades().indexOf(grade));
            }
        }
    }

    public void updateGrade(int grade) {
        for (int grades : getGrades()) {
            if (grades == grade) {
                getGrades().set(getGrades().indexOf(grade), grade);
            }
        }
    }

    public void sortingGrades(ArrayList<Integer> grades) {
        Collections.sort(grades);
        for (int grade : grades) {
            System.out.println(grade);
        }
    }

}
