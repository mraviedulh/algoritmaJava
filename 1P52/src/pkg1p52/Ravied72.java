package pkg1p52;

import javax.swing.JOptionPane;

public class Ravied72 {
    public static boolean putar=true;
    public static void main(String[] args) {
        String suarakucing="";
        String suaraayam="";
        String suaratikus="";
        
        do
        {
            
            String pil = JOptionPane.showInputDialog("     MENU BUNYI HEWAN     \n 1. BUNYI KUCING"
                                                        + "\n 2. BUNYI AYAM\n 3. BUNYI TIKUS\n 4. KELUAR"
                                                        + "\n PILIH (1 - 4)");
            switch (pil)
            {
                case "1":{
                            KUCING meong = new KUCING();
                            suarakucing = meong.lolong();
                            JOptionPane.showMessageDialog(null,"Suara Kucing .... "+suarakucing+"\n BENARKAN SUARA KUCING");
                            suarakucing = meong.lolong1();
                            JOptionPane.showMessageDialog(null,"SUARA KUCING INPUTAN\n"+suarakucing);
                            break;
                         }
                case "2":{
                            AYAM kokok = new AYAM();
                            suaraayam = kokok.petok();
                            JOptionPane.showMessageDialog(null,"Suara Ayam .... "+suaraayam+"\n BENARKAN SUARA AYAM");
                            suaraayam = kokok.petok1();
                            JOptionPane.showMessageDialog(null,"SUARA AYAM INPUTAN\n"+suaraayam);
                            break;
                         }
                case "3":{
                            TIKUS cicit = new TIKUS();
                            suaratikus = cicit.yiyit();
                            JOptionPane.showMessageDialog(null,"Suara Tikus .... "+suaratikus+"\n BENARKAN SUARA TIKUS");
                            suaratikus = cicit.yiyit1();
                            JOptionPane.showMessageDialog(null,"SUARA TIKUS INPUTAN\n"+suaratikus);
                            break;
                         }
                case "4":{
                            System.exit(0); putar = false;
                            break;
                         }
            }
        }
        while(putar);
    }
}
