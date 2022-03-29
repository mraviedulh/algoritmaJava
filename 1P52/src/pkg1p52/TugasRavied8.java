package pkg1p52;
public class TugasRavied8 {
    public static void main(String[]args)
    {
        int n1, kk,ck,h;
        n1 = 1;
        kk = 1;
        ck = 9;
        h = 0;
        do
        {
            int n2 = 1;
            int total = 0;
            while(n2<=2)
            {
                int n3 = 5;
                while(n3>=4)
                {
                    h = ck+n3*kk;
                    System.out.println(ck+" + "+n3+" * "+kk+" = "+h);
                    total = total+h;
                    kk++;
                    n3--;
                }
                n2++;
            }
            System.out.println("____________________+");
            System.out.println("total = "+total);
            n1++;
        }while(n1<=2);
        System.out.println("");
        System.out.println("Muhammad Raviedul Huda");
        System.out.println("21.230.0096");
    }
}
