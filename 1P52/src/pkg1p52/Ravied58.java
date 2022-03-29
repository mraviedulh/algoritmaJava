package pkg1p52;
import javax.swing.*;
public class Ravied58 {
    public static String ringkas,nama, kelamin, berat, tinggi, lagi="y";
    public static float tb= 0f, bb= 0f, toban= 0f, raban=0f, toting= 0f, rating= 0f;
    public static double kondisi;
    public static int x,tl,tp;
    
    private static boolean muter;
    private static boolean kembali;
    private static String edit;
    private static boolean n_ruang;
    private static boolean keluar;
    private static int n;
    private static int data;
    private static String pil;
    
    public static boolean hapus;
    private static String hp,no_r,hapus_d,rekap1;
    private static int j, k,n1;
    private static int h;
    
    private static int hal;
    private static int jh; 
    private static int x1;
    private static int x2;
    private static int t_data;
    public static void main(String[] args) {
        x=-1;
        data=0;
        
        String name[]=null;
        name = new String[7];
        
        String gender[]=null;
        gender = new String[7];
        
        float weight[]=null;
        weight = new float[7];
        
        float tall[]=null;
        tall = new float[7];
        
        String ket, rekap="";
        boolean selesai=true;
        do
        {
            if (x==7)
            {
                JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
            }
            else
            {
        do
        {
            x=x+1;data+=1;
            ringkas="";
            nama =JOptionPane.showInputDialog("NAMA SISWA ");
            name[x]=nama;
            
            do
            {
                kelamin =JOptionPane.showInputDialog("JENIS KELAMIN (L/P)");
            }
            while(!("l".equals(kelamin)|"L".equals(kelamin)|"p".equals(kelamin)|"P".equals(kelamin)));
            
            if ("l".equals(kelamin)|"L".equals(kelamin))
            {
                ket="LAKI - LAKI";
            }
            else
            {
                ket="PEREMPUAN";
            }
            gender[x]=ket;
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
            weight[x]=bb;
            
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
            while(m1);
            tall[x]=tb;
            
            String note ="";
            kondisi=tall[x]-weight[x];
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
            ringkas +=" NO  : "+data+"\n";
            ringkas +=" TAMPILAN DATA SISWA  \n";
            ringkas +=" NAMA SISWA    = "+name[x]+"\n";
            ringkas +=" JENIS KELAMIN  = "+gender[x]+"\n";
            ringkas +=" BERAT BADAN    = "+weight[x]+"\n";
            ringkas +=" TINGGI BADAN   = "+tall[x]+"\n";
            ringkas +=" KETERANGAN     = "+note+"\n";
            JOptionPane.showMessageDialog(null,ringkas,"TAMPILAN DATA SISWA",JOptionPane.INFORMATION_MESSAGE);
             do
            {
                lagi = JOptionPane.showInputDialog("INGIN INPUT DATA (Y/T) ");
                if (x==6)
                {
                    JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
                    lagi="t";
                }
            }
            while(!("y".equals(lagi)|"Y".equals(lagi)|"t".equals(lagi)|"T".equals(lagi)));
        }
        while("y".equals(lagi)|"Y".equals(lagi));
            }
        selesai=false;
        }
        while(selesai);
        int p=0;
            rekap +="                 HASIL REKAP KESEHATAN SISWA           \n";
            rekap +=" =======================================================\n";
            rekap +="  NO    NAMA    JENIS KELAMIN    BERAT    TINGGI    KETENTUAN\n";
            rekap +=" =======================================================\n";
            for(int c=0;c<=x;c++)
            {
                p+=1;
                toban=toban+weight[c];
                toting=toting+tall[c];
                String note ="";
                kondisi=tall[c]-weight[c];
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
                
                if ("LAKI - LAKI".equals(gender[c]))
                {
                    tl=tl+1;
                }
                else
                {
                    tp=tp+1;
                }
                rekap +="  "+p+"    "+name[c]+"    "+gender[c]+"    "+weight[c]+"    "+tall[c]+"    "+note+"\n";
            }
        raban=toban/p;
        rating=toting/p;
        rekap +=" ====================================\n";
        rekap +="  TOTAL LAKI LAKI = "+tl+" ORANG \n";
        rekap +="  TOTAL PEREMPUAN = "+tp+" ORANG \n";
        rekap +="  RATA RATA BERAT = "+raban+" KG \n";
        rekap +="  RATA RATA TINGGI = "+rating+" CM \n";
        JOptionPane.showMessageDialog(null,rekap,"ringkasREKAP",JOptionPane.INFORMATION_MESSAGE);
        do
        {
            muter= false;
            do
            {
                kembali=true;
                edit= JOptionPane.showInputDialog("EDIT DATA (Y/T)");
                if ("y".equals(edit)|"Y".equals(edit)|"t".equals(edit)|"T".equals(edit))
                {
                    kembali=false;
                }
            }
            while(kembali);
            int j=x+1;
            if ("y".equals(edit)|"Y".equals(edit))
            {
                do
                {
                    try
                    {
                        do
                        {
                            n_ruang=true;
                            String nr=JOptionPane.showInputDialog("NOMOR RUANG [1-"+j+"]");
                            n =Integer.parseInt(nr);
                            if (n>=1 | n<=x+1)
                            {
                                n_ruang=false;
                            }
                            
                        }
                        while(n_ruang);
                        keluar=false;
                    }
                    catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null,"INPUT SALAH");
                        keluar=false;
                    }
                }
                while(keluar);
                
                pil = JOptionPane.showInputDialog("DATA YANG AKAN DI EDIT [1-4]\n\n1. NAMA\n2. KELAMIN\n3. BERAT BADAN\n4. TINGGI BADAN");
                switch (pil){
                    case"1":
                nama =JOptionPane.showInputDialog("NAMA SISWA ");
                name[n-1]=nama;
                break;
                case"2":
                    do
                    {
                        kelamin =JOptionPane.showInputDialog("JENIS KELAMIN (L/P)");
                    }
                    while(!("l".equals(kelamin)|"L".equals(kelamin)|"p".equals(kelamin)|"P".equals(kelamin)));
                    
                    if ("l".equals(kelamin)|"L".equals(kelamin))
                    {
                        ket="LAKI - LAKI";
                    }
                    else
                    {
                        ket="PEREMPUAN";
                    }
                    gender[n-1]=ket;
                    break;
                case"3":
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
                    weight[n-1]=bb;
                    break;
                default:
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
                    while(m1);
                    tall[n-1]=tb;
                    break;
                }
                String note ="";
                kondisi=tall[n-1]-weight[n-1];
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
                ringkas ="";
                ringkas +=" NO  : "+n+"\n";
                ringkas +=" TAMPILAN DATA SISWA  \n";
                ringkas +=" NAMA SISWA    = "+name[n-1]+"\n";
                ringkas +=" JENIS KELAMIN  = "+gender[n-1]+"\n";
                ringkas +=" BERAT BADAN    = "+weight[n-1]+"\n";
                ringkas +=" TINGGI BADAN   = "+tall[n-1]+"\n";
                ringkas +=" KETERANGAN     = "+note+"\n";
                JOptionPane.showMessageDialog(null,ringkas,"TAMPILAN DATA SISWA",JOptionPane.INFORMATION_MESSAGE);
                muter=true;
            }
        }
        while(muter);
        tl=0;
        tp=0;
        toban=0;
        toting=0;
        raban=0;
        rating=0;
        rekap="";
            p=0;
            rekap +="                 HASIL REKAP KESEHATAN SISWA           \n";
            rekap +=" =======================================================\n";
            rekap +="  NO    NAMA    JENIS KELAMIN    BERAT    TINGGI    KETENTUAN\n";
            rekap +=" =======================================================\n";
            for(int c=0;c<=x;c++)
            {
                p+=1;
                toban=toban+weight[c];
                toting=toting+tall[c];
                String note ="";
                kondisi=tall[c]-weight[c];
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
                
                if ("LAKI - LAKI".equals(gender[c]))
                {
                    tl=tl+1;
                }
                else
                {
                    tp=tp+1;
                }
                rekap +="  "+p+"    "+name[c]+"    "+gender[c]+"    "+weight[c]+"    "+tall[c]+"    "+note+"\n";
            }
        raban=toban/p;
        rating=toting/p;
        rekap +=" ====================================\n";
        rekap +="  TOTAL LAKI LAKI = "+tl+" ORANG \n";
        rekap +="  TOTAL PEREMPUAN = "+tp+" ORANG \n";
        rekap +="  RATA RATA BERAT = "+raban+" KG \n";
        rekap +="  RATA RATA TINGGI = "+rating+" CM \n";
        JOptionPane.showMessageDialog(null,rekap,"ringkasREKAP",JOptionPane.INFORMATION_MESSAGE);
        do
        {
            hapus=true;
            hp = JOptionPane.showInputDialog("HAPUS DATA (Y/T)");
            if ("y".equals(hp)|"Y".equals(hp))
            {
                j=x+1;
                no_r=JOptionPane.showInputDialog("MASUKKAN NOMOR RUANG [1 - "+j+"] ");
                n1=Integer.parseInt(no_r);
                String note ="";
                kondisi=tall[n1-1]-weight[n1-1];
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
                
                
                ringkas ="";
                ringkas +=" NO  : "+n1+"\n";
                ringkas +=" TAMPILAN DATA SISWA   \n";
                ringkas +=" NAMA SISWA     = "+name[n1-1]+"\n";
                ringkas +=" JENIS KELAMIN  = "+gender[n1-1]+"\n";
                ringkas +=" BERAT BADAN    = "+weight[n1-1]+"\n";
                ringkas +=" TINGGI BADAN   = "+tall[n1-1]+"\n";
                ringkas +=" KETERANGAN     = "+note+"\n";
                JOptionPane.showMessageDialog(null,ringkas,"TAMPILAN DATA SISWA",JOptionPane.INFORMATION_MESSAGE);
                hapus_d= JOptionPane.showInputDialog("DATA AKAN DIHAPUS (Y/T) ");
                if ("y".equals(hapus_d)|"Y".equals(hapus_d))
                {
                    k=n1-1;
                    if (k == x)
                    {
                        x=x-1;
                    }
                    else if (k<x)
                    {
                        for (int s=k; s<=x;s=s+1)
                        {
                            name[s] =name[s+1];
                            gender[s] =gender[s+1];
                            weight[s] =weight[s+1];
                            tall[s] =tall[s+1];
                        }
                        x=x-1;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"DATA TIDAK TERHAPUS");
                }
            }
            else
            {
                hapus=false;
            }
            t_data = x +1;
            hal = t_data % 3;
            if (hal == 0)
            {
                jh = t_data /3;
            }
            else
            {
                jh = (t_data / 3) + 1;
            }
            if (jh == 1)
            {
                x1 = 0;
                x2 = x;
            }
            else
            {
                x1 = 0;
                x2 = 2;
            }
            for (int y=1; y<=jh; y=y+1)
            {
            tl=0;
            tp=0;
            toban=0;
            toting=0;
            raban=0;
            rating=0;
            rekap1 ="";
            
            rekap1 +=" Hal = "+y+"\n";
            rekap1 +="                 HASIL REKAP KESEHATAN SISWA           \n";
            rekap1 +=" =======================================================\n";
            rekap1 +="  NO    NAMA    JENIS KELAMIN    BERAT    TINGGI    KETENTUAN\n";
            rekap1 +=" =======================================================\n";
            h=0;if(y==jh)
            {
                x2=x;
            }
            for(int c=x1;c<=x2;c++)
            {
                h=h+1;
                toban=toban+weight[c];
                toting=toting+tall[c];
                String note ="";
                kondisi=tall[c]-weight[c];
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
                
                if ("LAKI - LAKI".equals(gender[c]))
                {
                    tl=tl+1;
                }
                else
                {
                    tp=tp+1;
                }
                rekap1 +="  "+h+"    "+name[c]+"    "+gender[c]+"    "+weight[c]+"    "+tall[c]+"    "+note+"\n";
            }
            raban=toban/h;
            rating=toting/h;
    
            rekap1 +=" ====================================\n";
            rekap1 +="  TOTAL LAKI LAKI = "+tl+" ORANG \n";
            rekap1 +="  TOTAL PEREMPUAN = "+tp+" ORANG \n";
            rekap1 +="  RATA RATA BERAT = "+raban+" KG \n";
            rekap1 +="  RATA RATA TINGGI = "+rating+" CM \n";
            JOptionPane.showMessageDialog(null,rekap1,"LAPORAN HASIL DATA MAHASISWA",JOptionPane.INFORMATION_MESSAGE);
            x1 += 3;
            x2 += 3;
            }
                
            if (x==-1)
            {
                JOptionPane.showMessageDialog(null,"DATA KOSONG \n data tidak bisa dihapus "
                    +"\n SISTEM AKAN KELUAR");
                    
                hapus=false;
            }
        }
        while(hapus);
        System.exit(0);
    }
}
