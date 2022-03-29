package pkg1p52;
public class reUlangan {
    public static void main(String[] args) {
        int awal=2,tengah =20 ,akhir=6 ,perulangan=1 ,baris, tot, nt, gt=0, awal1,akhir1,awal2;
        while(perulangan<=2)
        {
            baris=perulangan;
            awal1=awal;
            nt=0;
            do{
                akhir1=akhir;
                tot=0;
                awal2=awal1;
                for(int i=1;i<=4;i++)
                {
                    System.out.print(awal2+" ");
                    tot=tot+awal2;
                    awal2++;
                }
                System.out.print(" "+tengah+"  ");
                tot=tot+tengah;
                for(int j=1;j<=4;j++)
                {
                    System.out.print(akhir1+" ");
                    tot=tot+akhir1;
                    akhir1++;
                }
                System.out.println("= "+tot);
                nt=nt+tot;
                awal1++;
                tengah++;
                baris++;
            }while(baris<=3);
            System.out.println("__________________________+");
            System.out.println("               Total = "+nt);
            System.out.println("");
            awal=awal+3;
            gt=gt+nt;
            akhir--;
            perulangan++;
        }
        System.out.println("   Total Keseluruhan = "+gt);
    }
}
