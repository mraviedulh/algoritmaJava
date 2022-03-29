package pkg1p52;
import java.util.Scanner;
public class Ravied31 {
    public static void main(String[] args) {
        String nambar;
        int habar, jubar, juhar=0, y=1,tobar=0,toyar=0;
        String masuk="Y";
        Scanner inputbarang= new Scanner(System.in);
        while (("y".equals(masuk)|"Y".equals(masuk)))
        {
        System.out.println("NO : "+y);
        System.out.println("               TOKO MAKMUR SEJAHTERA              ");
        System.out.println("     ----------------------------------------     ");
        System.out.println("                PEMBELIAN KONSUMEN                ");
        System.out.print("          1. NAMA BARANG   : "); nambar = inputbarang.next();
        System.out.print("          2. HARGA BARANG  : "); habar = inputbarang.nextInt();
        System.out.print("          3. JUMLAH BARANG : "); jubar = inputbarang.nextInt();
        juhar=jubar*habar;
        System.out.println("             JUMLAH HARGA  : [ "+juhar+" ]"); 
        System.out.println("");
        System.out.println("        "+nambar+"     TOTAL     "+juhar);
        System.out.println("");
        System.out.print("               INPUT BARANG LAGI (Y/T) = "); masuk =inputbarang.next();
        tobar += jubar;
        toyar += juhar;
        y++;
        }
        System.out.println("     ========================================     ");
        System.out.println("                   REKAP BARANG                   ");
        System.out.println("       1. TOTAL JUMLAH BARANG  : "+tobar);
        System.out.println("       2. TOTAL BAYAR          : "+toyar);
        System.out.println("");
        System.out.println("                   TERIMA KASIH                   ");
        
    }
}
