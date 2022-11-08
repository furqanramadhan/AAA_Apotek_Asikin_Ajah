public class buku extends abstractBuku {
    private String judul;
    private int kodeBuku;
    private String pengarang;

    public buku(String judul, int kodeBuku, String pengarang) {

        this.judul = judul;
        this.kodeBuku = kodeBuku;
        this.pengarang = pengarang;

    }

    public String getJudul() {
        return this.judul;
    }

    public int getKodeBuku() {
        return this.kodeBuku;
    }

    public String getPengarang() {
        return this.pengarang;
    }

}
