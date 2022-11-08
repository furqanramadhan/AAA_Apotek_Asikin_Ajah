public class sains extends buku {
    private String mk;

    public sains(String judul, int kodeBuku, String pengarang, String mk) {
        super(judul, kodeBuku, pengarang);
        this.mk = mk;
    }

    public String getmk() {
        return mk;
    }
}
