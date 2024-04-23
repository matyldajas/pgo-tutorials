import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<Goal> goals;
    public Manager(String imie, String nazwisko, String adres, String pesel, String email, int rokZatrudnienia) {
        super(imie, nazwisko, adres, pesel, email, rokZatrudnienia);
        this.goals=new ArrayList<>();
    }

    public void addGoals(Goal g) {
        goals.add(g);
    }

    @Override
    public int calculateSalary() {
        int pensja=super.calculateSalary();
        for (Goal tmp : goals ){
            pensja+=tmp.getBonus();
        }


        return pensja;
    }
}
