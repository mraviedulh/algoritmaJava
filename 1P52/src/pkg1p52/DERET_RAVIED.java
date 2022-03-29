package pkg1p52;
public class DERET_RAVIED {
    public static void main(String[] args) {
        int bagian=1,grandtot=0,deret2=10;
        while(bagian<=2)
        {
            int baris=1, deret5=1, nilaitot=0;
            do
            {
            int digit2=deret2,loop=1, tot=0;  
            while(loop<=5)
            {
                System.out.print(deret5);
                tot=tot+deret5;
                loop++;
            }
            while(loop>2)
            {
                System.out.print(" "+digit2);
                tot=tot+digit2;
                digit2=digit2+2;
                loop--;
            }
            nilaitot=nilaitot+tot;
            deret5=deret5+2;
            baris++;
            System.out.println("= "+tot);
            }while(baris<=3);
            System.out.println("TOTAL NILAI = "+nilaitot);
            System.out.println("");
            deret2=deret2+2;
            grandtot=grandtot+nilaitot;
            bagian++;
        }
        System.out.println("TOTAL KESELURUHAN = "+grandtot);
        System.out.println("Muhammad Raviedul Huda 21.230.0096");
    }
}