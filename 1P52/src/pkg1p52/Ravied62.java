package pkg1p52;
public class Ravied62 {
    String hewan = "domba";
    int kandang1=20, kandang2=100,hasil;
    
    public static void main(String[] args) {
//        membuat objek dari Ravied62
        Ravied62 data = new Ravied62();
        System.out.println("Jenis Hewan: "+data.jenis());
        System.out.println("Jumlahnya: "+data.jumlah()+" Ekor");
    }
    String jenis()
    {
//        mengembalikan nilai hewan
        return hewan;
    }
    int jumlah()
    {
//        mengembalikan nilai hewan
        hasil =kandang1 + kandang2;
        return hasil;
    }
}
