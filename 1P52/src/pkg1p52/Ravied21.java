package pkg1p52;
public class Ravied21 {
    public static void main (String[]args)
    {
        int ut = 15, sp = 15, sp1, ck, tot, gt = 0;
        do
        {
            sp1=sp;
            ck=ut;
            tot=0;
            while(sp1>=1)
            {
                System.out.print(" ");
                sp1--;
            }
            do
            {
                System.out.print(ck+" ");
                tot=tot+ck;
                ck--;
            }while(ck>=15);
            System.out.println(" = "+tot);
            gt=gt+tot;
            sp=sp-3;
            ut++;
        }while(ut<=19);
        System.out.println("========================== + ");
        System.out.println("total keseluruhan = "+gt);
    }
}
