package pkg1p52;
import javax.swing.*;
public class Ravied33 {
    public static void main(String[] args) {
        String ulang="";
        do
        {
            String info="";
            int bayar=0;
            String nm_brg= JOptionPane.showInputDialog("Nama Barang");
            String hg_brg= JOptionPane.showInputDialog("Harga Barang");
            int harga= Integer.parseInt(hg_brg);
            String pt_brg= JOptionPane.showInputDialog("Potongan Harga");
            int potong= Integer.parseInt(pt_brg);
        
            bayar= harga - potong;
            info +="\n Nama    = "+nm_brg;
            info +="\n Harga   = "+harga;
            info +="\n Potong  = "+potong;
            info +="\n Bayar   = "+bayar;
            info +="\n Muhammad Raviedul Huda";
            info +="\n 21.230.0096";
        
            JOptionPane.showMessageDialog(null,info,"INFORMASI HARGA",JOptionPane.INFORMATION_MESSAGE);
            info = "";
            do
            {
                ulang = JOptionPane.showInputDialog("INPUT DATA BARANG (Y/T)");
            }
            while(!("y".equals(ulang)|"Y".equals(ulang)|"t".equals(ulang)|"T".equals(ulang)));
        }
        while("y".equals(ulang)|"Y".equals(ulang));
        System.exit(0);
    }
}

