package pkg1p52;
import javax.swing.*;
public class Kelompok12 {
    public static int juk,kmod,x=-1,nodata;
    public static String info,pil,lagi,pilihan,nm_toko,almt,nm_pemilik,ju,mod,penj,pembeli,cbg,email,
            info_ped,no_telp,sts,info1,ket_usaha,ket_pembeli,ket_penjualan, ket_cabang,mpju,mppj,mppm,mpcb,mpst;
    private static boolean putar,balik,n_ruang,selesai,c;
    private static String ed;
    private static int m;
    
    private static String lokasi ="BENDAN";
    private static String bulan ="DESEMBER"; 
    private static int tahun = 2021;
    private static int tanggal = 7;
    
    public static boolean hapus;
    private static String hp,no_r,hapusdial,lapor,tampil;
    private static int j,v,m1,l;
    private static int h, t_data,jh,x1,x2,no;
    
    public static void main(String[] args) {
        
        
        nodata=0;
        /*Array */
        String nt[] = null;
        nt= new String[17];
        
        String al[] = null;
        al= new String[17];
        
        String np[] = null;
        np= new String[17];
        
        String jenisu[] = null;
        jenisu= new String[17];
        
        int mo[];
        mo= new int[17];
        
        String pen[] = null;
        pen= new String[17];
        
        String pem[] = null;
        pem= new String[17];
        
        String cb[] = null;
        cb= new String[17];
        
        String em[] = null;
        em= new String[17];
        
        String inf[] = null;
        inf= new String[17];
        
        String not[] = null;
        not= new String[17];
        
        String st[] = null;
        st= new String[17];
        
//        /Menu Home Awal/
        
        boolean muter= true;
        do{
            do{
                pilihan = JOptionPane.showInputDialog(null, "    MENU SISTEM PEDAGANG \n     KOTA PEKALONGAN "
                        +"\n 1. INPUT DATA PEDAGANG" 
                        +"\n 2. EDIT DATA PEDAGANG" 
                        +"\n 3. HAPUS DATA PEDAGANG" 
                        +"\n 4. LAPORAN DATA PEDAGANG" 
                        +"\n 5. LAPORAN STATISTIK" 
                        +"\n 6. LAPORAN ALAMAT USAHA" 
                        +"\n 7. LAPORAN ALAMAT PEDAGANG / STATUS" 
                        +"\n 8. LAPORAN STATUS PEDAGANG"
                        +"\n 9. KELUAR"
                        +"\n \n PILIH [1-9]");

            }while(!(("1".equals(pilihan)) | ("2".equals(pilihan)) |
                    ("3".equals(pilihan)) | ("4".equals(pilihan)) | 
                    ("5".equals(pilihan)) | ("6".equals(pilihan)) | 
                    ("7".equals(pilihan)) | ("8".equals(pilihan)) | ("9".equals(pilihan))));
            
            
//            /Menu Hyperlink dari No 1 - 9/
            switch (pilihan){
//                /Menu Pilihan No 1/
                case "1":{
                    
                    do{
                        boolean k=true;
                        x = x + 1; nodata = nodata +1;
                        nm_toko = JOptionPane.showInputDialog("NAMA TOKO");
                        nt[x]=nm_toko;
                        almt = JOptionPane.showInputDialog("ALAMAT");
                        al[x]=almt;
                        nm_pemilik = JOptionPane.showInputDialog("NAMA PEMILIK");
                        np[x]=nm_pemilik;
                        
//                        /#####################################################/
                        do
                        {
                            
                                    ju  = JOptionPane.showInputDialog
                                    ("\n JENIS USAHA \n \n1. PAKAIAN \n"
                                    +"2. SARUNG \n"
                                    +"3. MAKANAN \n"
                                    +"4. SEPATU TAS \n"
                                    +"5. ELEKTRONIK \n"
                                    +"6. BARANG BEKAS \n"
                                    +"7. LAIN - LAIN \n"
                                    +"PILIH SALAH SATU [1 - 8]");
                                    jenisu[x]=ju;
                                    
                        }while (!("1".equals(ju) | "2".equals(ju) | "3".equals(ju)
                                | "4".equals(ju) | "5".equals(ju) | "6".equals(ju)
                                | "7".equals(ju) | "8".equals(ju)));

                        
                        if ("1".equals(jenisu[x])) {mpju = "PAKAIAN";}
                        else if ("2".equals(jenisu[x])) {mpju = "SARUNG";}
                        else if ("3".equals(jenisu[x])) {mpju = "MAKANAN";}
                        else if ("4".equals(jenisu[x])) {mpju = "SEPATU TAS";}
                        else if ("5".equals(jenisu[x])) {mpju = "ELEKTRONIK";}
                        else if ("6".equals(jenisu[x])) {mpju = "BARANG BEKAS";}
                        else {mpju = "LAIN - LAIN";}
                       
//                        /#####################################################/
                        do
                        {
                            try
                            {
                                mod = JOptionPane.showInputDialog("MODAL");
                                kmod = Integer.parseInt(mod);
                                k = false;
                            }
                        catch (Exception e)
                            {
                                k = true;
                                JOptionPane.showMessageDialog (null, "DATA YANG INPUT SALAH, \nMOHON MASUKAN TYPE NUMBER SAJA");
                            }
                        }
                        while (k);
                        mo[x]=kmod;
                        

//                        /#####################################################/
                         do
                        {
                            penj = JOptionPane.showInputDialog("PENJUALAN \n D. DALAM NEGERI \n L. LUAR NEGERI \n S. DALAM DAN LUAR NEGERI \nPILIH SALAH SATU [D] / [L] / [S]");
                        }
                        while (!("D".equals(penj) | "d".equals(penj) | "L".equals(penj) | "l".equals(penj) | 
                                "s".equals(penj) | "S".equals(penj)));
                         
                        pen[x]=penj;
                        
                        if ("D".equals(pen[x]) | "d".equals(pen[x])) {mppj = "DALAM NEGERI";}
                        else if ("L".equals(pen[x]) | "l".equals(pen[x])) {mppj = "LUAR NEGERI";}
                        else {mppj = "DALAM DAN LUAR NEGERI";}
                        
                        
//                        /#####################################################/
                         do
                        {
                            pembeli = JOptionPane.showInputDialog("PEMBELI \n D. DOMISTIK \n L. LUAR \n C. CAMPURAN \nPILIH SALAH SATU [D] / [L] / [C]");
                        }
                        while (!("D".equals(pembeli) | "d".equals(pembeli) | "L".equals(pembeli) | "l".equals(pembeli) | 
                                "C".equals(pembeli) | "c".equals(pembeli)));
                        
                        pem[x]=pembeli;
                        
                        if ("D".equals(pem[x]) | "d".equals(pem[x])) {mppm = "DOMISTIK";}
                        else if ("L".equals(pem[x]) | "l".equals(pem[x])) {mppm = "LUAR";}
                        else {mppm = "CAMPURAN";}
                        
//                        /#####################################################/
                         do
                        {
                            cbg = JOptionPane.showInputDialog("CABANG \n A. ADA \n T. TIDAK ADA \nPILIH SALAH SATU [A] / [T]");
                        }
                        while (!("T".equals(cbg) | "t".equals(cbg) | 
                                "A".equals(cbg) | "a".equals(cbg)));

                        cb[x]=cbg;
                         
                        if ("t".equals(cb[x]) | "T".equals(cb[x])) {mpcb = "TIDAK ADA";}
                        else {mpcb = "ADA";}
                        
//                        /#####################################################/
                        email = JOptionPane.showInputDialog("ALAMAT EMAIL"); 
                        em[x]=email;
                        info_ped = JOptionPane.showInputDialog("INFO PEDAGANG"); 
                        inf[x]=info_ped;
                        no_telp = JOptionPane.showInputDialog("NOMOR TELEPON"); 
                        not[x]=no_telp;
                        
//                        /#####################################################/
                         do
                        {
                            sts = JOptionPane.showInputDialog("STATUS \n N. NIKAH \n B. BELUM \nPILIH SALAH SATU [N] / [B]");
                        }
                        while (!("N".equals(sts) | "n".equals(sts) | 
                                "B".equals(sts) | "b".equals(sts)));
                         
                        
                        if ("N".equals(sts) | "n".equals(sts)) {mpst = "NIKAH";}
                        else {mpst = "BELUM";}
                        st[x]=mpst;
//                        /#####################################################/

                         info ="";
                         info +="DATA KE : "+nodata+"\n";
                         info +="INPUT DATA PEDAGANG ";
                         info +="\n NAMA TOKO     : "+nt[x];
                         info +="\n ALAMAT        : "+al[x];
                         info +="\n NAMA PEMILIK  : "+np[x];
                         info +="\n JENIS USAHA   : "+mpju;
                         
                         info +="\n MODAL         : "+mo[x];
                         info +="\n PENJUALAN     : "+mppj;
                         info +="\n PEMBELI       : "+mppm;
                         info +="\n CABANG        : "+mpcb;
                         info +="\n ALAMAT EMAIL  : "+em[x];
                         info +="\n INFO PEDAGANG : "+inf[x];
                         info +="\n NO TELEPON    : "+not[x];
                         info +="\n STATUS        : "+st[x];
                         JOptionPane.showMessageDialog(null, info,"DATA PEDAGANG",JOptionPane.INFORMATION_MESSAGE);
                         
                        do
                        {
                            lagi = JOptionPane.showInputDialog("INGIN INPUT DATA [Y/T]");
                        }while (!(("y".equals(lagi)) | ("Y".equals(lagi)) | ("t".equals(lagi)) | ("T".equals(lagi))));
                            if(x==15)
                            {
                             JOptionPane.showMessageDialog(null,"DATA SUDAH PENUH");
                             lagi="T";
                            }
                    }while(("y".equals (lagi)) | ("Y".equals(lagi)));
                    break;                
                    }


//                /Menu Pilihan No 2/    
                case "2":{
                            do{
                               putar = false;
                               do{
                                   balik = true;
                                   ed= JOptionPane.showInputDialog("EDIT DATA [Y/T]");
                                   if(("y".equals(ed))|("Y".equals(ed))|("t".equals(ed))|("T".equals(ed)))
                                   {
                                       balik = false;
                                   }
                               }while(balik);
                               int j = x + 1;
                               if(("y".equals(ed))|("Y".equals(ed)))
                               {
                                   do{
                                       try{
                                           do{
                                               n_ruang = true;
                                               String nr = JOptionPane.showInputDialog("NOMOR RUANG [1 - "+j+"]");
                                               m=Integer.parseInt(nr);
                                               if(m>=1&(m<=x+1))
                                               {
                                                   n_ruang=false;
                                               }
                                           }while(n_ruang);
                                           selesai = false;
                                       }
                                       catch(Exception e)
                                       {
                                           JOptionPane.showMessageDialog(null, "INPUT SALAH");
                                           selesai = true;
                                       }       
                                       
                                       pil = JOptionPane.showInputDialog("DATA YANG AKAN DI EDIT [1-12] \n \n1. NAMA TOKO\n2. ALAMAT \n3. NAMA PEMILIK"
                                        + "\n4. JENIS USAHA\n5. MODAL\n6. PENJUALAN\n7. PEMBELI\n8. CABANG \n9. ALAMAT EMAIL"
                                        + "\n10. INFO PEDAGANG\n11. NO TELEPON\n12. STATUS [ NIKAH / BELUM ] \n");
                                       
                                       switch (pil) {
                                        
                                            case "1":
                                            nm_toko = JOptionPane.showInputDialog("NAMA TOKO");
                                            nt[m-1]=nm_toko;
                                            break;
                                            
                                            case "2":
                                            almt = JOptionPane.showInputDialog("ALAMAT");
                                            al[m-1]=almt;
                                            break;
                                            
                                            case "3":
                                            nm_pemilik = JOptionPane.showInputDialog("NAMA PEMILIK");
                                            np[m-1]=nm_pemilik;
                                            break;
                                            
                                            case "4":
                                            boolean k=true;
                                            do
                                            {

                                                        ju  = JOptionPane.showInputDialog
                                                        ("\n JENIS USAHA \n \n1. PAKAIAN \n"
                                                        +"2. SARUNG \n"
                                                        +"3. MAKANAN \n"
                                                        +"4. SEPATU TAS \n"
                                                        +"5. ELEKTRONIK \n"
                                                        +"6. BARANG BEKAS \n"
                                                        +"7. LAIN - LAIN \n"
                                                        +"PILIH SALAH SATU [1 - 8]");
                                                        jenisu[m-1]=ju;

                                            }while (!("1".equals(ju) | "2".equals(ju) | "3".equals(ju)
                                                    | "4".equals(ju) | "5".equals(ju) | "6".equals(ju)
                                                    | "7".equals(ju) | "8".equals(ju)));


                                                    if ("1".equals(jenisu[m-1])) {mpju = "PAKAIAN";}
                                                    else if ("2".equals(jenisu[m-1])) {mpju = "SARUNG";}
                                                    else if ("3".equals(jenisu[m-1])) {mpju = "MAKANAN";}
                                                    else if ("4".equals(jenisu[m-1])) {mpju = "SEPATU TAS";}
                                                    else if ("5".equals(jenisu[m-1])) {mpju = "ELEKTRONIK";}
                                                    else if ("6".equals(jenisu[m-1])) {mpju = "BARANG BEKAS";}
                                                    else {mpju = "LAIN - LAIN";}
                                                    break;

                                                case "5":
                                                 do
                                                {
                                                    try
                                                    {
                                                        mod = JOptionPane.showInputDialog("MODAL");
                                                        kmod = Integer.parseInt(mod);
                                                        k = false;
                                                    }
                                                catch (Exception e)
                                                    {
                                                        k = true;
                                                        JOptionPane.showMessageDialog (null, "DATA YANG INPUT SALAH, \nMOHON MASUKAN TYPE NUMBER SAJA");
                                                    }
                                                }
                                                while (k);
                                                mo[m-1]=kmod;
                                                break;
                                                
                                                
                                                case "6":
                                                do
                                                {
                                                    penj = JOptionPane.showInputDialog("PENJUALAN \n D. DALAM NEGERI \n L. LUAR NEGERI \n S. DALAM DAN LUAR NEGERI \nPILIH SALAH SATU [D] / [L] / [S]");
                                                }
                                                while (!("D".equals(penj) | "d".equals(penj) | "L".equals(penj) | "l".equals(penj) | 
                                                        "s".equals(penj) | "S".equals(penj)));

                                                pen[m-1]=penj;
                                                if ("D".equals(pen[m-1]) | "d".equals(pen[m-1])) {mppj = "DALAM NEGERI";}
                                                else if ("L".equals(pen[m-1]) | "l".equals(pen[m-1])) {mppj = "LUAR NEGERI";}
                                                else {mppj = "DALAM DAN LUAR NEGERI";}
                                                
                                                break;

                                                case "7":
                                                do
                                                {
                                                    pembeli = JOptionPane.showInputDialog("PEMBELI \n D. DOMISTIK \n L. LUAR \n C. CAMPURAN \nPILIH SALAH SATU [D] / [L] / [C]");
                                                }
                                                while (!("D".equals(pembeli) | "d".equals(pembeli) | "L".equals(pembeli) | "l".equals(pembeli) | 
                                                        "C".equals(pembeli) | "c".equals(pembeli)));

                                                pem[m-1]=pembeli;
                                                if ("D".equals(pem[m-1]) | "d".equals(pem[m-1])) {mppm = "DOMISTIK";}
                                                else if ("L".equals(pem[m-1]) | "l".equals(pem[m-1])) {mppm = "LUAR";}
                                                else {mppm = "CAMPURAN";}
                                                
                                                break;
                                                
                                                case "8":
                                                do
                                                {
                                                    cbg = JOptionPane.showInputDialog("CABANG \n A. ADA \n T. TIDAK ADA \nPILIH SALAH SATU [A] / [T]");
                                                }
                                                while (!("T".equals(cbg) | "t".equals(cbg) | 
                                                        "A".equals(cbg) | "a".equals(cbg)));

                                                cb[m-1]=cbg;
                                                if ("t".equals(cb[m-1]) | "T".equals(cb[m-1])) {mpcb = "TIDAK ADA";}
                                                else {mpcb = "ADA";}
                                                
                                                break;
                                                
                                                case "9":
                                                email = JOptionPane.showInputDialog("ALAMAT EMAIL"); 
                                                em[m-1]=email;
                                                break;
                                                
                                                case "10":
                                                info_ped = JOptionPane.showInputDialog("INFO PEDAGANG"); 
                                                inf[m-1]=info_ped;
                                                break;
                                                
                                                case "11":
                                                no_telp = JOptionPane.showInputDialog("NOMOR TELEPON"); 
                                                not[m-1]=no_telp;
                                                break;
                                                
                                                case "12":
                                                do
                                                {
                                                    sts = JOptionPane.showInputDialog("STATUS \n N. NIKAH \n B. BELUM \nPILIH SALAH SATU [N] / [B]");
                                                }
                                                while (!("N".equals(sts) | "n".equals(sts) | 
                                                        "B".equals(sts) | "b".equals(sts)));

                                                String mpst;
                                                if ("N".equals(sts) | "n".equals(sts)) {mpst = "NIKAH";}
                                                else {mpst = "BELUM";}
                                                st[m-1]=mpst;
                                                break;
                                               }
                                    }while(selesai);  
                                    
                                        
                                        info1 = "";
                                        info1 +="\n NAMA TOKO     : "+nt[m-1];
                                        info1 +="\n ALAMAT        : "+al[m-1];
                                        info1 +="\n NAMA PEMILIK  : "+np[m-1];
                                        info1 +="\n JENIS USAHA   : "+mpju;
                                        info1 +="\n MODAL         : "+mo[m-1];
                                        info1 +="\n PENJUALAN     : "+mppj;
                                        info1 +="\n PEMBELI       : "+mppm;
                                        info1 +="\n CABANG        : "+mpcb;
                                        info1 +="\n ALAMAT EMAIL  : "+em[m-1];
                                        info1 +="\n INFO PEDAGANG : "+inf[m-1];
                                        info1 +="\n NO TELEPON    : "+not[m-1];
                                        info1 +="\n STATUS        : "+st[m-1];
                                        JOptionPane.showMessageDialog(null, info1,"DATA PEDAGANG",JOptionPane.INFORMATION_MESSAGE);
                                        putar = true;
                               }                            
                               }while(putar);
                                break;
                        }
                
                
//                /Menu Pilihan No 3/    
                case "3":{
                    do{
                        hapus=true;
                        hp=JOptionPane.showInputDialog("HAPUS DATA[Y/T]");
                        if ("y".equals(hp) | ("Y".equals(hp)))
                        {
                            j=x+1;
                            no_r = JOptionPane.showInputDialog("MASUKKAN NOMOR RUANG [1 - "+j+"] ");
                            m1 = Integer.parseInt(no_r);    
                        }
                        
                        info1 = "";
                        info1 += "NO :" + m1 + "\n";
                        info1 += "HASIL DATA PEDAGANG"
                                + " YANG DIHAPUS";
                        info1 +="\n NAMA TOKO     : "+nt[m1-1];
                        info1 +="\n ALAMAT        : "+al[m1-1];
                        info1 +="\n NAMA PEMILIK  : "+np[m1-1];
                        info1 +="\n JENIS USAHA   : "+ju;
                        info1 +="\n MODAL         : "+mo[m1-1];
                        info1 +="\n PENJUALAN     : "+mppj;
                        info1 +="\n PEMBELI       : "+mppm;
                        info1 +="\n CABANG        : "+mpcb;
                        info1 +="\n ALAMAT EMAIL  : "+em[m1-1];
                        info1 +="\n INFO PEDAGANG : "+inf[m1-1];
                        info1 +="\n NO TELEPON    : "+not[m1-1];
                        info1 +="\n STATUS        : "+st[m1-1];
                        JOptionPane.showMessageDialog(null, info1,"DATA PEDAGANG",JOptionPane.INFORMATION_MESSAGE);
                        hapusdial = JOptionPane.showInputDialog("DATA AKAN DI HAPUS [Y/T] ");
                        
                        if (("y".equals(hapusdial) | "Y".equals(hapusdial))) {
                            l = m1 -1;
                            if(l == x){
                                x = x - 1;
                            }
                            else if (l < x){
                                for (int q = 0; q<=x; q = q + 1){
                                    nt[q] = nt[q+1];
                                    al[q] = al[q+1];
                                    np[q] = np[q+1];
                                    jenisu[q]=jenisu[q+1];
                                    mo[q]=mo[q+1];
                                    pen[q]=pen[q+1];
                                    pem[q]=pem[q+1];
                                    cb[q]=cb[q+1];
                                    em[q]=em[q+1];
                                    inf[q]=inf[q+1];
                                    not[q]=not[q+1];
                                    st[q] = st[q+1];                                    
                                }
                                x=x-1;
                            }
                            else{
                               JOptionPane.showMessageDialog(null, "DATA TIDAK TERHAPUS");
                            }
                        } 
                        else{
                            hapus = false;
                        }
                        
                        lapor = "";
                        lapor += "NO :" + m1 + "\n";
                        lapor += "HASIL DATA PEDAGANG"
                                + " YANG DIHAPUS";
                        lapor +="\n NAMA TOKO     : "+nt[m1-1];
                        lapor +="\n ALAMAT        : "+al[m1-1];
                        lapor +="\n NAMA PEMILIK  : "+np[m1-1];
                        lapor +="\n JENIS USAHA   : "+ju;
                        lapor +="\n MODAL         : "+mo[m1-1];
                        lapor +="\n PENJUALAN     : "+mppj;
                        lapor +="\n PEMBELI       : "+mppm;
                        lapor +="\n CABANG        : "+mpcb;
                        lapor +="\n ALAMAT EMAIL  : "+em[m1-1];
                        lapor +="\n INFO PEDAGANG : "+inf[m1-1];
                        lapor +="\n NO TELEPON    : "+not[m1-1];
                        lapor +="\n STATUS        : "+st[m1-1];
                        JOptionPane.showMessageDialog(null, lapor,"DATA PEDAGANG",JOptionPane.INFORMATION_MESSAGE);
                        
                        if ( x == -1)
                           {
                                JOptionPane.showMessageDialog(null,"DATA KOSONG \nDATA SUDAH TIDAK BISA DIHAPUS "
                                + "\n SYSTEM AKAN KELUAR");
                                hapus = false;
                           }
                        else if (("t".equals(hp)) | ("T".equals(hp)))
                                {hapus = false;}
                    }while(hapus);
                    break;
                }
                
//                 /Menu Pilihan No 4/    
                case "4":{
                    t_data = x + 1;
                        h = t_data % 4;
                        if (h == 0) 
                        {
                            jh = t_data / 4;
                        } 
                        else
                        {
                            jh = (t_data / 4) + 1;
                        }
                        if (jh == 1) {
                            x1 = 0;
                            x2 = x;
                        } else {
                            x1 = 0;
                            x2 = 3;
                        }
                        no = 0;
                        int tot1 = 0, tot2 = 0, tot3 = 0, tot4 = 0, tot5 = 0, tot6 = 0, tot7 = 0, tot8 = 0;
                        int tot_pk = 0, tot_srg = 0, tot_mkn = 0, tot_bb = 0,
                                tot_st = 0, tot_bp = 0, tot_elk = 0, tot_dll
                                = 0;
                        for (int y = 1; y <= jh; y = y + 1) {
                            tampil = "";

                            tampil += "TANGGAL : "+ tanggal + "  " + bulan + "  " + tahun + "            HAL : "+y+"\n";
                            tampil += "                            LAPORAN DATA PEDAGANG                          \n";
                            tampil += " ==========================================================================\n";
                            tampil += "  NO   |   NAMA TOKO    |    ALAMAT     |    NAMA PEMILIK   |   JENIS USAHA\n";
                            tampil += " ==========================================================================\n";
                            tot_pk = 0;
                            tot_srg = 0;
                            tot_mkn = 0;
                            tot_bb = 0;
                            tot_st = 0;
                            tot_bp = 0;
                            tot_elk = 0;
                            tot_dll= 0;
                            if (y == jh) {
                                x2 = x;
                            }
                            for (int z = x1; z <= x2; z = z + 1) {
                                no = no + 1;
                                if ("1".equals(jenisu[z])) {mpju = "PAKAIAN";tot_pk = tot_pk + 1;}
                                else if ("2".equals(jenisu[z])) {mpju = "SARUNG";tot_srg = tot_srg + 1;}
                                else if ("3".equals(jenisu[z])) {mpju = "MAKANAN";tot_mkn = tot_mkn + 1;}
                                else if ("4".equals(jenisu[z])) {mpju = "SEPATU TAS";tot_st = tot_st + 1;}
                                else if ("5".equals(jenisu[z])) {mpju = "ELEKTRONIK";tot_elk = tot_elk + 1;}
                                else if ("6".equals(jenisu[z])) {mpju = "BARANG BEKAS";tot_bb = tot_bb + 1;}
                                else {mpju = "LAIN - LAIN";tot_dll = tot_dll + 1;}
                               
                                

                                tampil += " " + no + "  " + nt[z] + "    " + al[z] + "     " + np[z] + "     " + mpju + "  \n";

                            }
                            tampil += " ==================================================\n";
                            tampil += " PAKAIAN      = " + tot_pk +"SEPATU / TAS    = " + tot_st + " \n";
                            tampil += " SARUNG       = " + tot_srg +"BAHAN POKOK     = " + tot_bp + " \n";
                            tampil += " MAKANAN      = " + tot_mkn +"ELEKTRONIK      = " + tot_elk + " \n";
                            tampil += " BARANG BEKAS = " + tot_bb +"LAIN - LAIN     = " + tot_dll + " \n";
                            tampil += " ==================================================\n";

                            JOptionPane.showMessageDialog(null, tampil, "LAPORAN DATA PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
                            tampil = "";
                            x1 = x1 + 4;
                            x2 = x2 + 4;
                            tot1 = tot1 + tot_pk;
                            tot2 = tot2 + tot_srg;
                            tot3 = tot3 + tot_mkn;
                            tot4 = tot4 + tot_bb;
                            tot5 = tot5 + tot_st;
                            tot6 = tot6 + tot_bp;
                            tot7 = tot7 + tot_elk;
                            tot8 = tot8 + tot_dll;

                        }
                        tampil = "";
                        tampil += "TANGGAL : "+ tanggal + "  " + bulan + "  " + tahun + "            HAL : 5\n";
                        tampil += "                   LAPORAN DATA PEDAGANG                     \n";
                        tampil += " ===================================================\n";
                        tampil += " PAKAIAN      = " + tot1 + "  SEPATU / TAS    = " + tot2 + " \n";
                        tampil += " SARUNG       = " + tot3 + "  BAHAN POKOK     = " + tot4 + " \n";
                        tampil += " MAKANAN      = " + tot5 + "  ELEKTRONIK      = " + tot6 + " \n";
                        tampil += " BARANG BEKAS = " + tot7 + "  LAIN - LAIN     = " + tot8 + " \n";
                        tampil += " ==================================================\n";
                        JOptionPane.showMessageDialog(null, tampil, "LAPORAN REKAP DATA PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
                        tampil = "";

                        break;
                }
                
                case "5":{
                        t_data = x + 1;
                        h = t_data % 4;
                        if (h == 0) {
                            jh = t_data / 4;
                        } else {
                            jh = (t_data / 4) + 1;
                        }
                        if (jh == 1) {
                            x1 = 0;
                            x2 = x;
                        } else {
                            x1 = 0;
                            x2 = 3;
                        }
                        no = 0;
                        int tota = 0, totb = 0, totc = 0, totd = 0, tote = 0, totf = 0, totg = 0, toth = 0,toti=0;
                        int tot_pd = 0, tot_pc = 0, tot_pl = 0, tot_dn = 0,
                                tot_ln = 0, tot_dd = 0, tot_ta = 0, tot_ada = 0,tot_mod,rata_mod=0;
                        for (int y = 1; y <= jh; y = y + 1) {
                            tampil = "";

                            tampil += "TANGGAL : "+ tanggal + "  " + bulan + "  " + tahun + "            HAL : "+y+"\n";
                            tampil += "                            LAPORAN STATISTIK PEDAGANG                          \n";
                            tampil += " ==========================================================================\n";
                            tampil += "  NO   |   TOKO    |    MODAL     |    PENJUALAN   |   PEMBELI  |  CABANG\n";
                            tampil += " ==========================================================================\n";
                            tot_pd = 0;
                            tot_pc = 0;
                            tot_pl = 0;
                            tot_dn = 0;
                            tot_ln = 0;
                            tot_dd = 0;
                            tot_ta = 0;
                            tot_ada = 0;
                            if (y == jh) {
                                x2 = x;
                            }
                            tot_mod=0;
                            for (int z = x1; z <= x2; z = z + 1) {
                                no = no + 1;

//                               /#####################################################/
                               if ("D".equals(pen[z]) | "d".equals(pen[z])) {mppj = "DALAM NEGERI"; tot_dn = tot_dn + 1;}
                               else if ("L".equals(pen[z]) | "l".equals(pen[z])) {mppj = "LUAR NEGERI";tot_ln = tot_ln + 1;}
                               else {mppj = "DALAM DAN LUAR NEGERI";tot_dd = tot_dd + 1;}
                              

//                               /#####################################################/
                               if ("D".equals(pem[z]) | "d".equals(pem[z])) {mppm = "DOMISTIK";tot_pd = tot_pd + 1;}
                               else if ("L".equals(pem[z]) | "l".equals(pem[z])) {mppm = "LUAR";tot_pl = tot_pl + 1;}
                               else {mppm = "CAMPURAN";tot_pc = tot_pc + 1;}
                               
//                               /#####################################################/
                               if ("t".equals(cb[z]) | "T".equals(cb[z])) {mpcb = "TIDAK ADA"; tot_ta = tot_ta + 1;}
                               else {mpcb = "ADA";tot_ada = tot_ada + 1;}
                               
                               
                                tampil += " " + no + "  " + nt[z] + "    " + mo[z] + "     " + mppj + "     " + mppm + "     "+mpcb+ "     \n";
                                tot_mod = tot_mod+mo[z];

                            }
                            tampil += " ==================================================\n";
                            tampil += " PEMBELI   : D = " + tot_pd + "C  = " + tot_pc + "L = " + tot_pl + " \n";
                            tampil += " PENJUALAN   : D = " + tot_dn + "L  = " + tot_ln + "S = " + tot_dd + " \n";
                            tampil += " CABANG   : T = " + tot_ta + "A  = " + tot_ada + " \n";
                            tampil += " ==================================================\n";

                            JOptionPane.showMessageDialog(null, tampil, "LAPORAN REKAP STATISTIK PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
                            tampil = "";
                            x1 = x1 + 4;
                            x2 = x2 + 4;
                            tota = tota + tot_pd;
                            totb = totb + tot_pc;
                            totc = totc + tot_pl;
                            totd = totd + tot_dn;
                            tote = tote + tot_ln;
                            totf = totf + tot_dd;
                            totg = totg + tot_ta;
                            toth = toth + tot_ada;
                            toti = toti + tot_mod;

                        }
                        rata_mod = toti / (x+1);
                        tampil = "";
                        tampil += "TANGGAL : "+ tanggal + "  " + bulan + "  " + tahun + "            HAL : 5\n";
                        tampil += "                   LAPORAN REKAP STATISTIK PEDAGANG                     \n";
                        tampil += " ============================================================\n";
                        tampil += " PEMBELI      : " + "\n   DOMESTIK    = " + tota + "\n   CAMPURAN = "+ totb  + "\n   LUAR = " + totc +"\n";
                        tampil += " PENJUALAN      : " + "\n   DALAM NEGERI    = " + totd + "\n LUAR NEGERI = " + tote + "\n DALAM DAN LUAR NEGERI = " + totf +"\n";
                        tampil += " CABANG      : "  + "\n   TIDAK ADA    = " + totg + "\n ADA = "+ toth +"\n";
                        tampil += " RATA-RATA MODAL  = "+rata_mod+" \n";
                        tampil += " ==================================================\n";
                        JOptionPane.showMessageDialog(null, tampil, "LAPORAN REKAP STATISTIK PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
                        tampil = "";
                        
                        break;
                    }
                
                
                case "6":{
                        t_data = x + 1;
                        h = t_data % 6;
                        if (h == 0) {
                            jh = t_data / 6;
                        } else {
                            jh = (t_data / 6) + 1;
                        }
                        if (jh == 1) {
                            x1 = 0;
                            x2 = x;
                        } else {
                            x1 = 0;
                            x2 = 5;
                        }
                        no = 0;
                        int tot_a=0,tot_b=0;
                        int tot_em = 0,tot_tel = 0;
                        for (int y = 1; y <= jh; y = y + 1) {
                            tampil = "";
                            
                            tampil += "Hal : " + y + "TANGGAL : " + tanggal + "  " + bulan + "  " + tahun + "\n";
                            tampil += "                            LAPORAN ALAMAT USAHA                          \n";
                            tampil += " ==========================================================================\n";
                            tampil += "  NO     NAMA TOKO        INFO PEDAGANG         EMAIL          TELPON/HP\n";
                            tampil += " ==========================================================================\n";
                            if (y == jh) {
                                x2 = x;
                            }
                            for (int z = x1; z <= x2; z = z + 1) {
                                no = no + 1;

//                               /#####################################################/
                               if ("-".equals(em[z])|"".equals(em[z]))
                               {
                                    tot_em = tot_em + 0;
                               }
                               else 
                               {
                                    tot_em +=1;
                               }
                              

//                               /#####################################################/
                               if ("-".equals(not[z]) | "".equals(not[z])) 
                               {
                                   tot_tel +=0;
                               }
                               else 
                               {
                                   tot_tel +=1;
                               }
                               
                               
                                tampil += " " + no + "  " + nt[z] + "    " + inf[z] + "     " + em[z] + "     " + not[z] + "     \n";

                            }
                            tampil += " ==================================================\n";
                            tampil += " JUMLAH TOKO YANG MEMILIKI EMAIL   : " + tot_em + "\n";
                            tampil += " JUMLAH TOKO YANG MEMILIKI TELPON  : " + tot_tel + "\n";
                            tot_a += tot_em;
                            tot_b += tot_tel;
                            if (x2 == x)
                            {
                                tampil += " ------------------------------------------------------------\n";
                                tampil += " TOTAL KESELURUHAN  EMAIL = " + tot_a + "  TELPON = "+tot_b;
                            }

                            JOptionPane.showMessageDialog(null, tampil, "LAPORAN ALAMAT USAHA", JOptionPane.INFORMATION_MESSAGE);
                            tampil = "";
                            x1 = x1 + 6;
                            x2 = x2 + 6;
                        }
                        tampil = "";
                        
                        break;
                }
                
                
                case "7":{
                        t_data = x + 1;
                        h = t_data % 6;
                        if (h == 0) {
                            jh = t_data / 6;
                        } else {
                            jh = (t_data / 6) + 1;
                        }
                        if (jh == 1) {
                            x1 = 0;
                            x2 = x;
                        } else {
                            x1 = 0;
                            x2 = 5;
                        }
                        no = 0;
                        int tot_mod;
                        for (int y = 1; y <= jh; y = y + 1) {
                            tampil = "";
                            
                            tampil += "                       LAPORAN ALAMAT PEDAGANG DI "+lokasi+"              \n";
                            tampil += "                        PEKALONGAN BULAN "+bulan+" TAHUN "+tahun+"        \n";
                            tampil += "HAL : "+y+"\n";
                            tampil += " --------------------------------------------------------------------------\n";
                            tampil += "  NO     NAMA TOKO        ALAMAT         NAMA PEMILIK          STATUS\n";
                            tampil += " --------------------------------------------------------------------------\n";
                            if (y == jh) {
                                x2 = x;
                            }
                            tot_mod = 0;
                            for (int z = x1; z <= x2; z = z + 1) {
                                no = no + 1;                    


                                tampil += " " + no + "  " + nt[z] + "    " + al[z] + "     " + np[z] + "     " + st[z] + "     \n";
                                tot_mod += mo[z];

                            }
                            tampil += " --------------------------------------------------------------------------\n";
                            tampil += " TOTAL KESELURUHAN MODAL  : " + tot_mod + "               [TEKAN ENTER UNTUK LANJUT]\n";
                            
                            JOptionPane.showMessageDialog(null, tampil, "LAPORAN ALAMAT PEDAGANG/STATUS", JOptionPane.INFORMATION_MESSAGE);
                            tampil = "";
                            x1 = x1 + 6;
                            x2 = x2 + 6;
                        }
                        tampil = "";
                        
                        break;
                }
                
                
                case "8":{
                            int tot_ped=0, tot_nik=0,tot_jom=0;
                            
                            tampil += "         LAPORAN SELURUH STATUS PEDAGANG            \n";
                            tampil += " ---------------------------------------------------\n";
                            tampil += "  NO     NAMA PEMILIK          STATUS\n";
                            tampil += " ---------------------------------------------------\n";
                            for (int z = x; z >= 0; z = z - 1) {
                                no = no + 1;
                                tampil += " " + no + "  " + np[z] + "     " + st[z] + "     \n";
                                tot_ped += 1;
                                
                                if ("NIKAH".equals(st[z]))
                                {
                                    tot_nik++;
                                }
                                else
                                {
                                    tot_jom++;
                                }
                            }
                            tampil += " --------------------------------------------------------------------------\n";
                            tampil += " TOTAL KESELURUHAN PEDAGANG  : " + tot_ped +
                                    "\n TOTAL YANG SUDAH MENIKAH : " + tot_nik+
                                    "\n TOTAL YANG BELUM MENIKAH (kasian belom laku) : " + tot_jom;
                            
                            JOptionPane.showMessageDialog(null, tampil, "LAPORAN STATUS PEDAGANG", JOptionPane.INFORMATION_MESSAGE);
                            tampil = "";
                            
                            break;
                }
                
//                /Menu Pilihan No 9/
                case "9":{System.exit(0);}
            }
            
        }while(muter);
    }        
}