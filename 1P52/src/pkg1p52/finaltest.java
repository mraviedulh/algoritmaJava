package pkg1p52;

import javax.swing.JOptionPane;

public class finaltest {
    private static String lagi,jeneng,dari,sewa,jenis,hari,total,b1,b2,status;
    private static int x,harga,day,org,bayar1,bayar2,total_cost=0,harga_akhir;
    public static void main(String[] args) {
        String nama[]=null;
        nama = new String[3];
        
        String alamat[]=null;
        alamat = new String[3];
        
        String tanggal[]=null;
        tanggal = new String[3];
        
        String tipe[]=null;
        tipe = new String[3];
        
        int lama[]=null;
        lama = new int[3];
        
        int jumlah[]=null;
        jumlah = new int[3];
        
        int cost1[]=null;
        cost1 = new int[3];
        
        int cost2[]=null;
        cost2 = new int[3];
        
        x=-1;
        lagi="y";
        do
        {
            x++;
            jeneng = JOptionPane.showInputDialog("NAMA PENYEWA");
            nama[x]=jeneng;
            
            dari = JOptionPane.showInputDialog("ALAMAT PENYEWA");
            alamat[x]=dari;
            
            sewa = JOptionPane.showInputDialog("TANGGAL SEWA [.../.../.....]");
            tanggal[x]=sewa;
            
            do
            {
            jenis = JOptionPane.showInputDialog("TYPE VILLA\nA. MAWAR B. CEMPAKA C. MELATI");
            }
            while(!("a".equals(jenis)|"A".equals(jenis)|"b".equals(jenis)|"B".equals(jenis)|"c".equals(jenis)|"C".equals(jenis)));
            tipe[x]=jenis;
            if ("a".equals(tipe[x])|"A".equals(tipe[x]))
            {
                harga=500000;
            }
            else if ("b".equals(tipe[x])|"B".equals(tipe[x]))
            {
                harga=300000;
            }
            else 
            {
                harga=200000;
            }
            
            boolean bener=true;
            do
            {
                try
                {
                    do
                    {
                        hari = JOptionPane.showInputDialog("JUMLAH HARI SEWA\nDIATAS 2 HARI, MAX 30 HARI");
                        day =Integer.parseInt(hari);
                    }
                    while(!(day>=2 & day<=30));
                    bener=false;
                }
                catch (Exception x)
                {
                    JOptionPane.showMessageDialog(null,"DATA YANG ANDA INPUT SALAH\nSILAHKAN INPUT KEMBALI");
                }
            }
            while(bener);
            lama[x]=day;
            harga_akhir=harga*lama[x];
            JOptionPane.showMessageDialog(null,"HARGA SEWA\n"+harga_akhir);
            
            bener=true;
            do
            {
                try
                {
                    do
                    {
                        total = JOptionPane.showInputDialog("JUMLAH ORANG BERKUNJUNG\nMAX 10 ORANG, 0 TIDAK BOLEH");
                        org =Integer.parseInt(hari);
                    }
                    while(!(org<=10 & org >=1));
                    bener=false;
                }
                catch (Exception x)
                {
                    JOptionPane.showMessageDialog(null,"DATA YANG ANDA INPUT SALAH\nSILAHKAN INPUT KEMBALI");
                }
            }
            while(bener);
            jumlah[x]=org;
            
            bener=true;
            do
            {
                try
                {
                    b1 = JOptionPane.showInputDialog("BAYAR PERTAMA");
                    bayar1 =Integer.parseInt(b1);
                    bener=false;
                }
                catch (Exception x)
                {
                    JOptionPane.showMessageDialog(null,"DATA YANG ANDA INPUT SALAH\nSILAHKAN INPUT KEMBALI");
                }
            }
            while(bener);
            cost1[x]=bayar1;
            
            bener=true;
            do
            {
                try
                {
                    b2 = JOptionPane.showInputDialog("BAYAR KEDUA");
                    bayar2 =Integer.parseInt(b2);
                    bener=false;
                }
                catch (Exception x)
                {
                    JOptionPane.showMessageDialog(null,"DATA YANG ANDA INPUT SALAH\nSILAHKAN INPUT KEMBALI");
                }
            }
            while(bener);
            cost2[x]=bayar2;
            total_cost=cost1[x]+cost2[x];
            if (harga_akhir < total_cost)
            {
                status="UANG DIKEMBALIKAN Rp. "+(total_cost-harga_akhir);
            }
            else if (harga_akhir > total_cost)
            {
                status="HARUS DIBAYAR Rp. "+(harga_akhir-total_cost);
            }
            else
            {
                status="LUNAS PEMBAYARAN";
            }
            
            JOptionPane.showMessageDialog(null,"STATUS BAYAR = "+status+"\nMuhammad Raviedul Huda\n21.230.0096");
            
            do
            {
                lagi = JOptionPane.showInputDialog("INPUT DATA [Y/T] ");
            }
            while(!("y".equals(lagi)|"Y".equals(lagi)|"t".equals(lagi)|"T".equals(lagi)));
            
            if (x==2)
            {
                lagi="t";
            }
        }
        while ("y".equals(lagi)|"Y".equals(lagi));
    }
    
}
