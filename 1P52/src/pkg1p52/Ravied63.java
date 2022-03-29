package pkg1p52;
public class Ravied63 {
//    menambahkan Sifat static pada variabel
    static String nama;
    static int tahun_s = 2017,tahun_l = 1998, umur;
    static double ipk;
    
    public static void main(String[] args) {
//        memanggil data static pada method main
        nama ="wildan";
        System.out.println("Nama Saya: "+nama);
        System.out.println("Umur Saya: "+umur_saya()+ " Tahun");
        NilaiIPK();
    }
//    menambahkan sifat static pada method return
    static int umur_saya()
    {
        umur = tahun_s - tahun_l;
        return umur;
    }
    
    static void NilaiIPK()
    {
        ipk=4.0;
        System.out.println("Nilai IPK Saya; "+ipk);
    }
}
