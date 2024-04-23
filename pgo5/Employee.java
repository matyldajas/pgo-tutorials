import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Locale;

public class Employee {
    protected String imie;
    protected String nazwisko;
    protected String adres;
    protected String pesel;
    protected String email;
    protected int rokZatrudnienia;
    protected int pensja =3000;

    protected int premiaRoczna=1000;

    public Employee(String imie, String nazwisko, String adres, String pesel, String email, int rokZatrudnienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.pesel = pesel;
        this.email = email;
        this.rokZatrudnienia = rokZatrudnienia;
    }

    public int calculateSalary() {
        int currentYear=LocalDate.now().getYear();
        int przepracowaneLata=currentYear-rokZatrudnienia;
        pensja+=przepracowaneLata*premiaRoczna;

        return pensja;
    }
}
