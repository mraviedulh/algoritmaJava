package pkg1p52;

import javax.swing.JOptionPane;

public class Ravied55 {
    public static void main(String[] args) {
        int h,jh,x1,x2;
        String tampil="";
        String data = JOptionPane.showInputDialog(null,"MASUKKAN JUMLAH DATA");
        int x = Integer.parseInt(data);
        h = x%3;
        if (h==0)
        {
            jh=x/3;
        }
        else
        {
            jh=(x/3)+1;
        }
        x1=1;
        x2=x;
        tampil +="Hal = "+jh+"\n";
        tampil +="        INFORMASI DATA        \n";
        tampil +="------------------------------\n";
        tampil +="              NO              \n";
        tampil +="------------------------------\n";
        for (int z=x1;z<=x2;z=z+1)
        {
            tampil +="             "+z+"\n";
        }
        tampil +="------------------------------\n";
        JOptionPane.showMessageDialog(null,tampil,"INFORMASI DATA",JOptionPane.INFORMATION_MESSAGE);
    }
}
