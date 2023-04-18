package TestGUI;

	import javax.swing.*;
	import java.awt.*;

	public class Restaurant {
	    public static void main(String[] args) {
	        // membuat objek JFrame
	        JFrame frame = new JFrame("Contoh GUI");

	        // membuat panel untuk komponen GUI
	        JPanel panel = new JPanel(new GridLayout(4, 2));

	        // membuat komponen GUI
	        JLabel labelNama = new JLabel("Nama:");
	        JTextField fieldNama = new JTextField(20);
	        JLabel labelAlamat = new JLabel("Alamat:");
	        JTextField fieldAlamat = new JTextField(20);
	        JLabel labelNomorHP = new JLabel("Nomor HP:");
	        JTextField fieldNomorHP = new JTextField(20);
	        JLabel labelMenu = new JLabel("Menu:");
	        JCheckBox checkBoxMenu1 = new JCheckBox("Menu 1");
	        JCheckBox checkBoxMenu2 = new JCheckBox("Menu 2");
	        JLabel labelTotalBayar = new JLabel("Total Bayar:");
	        JTextField fieldTotalBayar = new JTextField(20);
	        JTextArea areaDetailPesanan = new JTextArea(10, 20);

	        // menambahkan komponen GUI ke panel
	        panel.add(labelNama);
	        panel.add(fieldNama);
	        panel.add(labelAlamat);
	        panel.add(fieldAlamat);
	        panel.add(labelNomorHP);
	        panel.add(fieldNomorHP);
	        panel.add(labelMenu);
	        panel.add(checkBoxMenu1);
	        panel.add(new JLabel());
	        panel.add(checkBoxMenu2);
	        panel.add(labelTotalBayar);
	        panel.add(fieldTotalBayar);
	        panel.add(new JLabel("Detail Pesanan:"));
	        panel.add(areaDetailPesanan);

	        // mengatur tata letak panel
	        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	        panel.setPreferredSize(new Dimension(400, 300));

	        // menambahkan panel ke JFrame
	        frame.getContentPane().add(panel);

	        // menampilkan jendela GUI
	        frame.pack();
	        frame.setVisible(true);
	    }
	}

