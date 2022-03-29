package pkg1p52;
public class UTS_TEORY {
    public static void main(String[] args) {
        int baris=10,lebar,jarak=5,jarak1,bil,ttl,keseluruhan=0;
        while(baris>=1)
        {
            jarak1=jarak;
            ttl=0;
            bil=baris-1;
            lebar=baris;
            do
            {
                System.out.print(" ");
                jarak1--;
            }while(jarak1>=1);
            while(lebar>=1)
            {
                System.out.print(bil+" ");
                ttl=ttl+bil;
                lebar--;
            }
            do
            {
                System.out.print("  ");
                jarak1++;
            }while(jarak1<=jarak);
            System.out.println("");
            keseluruhan=keseluruhan+ttl;
            jarak++;
            baris--;
        }
        System.out.println("=======================================+");
        System.out.println("TOTAL KESELURUHAN = "+keseluruhan);
        System.out.println("Muhammad Raviedul Huda");
        System.out.println("21.230.0096");
        
    }
}
