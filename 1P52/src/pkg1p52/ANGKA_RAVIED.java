package pkg1p52;
public class ANGKA_RAVIED {
    public static void main(String[] args) {
        int primary=20, sarang=6, srg, tambah=2, lebar,tot;
        do
        {
            tot=0;
            srg=sarang;
            lebar=tambah;
            while(srg>=1)
            {
                System.out.print("   ");
                srg--;
            }
            do
            {
                System.out.print(primary+" ");
                tot=tot+primary;
                primary++;
                lebar--;
            }while(lebar>1);
            System.out.print(" = "+tot);
            tot=tot+tambah;
            System.out.println(" + "+tambah+" = "+tot);
            tambah++;
            sarang--;
        }while(sarang>=1);
        System.out.println("");
        System.out.println("   Muhammad Raviedul Huda 21.230.0096");
    }
}
