package pkg1p52;
public class reUlangan_pakMoses {
    public static void main(String[] args) {
        int ut=3, op=2, nt=20, op2=6;
        while(ut>=2)
        {
            int br=ut;
            do{
                int hop=op, ck=op2;
                for(int x=1;x<=4;x++)
                {
                    System.out.print(hop+" ");
                    hop++;
                }
                System.out.print(" "+nt+"  ");
                for(int x=1;x<=4;x++)
                {
                    System.out.print(ck+" ");
                    ck++;
                }
                nt++;
                op++;
                br--;
            }while(br>=1);
            op2--;
            ut--;
        }
    }
}
