public class bukuIlmu extends buku{
    private String mk;

    public bukuIlmu(String judul,int kodeBuku,String pengarang, String mk){
        super(judul, kodeBuku, pengarang);
        this.mk = mk;
    }
    public String getmk(){
        return mk;
    }
}
