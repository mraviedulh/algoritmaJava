package pkg1p52;
import javax.swing.*;
public class Ravied48 {
    public static String ringkas,nama, kelamin, berat, tinggi, lagi="y";
    public static float tb= 0f, bb= 0f, toban= 0f, raban=0f, toting= 0f, rating= 0f;
    public static double kondisi;
    public static int tl,tp;
    
    private static boolean muter;
    private static boolean kembali;
    private static String edit;
    private static boolean n_ruang;
    private static boolean keluar;
    private static int n;
    private static int data;
    private static String pil;
    public static void main(String[] args) {
        int x=-1;
        data=0;
        
        String name[]=null;
        name = new String[5];
        
        String gender[]=null;
        gender = new String[5];
        
        float weight[]=null;
        weight = new float[5];
        
        float tall[]=null;
        tall = new float[5];
        
        String ket, rekap="";
        boolean selesai=true;
        do
        {
            if (x==5)
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
            ringkas +=" TAMPILAN DATA PASIEN  \n";
            ringkas +=" NAMA PASIEN    = "+name[x]+"\n";
            ringkas +=" JENIS KELAMIN  = "+gender[x]+"\n";
            ringkas +=" BERAT BADAN    = "+weight[x]+"\n";
            ringkas +=" TINGGI BADAN   = "+tall[x]+"\n";
            ringkas +=" KETERANGAN     = "+note+"\n";
            JOptionPane.showMessageDialog(null,ringkas,"TAMPILAN DATA SISWA",JOptionPane.INFORMATION_MESSAGE);
             do
            {
                lagi = JOptionPane.showInputDialog("INGIN INPUT DATA (Y/T) ");
                if (x==4)
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
            rekap +="                 HASIL  REKAP KESEHATAN SISWA           \n";
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
        JOptionPane.showMessageDialog(null,rekap,"HASIL REKAP",JOptionPane.INFORMATION_MESSAGE);
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
                
                pil = JOptionPane.showInputDialog("DATA YANG AKAN DI EDIT [1-4]\n\n1. NAMA\n2. KELAMIN\n"
                        + "3. BERAT BADAN\n4. TINGGI BADAN");
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
                ringkas +=" TAMPILAN DATA PASIEN  \n";
                ringkas +=" NAMA PASIEN    = "+name[n-1]+"\n";
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
            rekap +="                 HASIL  REKAP KESEHATAN SISWA           \n";
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
        JOptionPane.showMessageDialog(null,rekap,"HASIL REKAP",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
