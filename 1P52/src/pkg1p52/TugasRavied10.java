package pkg1p52;
import javax.swing.*;
public class TugasRavied10 {
    public static void main(String[]args)
    {
        int no=0, tu=0, tum=0; String maneh="y", penj1="";
        penj1+="        REKAP SISWA        \n";
        penj1+="-----------------------------------------------------------------\n";
        penj1+="  NO    NAMA    UMUR    UANG  \n";
        penj1+="-----------------------------------------------------------------\n";
        while("y".equals(maneh)|"Y".equals(maneh))
        {
            no=no+1; String penj="";
            String nm_s= JOptionPane.showInputDialog("NAMA SISWA");
            String old= JOptionPane.showInputDialog("UMUR SISWA");
            int n_old=Integer.parseInt(old);
            String mny= JOptionPane.showInputDialog("UANG JAJAN");
            int n_mny=Integer.parseInt(mny);
            penj+="          DATA HARIAN        \n";
            penj+="----------------------------------\n";
            penj+="NO = "+no+"\n";
            penj+="NAMA = "+nm_s+"\n";
            penj+="UMUR SISWA = "+old+"\n";
            penj+="UANG JAJAN = "+mny+"\n";
            tu=tu+n_mny;
            tum=tum+n_old;
            penj1+="  "+no+"    "+nm_s+"    "+old+"    "+mny+"  \n";
            JOptionPane.showMessageDialog(null,penj,"",JOptionPane.INFORMATION_MESSAGE);
            do
            {
                maneh= JOptionPane.showInputDialog("INPUT DATA {Y/T}");
            }
            while(!("y".equals(maneh)|"Y".equals(maneh)|"t".equals(maneh)|"T".equals(maneh)));
        }
        penj1+="-----------------------------------------------------------------\n";
        penj1+="TOTAL UANG = "+tu+"\n";
        penj1+="TOTAL UMUR = "+tum+"\n";
        JOptionPane.showMessageDialog(null,penj1,"",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }   
}
