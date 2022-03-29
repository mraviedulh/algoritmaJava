package pkg1p52;
import javax.swing.*;
public class Ravied35 {
    private static  String nama, kelamin, kelas, nomas, agm, nil, ket;
    private static  int agama, nilai, nim;
    public static void main(String[] args) {
        String ulang="";
        do
        {
            String layar="";
            
            nama = JOptionPane.showInputDialog("INPUT NAMA");
            
            kelas = JOptionPane.showInputDialog("INPUT KELAS");
            
            nomas = JOptionPane.showInputDialog("INPUT NIM (TANPA TITIK)");
            nim = Integer.parseInt(nomas);
            
            do
            {
                kelamin = JOptionPane.showInputDialog("INPUT KELAMIN [L/P]");
            }
            while(!("L".equals(kelamin)|"l".equals(kelamin)|"P".equals(kelamin)|"p".equals(kelamin)));
            
            String gender = "";
            
            if ("L".equals(kelamin)|"l".equals(kelamin))
            {
                gender = "LELAKI";
            }
            else
            {
                gender = "PEREMPUAN";
            }
            
            do
            {
                agm = JOptionPane.showInputDialog("INPUT AGAMA\n1. ISLAM\n2. KRISTEN\n3. KATOLIK\n4. HINDU\n5. BUDHA\n6. LAINNYA");
                agama =Integer.parseInt(agm);
            }
            while (!(agama>=1 & agama<=6));
            if (agama==1)
            {
                agm="ISLAM";
            }
            else if (agama==2)
            {
                agm="KRISTEN";
            }
            else if (agama==3)
            {
                agm="KATOLIK";
            }
            else if (agama==4)
            {
                agm="HINDU";
            }
            else if (agama==5)
            {
                agm="BUDHA";
            }
            else
            {
                agm= JOptionPane.showInputDialog("INPUT AGAMA LAINNYA");
            }
            
            do
            {
                nil=JOptionPane.showInputDialog("INPUT NILAI 1-100");
                nilai = Integer.parseInt(nil);
            }
            while (!(nilai>=0 & nilai<=100));
            int bonus = 5;
            nilai = nilai + bonus;
            if (nilai>100)
            {
                nilai=100;
            }
            ket="LOLOS";
            if(nilai<=64)
            {
                ket="REMIDI";
            }
            
            layar += "NAMA SISWA        : "+nama+"\n";
            layar += "KELAS             : "+kelas+"\n";
            layar += "NIM               : "+nim+"\n";
            layar += "JENIS KELAMIN     : "+gender+"\n";
            layar += "AGAMA             : "+agm+"\n";
            layar += "NILAI             : "+nilai+"    KETERANGAN    : "+ket+"\n";
            JOptionPane.showMessageDialog(null,layar,"DATA NILAI SISWA",JOptionPane.INFORMATION_MESSAGE);
            
            do
            {
                ulang=JOptionPane.showInputDialog("INPUT DATA LAGI [Y/T]");
            }
            while(!("Y".equals(ulang)|"y".equals(ulang)|"T".equals(ulang)|"t".equals(ulang)));
        }
        while("Y".equals(ulang)|"y".equals(ulang));
    }
}
