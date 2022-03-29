package pkg1p52;
public class Ravied24 {
    public static void main(String[]args)
    {
        int a = 2, b = 7, c, d, e, f = 0;
        do
        {
            c=b;
            d=a-1;
            e=0; 
            while(c>=1)
            {
                System.out.print(" ");
                c--;
            }
            do
            {
                System.out.print(a+" ");
                e=e+a;
                d--;
            }while(d>=1);
            while(c<=b)
            {
                System.out.print(" ");
                c++;
            }
            System.out.println(" = "+e);
            f=f+e;
            b--;
            a++;
        }while(a<=7);
        System.out.println("-------------------------------+");
        System.out.println("total keseluruhan = "+f);
        System.out.println("");
        System.out.println("Muhammad Raviedul Huda");
        System.out.println("21.230.0096");
    }
}
