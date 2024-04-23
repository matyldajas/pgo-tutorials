import java.util.ArrayList;

public class Technology {
    private String technology;
    private int dodatek;

    public Technology(String technology, int dodatek) {
        this.technology = technology;
        this.dodatek = dodatek;
    }

    public String getNazwa() {
        return technology;
    }

    public int getDodatek() {
        return dodatek;
    }
}
