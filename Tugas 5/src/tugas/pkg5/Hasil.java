/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg5;

import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class Hasil extends JFrame {
    String nama, jk, agama, hobby;
    JLabel kalimat = new JLabel("OUTPUT");;
    
    JLabel lnama = new JLabel(" Nama Lengkap : ");
    JLabel ljk = new JLabel(" Jenis Kelamin : ");
    JLabel lagama = new JLabel(" Agama : ");
    JLabel lhobby = new JLabel(" Hobby : ");
 
    JLabel hasilNama = new JLabel();
    JLabel hasilJk = new JLabel();
    JLabel hasilAgama = new JLabel();
    JLabel hasilHobby = new JLabel();
   
    public Hasil(String nama,String jk,String agama,String hobby){ 
        
        setTitle("Output");
	setDefaultCloseOperation(3);
	setSize(350,500);
        setLocation(500,150);
        
        this.nama = nama;
        this.jk = jk;
        this.agama = agama;
        this.hobby = hobby;
        hasilNama.setText(nama);
        hasilJk.setText(jk);    
        hasilAgama.setText(agama); 
        hasilHobby.setText(hobby);
        
        setLayout(null);
        add(kalimat);
        add(lnama);
        add(ljk);
        add(lagama);
        add(lhobby);
        add(hasilNama);
        add(hasilJk);
        add(hasilAgama);
        add(hasilHobby);
        
        kalimat.setBounds(10, 10, 140, 10);
        lnama.setBounds(10,20,120,20);
	ljk.setBounds(10,45,120,20);
        lagama.setBounds(10,70,120,20);
        lhobby.setBounds(10,100,120,20);
        hasilNama.setBounds(110,20,120,20);
	hasilJk.setBounds(110,45,120,20);
        hasilAgama.setBounds(110,70,120,20);
        hasilHobby.setBounds(110,100,150,20);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
