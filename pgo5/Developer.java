import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Developer extends Employee {
    private ArrayList<Technology> technology;

    public Developer(String imie, String nazwisko, String adres, String pesel, String email, int rokZatrudnienia) {
        super(imie, nazwisko, adres, pesel, email, rokZatrudnienia);
        this.technology=new ArrayList<>();
    }

    public void addTechnology(Technology t) {
//       for (Technology tmp : technology){
  //         if (!Objects.equals(tmp.getNazwa(), t.getNazwa())) technology.add(t);
  //      }
       technology.add(t);
}
    @Override
    public int calculateSalary() {
        int pensja=super.calculateSalary();
        for (Technology tmp : technology){
            pensja+=tmp.getDodatek();
        }

        return pensja;
    }
}
