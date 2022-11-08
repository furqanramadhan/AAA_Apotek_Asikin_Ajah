public class buku extends abstractBuku {
    private String judul;
    private int kodeBuku;
    private String pengarang;

    public buku(String judul, int kodeBuku, String pengarang) {

        this.judul = judul;
        this.kodeBuku = kodeBuku;
        this.pengarang = pengarang;

    }

    public String getjudul() {
        return this.judul;
    }

    public int getkodeBuku() {
        return this.kodeBuku;
    }

    public String getpengarang() {
        return this.pengarang;
    }

    public void available() {

    }
}
