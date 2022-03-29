package pkg1p52;
import javax.swing.*;
public class quiz {
    public static void main(String[] args) {
        int y=1;
        String tampung= "";
        String nama[] = null;
        nama =  new String[4];
        
        int umur[];
        umur = new int[4];
        
        int no_sepatu[];
        no_sepatu = new int[4];
        
        int ujian[];
        ujian = new int[4];
        int x=-1;
        String lagi;
//        for (int x=0; x<=3; x++)
        do
        {
            x++;
            String nm= JOptionPane.showInputDialog("Nama siswa\n1.Kelahiran indonesia\n2.Kelahiran kutup utara\n3.Kelahiran korea");
            nama[x]=nm;
            String us = JOptionPane.showInputDialog("Umur siswa\nA. 0-5/TK\nB. 6-9/SD\nC. 10-13/SMP");
            int nus= Integer.parseInt(us);
            umur[x]=nus;
            String sp = JOptionPane.showInputDialog("No sepatu");
            int nsp= Integer.parseInt(sp);
            no_sepatu[x]=nsp;
            String maneh = null;
            do
            {
            String ujn = JOptionPane.showInputDialog("Nilai ujian");
            int nujn= Integer.parseInt(ujn);
            ujian[x]=nujn;
            if(nujn<0|nujn>100)
            {
                JOptionPane.showMessageDialog(null,"DATA SALAH, SILAHKAN INPUT KEMBALI");
                maneh="y";
            }
            else{
                maneh="t";
            }
            }while("Y".equals(maneh)|"y".equals(maneh));
            tampung +="No = "+y+"\n";
            tampung +="1. Nama         = "+nama[x]+"\n";
            tampung +="2. Umur         = "+umur[x]+"\n";
            tampung +="3. No sepatu  = "+no_sepatu[x]+"\n";
            tampung +="3. Nilai ujian  = "+ujian[x]+"\n";
            JOptionPane.showMessageDialog(null,tampung,"INFO",JOptionPane.INFORMATION_MESSAGE);
            y++;
            tampung ="";
            lagi = JOptionPane.showInputDialog("ingin input data [y/t]");
            if(x==3)
            {
                JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
                lagi="t";
            }
        }while("Y".equals(lagi)|"y".equals(lagi));
        int tu=0,ts=0,tn=0;
        y=0;
        tampung="";
        tampung+="===============================\n";
        tampung+=" No   Nama   Umur   No Sepatu   Nilai ujian\n";
        tampung+="===============================\n";
        for(int m=0;m<=x;m++)
        {
            y++;
            tampung+=" "+y+"     "+nama[m]+"       "+umur[m]+"       "+no_sepatu[m]+"       "+ujian[m]+"\n";
            tu=tu+umur[m];
            ts=ts+no_sepatu[m];
            tn=tn+ujian[m];
        }
        tn=tn/y;
        tampung+="===============================\n";
        tampung+="  Total umur = "+tu+"\n";
        tampung+="  Total no sepatu = "+ts+"\n";
        tampung+="  Rata-rata nilai ujian = "+tn+"\n";
        JOptionPane.showMessageDialog(null,tampung,"REKAP DATA SISWA",JOptionPane.INFORMATION_MESSAGE);

    }
}
