package pkg1p52;

import javax.swing.JOptionPane;

public class Ravied71 {
    public static void main(String[] args) {
        String suarakucing="";
        String suaraayam="";
        String suaratikus="";
        
        KUCING meong = new KUCING();
        suarakucing = meong.lolong();
        JOptionPane.showMessageDialog(null,"Suara Kucing .... "+suarakucing+"\n BENARKAN SUARA KUCING");
        suarakucing = meong.lolong1();
        JOptionPane.showMessageDialog(null,"SUARA KUCING INPUTAN\n"+suarakucing);
        
        AYAM kokok = new AYAM();
        suaraayam = kokok.petok();
        JOptionPane.showMessageDialog(null,"Suara Ayam .... "+suaraayam+"\n BENARKAN SUARA AYAM");
        suaraayam = kokok.petok1();
        JOptionPane.showMessageDialog(null,"SUARA AYAM INPUTAN\n"+suaraayam);
        
        TIKUS cicit = new TIKUS();
        suaratikus = cicit.yiyit();
        JOptionPane.showMessageDialog(null,"Suara Tikus .... "+suaratikus+"\n BENARKAN SUARA TIKUS");
        suaratikus = cicit.yiyit1();
        JOptionPane.showMessageDialog(null,"SUARA TIKUS INPUTAN\n"+suaratikus);
    }
}
