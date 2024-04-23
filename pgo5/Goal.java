public class Goal {
    public int rok;
    public int miesiac;
    public int dzien;
    public String nazwa;

    public int getBonus() {
        return bonus;
    }

    public int bonus;
    public Goal(int rok, int miesiac, int dzien, String nazwa, int bonus) {
        this.rok=rok;
        this.miesiac=miesiac;
        this.dzien=dzien;
        this.nazwa=nazwa;
        this.bonus=bonus;
    }

}
