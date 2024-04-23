import java.util.ArrayList;

public class Tester extends Employee {
    public ArrayList<String>TestType=new ArrayList<>();

    public Tester(String imie, String nazwisko, String adres, String pesel, String email, int rokZatrudnienia) {
        super(imie, nazwisko, adres, pesel, email, rokZatrudnienia);
        this.TestType=new ArrayList<>();

    }

    public void addTestType(String s) {
        TestType.add(s);
    }

    @Override
    public int calculateSalary() {
        int pensja= super.calculateSalary();
        pensja+= TestType.size()*300;
        return pensja;
    }
}
