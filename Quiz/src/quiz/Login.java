package quiz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Login extends JFrame implements Actionlistener {
    
    
    // private JLabel judul;
     private JTextField username;
     private JLabel username1;
     private JLabel password1;
     private JTextField password;
     private JButton login;
    
     
     
     
     
     private JPanel awalPanel;
     private JPanel cardPanel;
     private CardLayout cardLayout;
     private JPanel panelPenilaian;
     
     //component input nilai
     private JLabel nama;
     private JLabel nim;
     private JLabel tipeKelas;
     private JLabel nilaiTugas;
     private JLabel nilaiQuiz;
     private JLabel hasil;
     private JLabel totalNilai;
     private JLabel tipeRuangan;
     private JLabel mataKuliah;
     private JLabel judul1;
     private JLabel judul2;
     
     private JTextField inputNama;
     private JTextField inputNim;
//     private JTextField inputTipeKelas;
     private JTextField inputRuangan;
     private JTextField inputMataKuliah;
     private JTextField inputNilai;
     private JTextField inputNilaiQuiz;
     private JTextField inputNilaiTugas;
     private JTextField total;
     private JTextField outputNilai;
     
     private JRadioButton kelasPraktikum;
     private JRadioButton kelasTeori;
     
     private JButton submit;
     private JButton logOut;
    
  
   public Login(){
         setSize(400,500);
         awalPanel = new JPanel();
         cardLayout = new CardLayout();
         panelPenilaian = new JPanel();
         cardPanel = new JPanel(cardLayout);
         
         cardPanel.add(awalPanel,"awal");
        
         
         
         awalPanel.setLayout(new GridLayout(6,1,6,6));
         
        
         // component login page
         login = new JButton("Login");
         username = new JTextField();
         username1 = new JLabel("Username: ");
         password = new JTextField();
         password1 = new JLabel("Password: ");
         
         awalPanel.add(username1);
         awalPanel.add(username);
         awalPanel.add(password);
         awalPanel.add(password1);
         awalPanel.add(password);
         awalPanel.add(login);
         
         
         
         //component Panel Penialaina
         panelPenilaian.setLayout(new GridLayout(7,1,8,8));
         cardPanel.add(panelPenilaian, "panelNilai");
         
         nama = new JLabel("nama: ");
         nim = new JLabel("NIM: ");
         tipeKelas = new JLabel("Tipe Kelas: ");
         nilaiTugas = new JLabel("Nilai Tugas: ");
         nilaiQuiz = new JLabel("Nilai Quiz: ");
         hasil = new JLabel("Hasil : ");
         totalNilai = new JLabel("Total Nilai: ");
         tipeRuangan = new JLabel("Tipe Ruangan: ");
         mataKuliah = new JLabel("Mata Kuliah: ");
         judul1 = new JLabel("HALAMAN INPUT NILAI ");
         judul2 = new JLabel("TRANSKRIP NILAI ");
         
         // text field
         inputNama = new JTextField(2);
         inputNilai = new JTextField();
         total = new JTextField();
         outputNilai = new JTextField();
     
         //button
         submit = new JButton("Submit");
         logOut = new JButton("Log Out");
         
         //radio button
            kelasPraktikum = new JRadioButton("Kelas Praktikum");
            kelasTeori = new JRadioButton("Kelas Teori");
         
         panelPenilaian.add(judul1);
         panelPenilaian.add(nama);
         panelPenilaian.add(inputNama);
         panelPenilaian.add(nim);
         panelPenilaian.add(inputNim);
         
         panelPenilaian.add(tipeKelas);
         panelPenilaian.add(kelasPraktikum);
         panelPenilaian.add(kelasTeori);
         
         panelPenilaian.add(mataKuliah);
         panelPenilaian.add(nilaiTugas);
         panelPenilaian.add(inputNilaiTugas);
         panelPenilaian.add(nilaiQuiz);
         panelPenilaian.add(inputNilaiQuiz);
         
         // button
         panelPenilaian.add(submit);
         panelPenilaian.add(logOut);
         
         panelPenilaian.add(judul2);
         
         panelPenilaian.add(nama);
         panelPenilaian.add(inputNama);
         panelPenilaian.add(nim);
         panelPenilaian.add(inputNim);
         panelPenilaian.add(tipeRuangan);
         panelPenilaian.add(inputRuangan);
         panelPenilaian.add(mataKuliah);
         panelPenilaian.add(inputMataKuliah);
         
         // hasil
         panelPenilaian.add(totalNilai);
         panelPenilaian.add(outputNilai);
         panelPenilaian.add(hasil);
         panelPenilaian.add(total);
         
         
         
    
         
//         pack(){
//         setresitable(true);
//         }
                 
       pack();{
         setResizable(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setVisible(true);
     }
     
                 
     }
     
    
     @Override
    public void actionPerformed(ActionEvent e) {
        
         if(e.getSource() == login){
            cardLayout.show(panelPenilaian, "panelNilai");
        }
       
    }
     public static void main(String[] args) {
       new Login();
    }

   

    

  
     
}
