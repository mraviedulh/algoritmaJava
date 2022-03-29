package pkg1p52;
import javax.swing.*;
public class Ravied30 {
     public static void main(String[] args) {
        String tompo="";
        int nilai=25, price=100, bantu=50, nitot=0, hatot=0;
        tompo += "DAFTAR INDEX DAGANG\n";
        tompo += "---------------------------------\n";
        tompo += "NO      NILAI      HARGA\n";
        tompo += "---------------------------------\n";
        for(int nomor=1;nomor<=6;nomor++)
        {
            tompo +="  "+nomor+"          "+nilai+"             "+price+"\n";
            hatot+=price;
            nitot+=nilai;
            price += bantu;
            bantu += 10;
            nilai += 5;
        }
        tompo += "---------------------------------+\n";
        tompo += "TOTAL="+nitot+"          "+hatot+"\n";
        tompo += "Muhammad Raviedul Huda\n";
        tompo += "21.230.0096\n";
        JOptionPane.showMessageDialog(null,tompo,"DAFTAR INDEX BANK MULYA",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
