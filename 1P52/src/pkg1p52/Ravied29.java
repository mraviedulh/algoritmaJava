package pkg1p52;
import javax.swing.*;
public class Ravied29 {
    public static void main(String[] args) {
        int nilai=25, price=100, bantu=50, nitot=0, hatot=0;
        System.out.println("     DAFTAR INDEX DAGANG");
        System.out.println("     --------------------");
        System.out.println("     NO    NILAI    HARGA");
        System.out.println("     --------------------");
        for(int nomor=1;nomor<=6;nomor++)
        {
            System.out.println("     "+nomor+"      "+nilai+"       "+price);
            hatot+=price;
            nitot+=nilai;
            price += bantu;
            bantu += 10;
            nilai += 5;
        }
        System.out.println("     --------------------+");
        System.out.println("     TOTAL= "+nitot+"      "+hatot);
        System.out.println("    Muhammad Raviedul Huda");
        System.out.println("     21.230.0096");
        
    }
}
