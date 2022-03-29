package pkg1p52;
import javax.swing.*;
public class TugasRavied9 {
    public static void main(String[]args)
    {
        int n=0, tb=0, tby=0,diskon=0, gtb=0; String lagi="y", ket1=""; 
        ket1+="         LAPORAN PENJUALAN         \n";
        ket1+="------------------------------------------------------------------------------------------------------------------\n";
        ket1+="   NO   NAMA   BAYAR   DISKON    TOTAL BAYAR\n";
        ket1+="------------------------------------------------------------------------------------------------------------------\n";
        do
        {
            n=n+1; String ket="";
            String nm_p= JOptionPane.showInputDialog("NAMA PEMBELI");
            String jta= JOptionPane.showInputDialog("JUMLAH TELUR ASIN");
            int n_jta= Integer.parseInt(jta);
            String ht= JOptionPane.showInputDialog("HARGA/TELOR");
            int n_ht= Integer.parseInt(ht);
            tb= n_jta*n_ht;
            ket+="NO = "+n+"\n";
            ket+="HARGA = "+ht+"\n";
            ket+="JUMLAH = "+jta+"\n";
            ket+="TOTAL BAYAR = "+tb+"\n";
            if(tb<=50000)
            {
                diskon=0;
            }
            if(tb<70000)
            {
                diskon= tb/20;
            }
            else
            {
                diskon= tb/10;
            }
            tby=tb-diskon;
            gtb=gtb+tby;
            ket1 +="   "+n+"   "+nm_p+"   "+tb+"   "+diskon+"   "+tby+"\n";
            JOptionPane.showMessageDialog(null,ket,"",JOptionPane.INFORMATION_MESSAGE);
            do
            {
                lagi= JOptionPane.showInputDialog("INPUT DATA {Y/T}");
            }while(!("y".equals(lagi)|"Y".equals(lagi)|"t".equals(lagi)|"T".equals(lagi)));
            
            
        }while("y".equals(lagi)|"Y".equals(lagi));
        ket1 += "-----------------------------------------------------------------------------------------------------------------\n";
        ket1 += "                     TOTAL BAYAR = "+gtb+"\n";
        JOptionPane.showMessageDialog(null,ket1,"",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
   
}
