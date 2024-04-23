public class StudyProgramme {
    private String kierunekStudiów;
    private String opis;
    public int liczbaSemestrów;
    private int możliweItn;

    public StudyProgramme(String kierunekStudiów, String opis, int liczbaSemestrów, int możliweItn) {
        this.kierunekStudiów = kierunekStudiów;
        this.opis = opis;
        this.liczbaSemestrów = liczbaSemestrów;
        this.możliweItn = możliweItn;
    }

    @Override
    public String toString() {
        return "StudyProgramme{" +
                "kierunekStudiów='" + kierunekStudiów + '\'' +
                ", opis='" + opis + '\'' +
                ", liczbaSemestrów=" + liczbaSemestrów +
                ", możliweItn=" + możliweItn +
                '}';
    }
}
