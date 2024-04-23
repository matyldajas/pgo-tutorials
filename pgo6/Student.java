import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Student {
    private static List<Student> studentList = new ArrayList<>();
    public ArrayList<Integer> grade=new ArrayList<>();
    private String name;
    private String surname;
    private String email;
    private String adress;
    private String phoneNumber;
    private Date date;
    private int semestr;
    private StudyProgramme studyProgramme;
    private Map<String, Integer> grades;
    private String status;
    private String idStudent;
    private static int indexNumber;
    private static int licznikStudentów=1;
    public Student(String name, String surname, String email, String adress, String phoneNumber, Date date) {
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.adress=adress;
        this.phoneNumber=phoneNumber;
        this.date=date;
        this.grades = new HashMap<>();
        Student.studentList.add(this);
        this.status="kandydat";
        this.idStudent="s"+licznikStudentów;
        licznikStudentów++;

        
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student:studentList) {
            System.out.println(student.name+" "+ student.surname+" "+student.adress+" "+student.email+" "+student.phoneNumber+" "+student.idStudent+" "+student.date+student.studyProgramme+" "+student.semestr+" "+student.status);

        }
    }

    public void enrollStudent(StudyProgramme studyProgramme){
        this.semestr=1;
        this.studyProgramme=studyProgramme;
        this.status="student";

    }


    public void addGrade(int ocena, String przedmiot) {
        grades.put(przedmiot,ocena);
    }

    public static void promoteAllStudents (){
        for (Student student: studentList ){
            if (student.semestr!=student.studyProgramme.liczbaSemestrów){
            student.semestr+=1;}
            else {
                student.status="absolwent";
            }
        }

        }

    }

