package pkg1p52;

import javax.swing.JOptionPane;

public class Ravied54 {
    public static void main(String[] args) {
        int h,jh;
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
        JOptionPane.showMessageDialog(null,"JUMLAH DATA = "+data+"\nJUMLAH HALAMAN = "+jh+"\n");
    }
}
