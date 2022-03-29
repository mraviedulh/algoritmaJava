package pkg1p52;
import javax.swing.*;
public class Ravied41 {
    public static String nama, kelamin, berat, tinggi, lagi="y";
    public static float tb= 0f, bb= 0f, toban= 0f, raban=0f, toting= 0f, rating= 0f;
    public static double kondisi;
    public static int tl,tp;
    public static void main(String[] args) {
        int x=0;
        String ket, rekap="";
        rekap +="             HASIL  REKAP KESEHATAN SISWA       \n";
        rekap +=" ===============================================\n";
        rekap +="  NO    NAMA    JENIS KELAMIN    BERAT    TINGGI\n";
        rekap +=" ===============================================\n";
        do
        {
            x=x+1;
            String info="";
            nama =JOptionPane.showInputDialog("NAMA SISWA ");
            
            do
            {
                kelamin =JOptionPane.showInputDialog("JENIS KELAMIN (L/P)");
            }
            while(!("l".equals(kelamin)|"L".equals(kelamin)|"p".equals(kelamin)|"P".equals(kelamin)));
            
            if ("l".equals(kelamin)|"L".equals(kelamin))
            {
                ket="LAKI - LAKI"; tl=tl+1;
            }
            else
            {
                ket="PEREMPUAN"; tp=tp+1;
            }
            boolean m=true;
            do
            {
                try
                {
                    berat=JOptionPane.showInputDialog("BERAT BADAN ");
                    bb = Float.parseFloat(berat);
                    m=false;
                }
                catch (Exception e)
                {
                    m=true;
                    JOptionPane.showMessageDialog(null,"DATA YANG ANDA INPUT SALAH, INPUT ULANG");
                }
            }
            while(m);
            toban=toban+bb;
            boolean m1=true;
            do
            {
                try
                {
                    tinggi=JOptionPane.showInputDialog("TINGGI BADAN ");
                    tb = Float.parseFloat(tinggi);
                    m1=false;
                }
                catch (Exception e)
                {
                    m1=true;
                    JOptionPane.showMessageDialog(null,"DATA YANG ANDA INPUT SALAH, INPUT ULANG");
                }
            }
            while(m);
            toting=toting+tb;
            
            String note ="";
            kondisi=tb-bb;
            if (kondisi>120)
            {
                note ="KEKURUSAN";
            }
            else if (kondisi<=120 & kondisi>=100)
            {
                note ="IDEAL";
            }
            else
            {
                note ="KEGEMUKAN";
            }
            info +=" TAMPILAN DATA PASIEN  \n";
            info +=" NAMA PASIEN    = "+nama+"\n";
            info +=" JENIS KELAMIN  = "+ket+"\n";
            info +=" BERAT BADAN    = "+bb+"\n";
            info +=" TINGGI BADAN   = "+tb+"\n";
            info +=" KETERANGAN     = "+note+"\n";
            JOptionPane.showMessageDialog(null,info,"TAMPILAN DATA SISWA",JOptionPane.INFORMATION_MESSAGE);
            
            rekap +="  "+x+"    "+nama+"    "+ket+"    "+bb+"    "+tb+"\n";
            do
            {
                lagi = JOptionPane.showInputDialog("INGIN INPUT DATA (Y/T) ");
            }
            while(!("y".equals(lagi)|"Y".equals(lagi)|"t".equals(lagi)|"T".equals(lagi)));
        }
        while("y".equals(lagi)|"Y".equals(lagi));
        raban=toban/x;
        rating=toting/x;
        rekap +=" ====================================\n";
        rekap +="  TOTAL LAKI LAKI = "+tl+" ORANG \n";
        rekap +="  TOTAL PEREMPUAN = "+tp+" ORANG \n";
        rekap +="  RATA RATA BERAT = "+raban+" KG \n";
        rekap +="  RATA RATA TINGGI = "+rating+" CM \n";
        JOptionPane.showMessageDialog(null,rekap,"HASIL REKAP",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
