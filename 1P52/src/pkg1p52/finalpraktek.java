package pkg1p52;

import javax.swing.JOptionPane;

public class finalpraktek {
    private static int x,sld,data,hal,jumhal,x1,x2,c;
    private static double pjk,kwh,byr,tot_kwh,tot_pul,tot_pjk;
    private static String no,jeneng,saldo,tampil,lagi,rekap;
    public static void main(String[] args) {
        String nomor[]=null;
        nomor= new String[5];
        
        String nama[]=null;
        nama= new String[5];
        
        int pulsa[]=null;
        pulsa= new int[5];
        
        x=-1;
        
        do
        {
            x++;
            
            no =JOptionPane.showInputDialog("MASUKKAN NOMOR");
            nomor[x]=no;
            
            jeneng =JOptionPane.showInputDialog("MASUKKAN NAMA");
            nama[x]= jeneng;
            
            do
            {
            saldo = JOptionPane.showInputDialog("SILAHKAN PILIH:\nA. 25.000\nB.50.000\nC.100.000\nD.200.000"
                    + "\nE. 300.000\nF. 400.000\nG. 500.000");
            }
            while(!("a".equals(saldo)|"A".equals(saldo)|"b".equals(saldo)|
                    "B".equals(saldo)|"c".equals(saldo)|"C".equals(saldo)|
                    "d".equals(saldo)|"D".equals(saldo)|"e".equals(saldo)|
                    "E".equals(saldo)|"f".equals(saldo)|"F".equals(saldo)|
                    "g".equals(saldo)|"G".equals(saldo)));
            if ("a".equals(saldo)|"A".equals(saldo))
            {
                sld = 25000;kwh=16.4; pjk=0;
            }
            else if ("b".equals(saldo)|"B".equals(saldo))
            {
                sld = 50000; kwh=23.8; pjk=0;
            }
            else if ("c".equals(saldo)|"C".equals(saldo))
            {
                sld = 100000;  kwh=50.9; pjk=0;
            }
            else if ("d".equals(saldo)|"D".equals(saldo))
            {
                sld = 200000;  kwh=160.3; pjk=0;
            }
            else if ("e".equals(saldo)|"E".equals(saldo))
            {
                sld = 300000; kwh=210.1; pjk=sld*0.05;
            }
            else if ("f".equals(saldo)|"F".equals(saldo))
            {
                sld = 400000; kwh=320.7; pjk=sld*0.05; 
            }
            else
            {
                sld = 500000; kwh=700; pjk=sld*0.07; 
            }
            byr=sld+pjk;
            pulsa[x]=sld;
            tampil="";
            tampil +=" No Antri; "+(x+1)+"\n";
            tampil +="                  PENJUALAN  PULSA  LISTRIK               \n";
            tampil +="            1. NO PELAGGAN        = "+nomor[x]+"\n";
            tampil +="            2. NAMA PELANGGAN     = "+nama[x]+"\n";
            tampil +="            3. PULSA              = "+pulsa[x]+"\n";
            tampil +="            4. Kilo Watt (Kwh)    = "+kwh+"\n";
            tampil +="            5. BAYAR              = "+byr+"\n";
//            tampil +="                1. KEMBALI            = "+nomor[x]+"\n";
            JOptionPane.showMessageDialog(null,tampil,"REKAP",JOptionPane.INFORMATION_MESSAGE);
            do
            {
                lagi = JOptionPane.showInputDialog("INPUT PENJUALAN [Y/T] = ");
            }
            while(!("y".equals(lagi)|"Y".equals(lagi)|"t".equals(lagi)|"T".equals(lagi)));
            
            if (x==4)
            {
                lagi="t";
            }
        }
        while ("y".equals(lagi)|"Y".equals(lagi));
        data=x+1;
        hal=data%4;
        if (hal==0)
        {
            jumhal=data/4;
        }
        else
        {
            jumhal=(data/4)+1;
        }
        if (jumhal==1)
        {
            x1=0;
            x2=x;
        }
        else
        {
            x1=0;
            x2=3;
        }
        c=0;
        for(int y=1;y<=jumhal;y++)
        {
            tot_kwh=0;
            tot_pul=0;
            tot_pjk=0;
            rekap ="";
            rekap +="                          LAPORAN PENJUALAN PULSA LISTRIK                    HAL= "+y+"\n";
            rekap +="------------------------------------------------------------------------------------\n";
            rekap +="  NO   NO PELANGGAN   NAMA         PULSA    KWH    PAJAK    BAYAR\n";
            rekap +="------------------------------------------------------------------------------------\n";
            if (y==jumhal)
            {
                x2=x;
            }
            for(int z =x1; z <=x2;z++)
            {
                if (pulsa[z]==2500)
                {
                    sld = 25000;kwh=16.4; pjk=0;
                }
                else if (pulsa[z]==50000)
                {
                    sld = 50000; kwh=23.8; pjk=0;
                }
                else if (pulsa[z]==100000)
                {
                    sld = 100000;  kwh=50.9; pjk=0;
                }
                else if (pulsa[z]==200000)
                {
                    sld = 200000;  kwh=160.3; pjk=0;
                }
                else if (pulsa[z]==300000)
                {
                    sld = 300000; kwh=210.1; pjk=sld*0.05;
                }
                else if (pulsa[z]==400000)
                {
                    sld = 400000; kwh=320.7; pjk=sld*0.05; 
                }
                else
                {
                    sld = 500000; kwh=700; pjk=sld*0.07; 
                }
                pulsa[z]=sld;
                byr=sld+pjk;
                c++;
                rekap +="  "+c+"   "+nomor[z]+"   "+nama[z]+"         "+pulsa[z]+"    "+kwh+"    "+pjk+"    "+byr+"\n";
                
                tot_kwh+=kwh;
                tot_pul+=pulsa[z];
                tot_pjk+=pjk;
            }
            rekap +="------------------------------------------------------------------------------------\n";
            rekap +="  TOTAL Kwh :"+tot_kwh+"           TOTAL PULSA = "+tot_pul+"             PAJAK = "+tot_pjk+"                  \n";
            JOptionPane.showMessageDialog(null,rekap,"LAPORAN AKHIR",JOptionPane.INFORMATION_MESSAGE);
            x1+=4;
            x2+=4;
        }
    }
}
