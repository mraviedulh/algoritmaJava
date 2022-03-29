package pkg1p52;
public class Ravied60 {
    public static String nama,makanan;
    public static void main(String[] args) {
//        membuat objek dari class ravied50
        Ravied60 hewan = new Ravied60();
        System.out.println("====== KUCING =======");
        hewan.kucing();
        System.out.println("====== KAMBING ======");
        hewan.kambing();
    }
    void kucing()
    {
        nama = "PUS MEONG";
        makanan = "Danging pakai saos";
        System.out.println("Nama Kucing Saya Adalah "+nama);
        System.out.println("Kucing Saya Suka Makan "+makanan);
    }
    void kambing()
    {
        nama = "EMBEK EMBE";
        makanan = "Rumput Gajah";
        System.out.println("Nama Kambing Saya Adalah "+nama);
        System.out.println("Kambing Saya Suka Makan "+makanan);
    }
}
