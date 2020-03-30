/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg5;

/**
 *
 * @author ASUS
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Data extends JFrame {
    String nama,jk,agama,hobby;
    final JTextField fnama = new JTextField(10);

    JLabel lnama = new JLabel(" Nama Lengkap ");
    JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
    
    JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
    JRadioButton rbWanita = new JRadioButton("perempuan ");

    JLabel lagama = new JLabel(" Agama ");
    String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);

    JLabel lhobby = new JLabel(" Hobby ");

    JCheckBox cbSepakbola = new JCheckBox(" Sepakbola ");
    JCheckBox cbBasket = new JCheckBox(" Basket ");

    JButton btnSave = new JButton("OK");
   
    JLabel hasilNama = new JLabel();
    JLabel hasilK = new JLabel();
    JLabel hasilAgama = new JLabel();
    JLabel hasilH = new JLabel();
   
    public Data() {
	setTitle("Input");
	setDefaultCloseOperation(3);
	setSize(350,500);
        setLocation(500,150);
        

	ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
	group.add(rbWanita);

	setLayout(null);
	add(lnama);
	add(fnama);
	add(ljeniskelamin);
	add(rbPria);
	add(rbWanita);
	add(lagama);
	add(cmbAgama);
	add(lhobby);
	add(cbSepakbola);
	add(cbBasket);
	add(btnSave);
        add(hasilNama);
        add(hasilK);
        add(hasilAgama);
        add(hasilH);

	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
	lnama.setBounds(10,10,120,20);
	fnama.setBounds(130,10,150,20);
	ljeniskelamin.setBounds(10,35,120,20);
	rbPria.setBounds(130,35,100,20);
	rbWanita.setBounds(230,35,100,20);
	lagama.setBounds(10,60,150,20);
	cmbAgama.setBounds(130,60,150,20);
	lhobby.setBounds(10,85,120,20);
	cbSepakbola.setBounds(130,85,100,20);
	cbBasket.setBounds(230,85,150,20);
	btnSave.setBounds(100,130,120,20);
        hasilNama.setBounds(10, 150, 120, 20);
        hasilK.setBounds(10, 170, 120, 20);
        hasilAgama.setBounds(10, 190, 120, 20);
        hasilH.setBounds(10, 210, 120, 20);
        btnSave.addActionListener((e) -> {
            if(fnama.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Nama tidak ada");}
                else{
                    nama = fnama.getText();
                if(rbPria.isSelected()){
                    jk=rbPria.getText();
                }
                else if(rbWanita.isSelected()){
                    jk=rbWanita.getText();
                }
        
                agama = (String) cmbAgama.getSelectedItem();
        
                if(cbSepakbola.isSelected()&&cbBasket.isSelected())
                {
                    hobby=cbSepakbola.getText()+" dan "+cbBasket.getText();
                }
                else if(cbSepakbola.isSelected()){
                    hobby=cbSepakbola.getText();
                }
                else if(cbBasket.isSelected()){
                    hobby=cbBasket.getText();
                }
                Hasil hasil = new Hasil(nama,jk,agama,hobby);
                hasil.setVisible(true);
            }
        dispose();   
        });
	setVisible(true);
   }
}

    
