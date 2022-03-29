package pkg1p52;
import javax.swing.*;
public class latihanuas {
    public static void main(String[] args) {
        int x=-1, b=0, p = 0, biaya,inap;String ket2="",ket1 = null,tampung="",ulang="",spu;
        String nm[] =null;
        nm = new String[3];
        
        String as[] =null;
        as = new String[3];
        
        int li[];
        li = new int[3];
        
        String pg[] =null;
        pg = new String[3];
        do{
        x=x+1;
        String hewan = JOptionPane.showInputDialog("Nama Hewan");
        String sakit = JOptionPane.showInputDialog("Analisa Sakit");
        do{
        String lama = JOptionPane.showInputDialog("Lama Inap");
        inap = Integer.parseInt(lama);
        }while(!(inap >=1 & inap<=100));
        do{
        spu = JOptionPane.showInputDialog("Penanganan\n1.Spesialis\n2.Umum");
        }
        while(!("1".equals(spu)|"2".equals(spu)));
        nm[x]=hewan;
        as[x]=sakit;
        li[x]=inap;
        pg[x]=spu;
        if (li[x]>=1 &li[x]<=2)
        {
            b=50000;ket2=("Biaya Murah");
        }
        else if (li[x]>=3 &li[x]<=5)
        {
            b=75000;ket2=("Biaya Mahal");
        }
        else
        {
            b=150000;ket2=("Biaya Sangat Mahal");
        }
        
        switch(pg[x])
        {
            case "1" :{
                        p=575000;ket1="Spesialis";
                        break;
                      } 
            case "2" :{
                        p=250000;ket1="Umum";
                        break;
                      }        
        }
        
        biaya= (b*li[x])+p;
        
        tampung +="Nama Hewan  = "+nm[x]+"\n";
        tampung +="Analisa     = "+as[x]+"\n";
        tampung +="Lama Inap   = "+li[x]+"\n";
        tampung +="Penanganan  = "+ket1+"\n";
        tampung +="Biaya       = "+biaya+"   "+ket2+"\n";
        JOptionPane.showMessageDialog(null,tampung,"Rekap Data",JOptionPane.INFORMATION_MESSAGE);
        
        tampung ="";
        
        ulang = JOptionPane.showInputDialog("ingin input data [y/t]");
            if(x==2)
            {
                JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
                ulang="t";
            }
        }while("Y".equals(ulang)|"y".equals(ulang));
    }
}
