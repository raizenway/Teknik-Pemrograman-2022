package TestGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.Color;

import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class RestaurantMain extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_4;
	private JTextField nomor_customer;
	private JLabel lblNewLabel_1;
	private JTextField alamat_customer;
	private JLabel lblNewLabel_2;
	private JTextField nama_customer;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JTextField totalharga;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantMain frame = new RestaurantMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RestaurantMain() {
		setTitle("Aplikasi Pemesanan Makanan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aplikasi Pemesanan");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		lblNewLabel.setBounds(178, 10, 156, 23);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_4 = new JLabel("No. Telp:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(38, 156, 55, 13);
		contentPane.add(lblNewLabel_4);
		
		nomor_customer = new JTextField();
		nomor_customer.setColumns(10);
		nomor_customer.setBounds(99, 154, 126, 19);
		contentPane.add(nomor_customer);
		
		lblNewLabel_1 = new JLabel("Alamat:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(38, 116, 55, 13);
		contentPane.add(lblNewLabel_1);
		
		alamat_customer = new JTextField();
		alamat_customer.setColumns(10);
		alamat_customer.setBounds(99, 114, 126, 19);
		contentPane.add(alamat_customer);
		
		lblNewLabel_2 = new JLabel("Nama:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(38, 77, 55, 13);
		contentPane.add(lblNewLabel_2);
		
		nama_customer = new JTextField();
		nama_customer.setColumns(10);
		nama_customer.setBounds(99, 75, 126, 19);
		contentPane.add(nama_customer);
		
		lblNewLabel_3 = new JLabel("Data Customer");
		lblNewLabel_3.setBounds(23, 52, 89, 13);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("Menu");
		lblNewLabel_5.setBounds(312, 52, 89, 13);
		contentPane.add(lblNewLabel_5);
		
		totalharga = new JTextField();
		totalharga.setForeground(new Color(255, 255, 0));
		totalharga.setBackground(new Color(0, 0, 0));
		totalharga.setBounds(312, 179, 96, 19);
		contentPane.add(totalharga);
		totalharga.setColumns(10);
		
		final double[] total = {0};
		JCheckBox seblak_check = new JCheckBox("Seblak", false);
		seblak_check.setBounds(308, 74, 93, 21);
		contentPane.add(seblak_check);
		seblak_check.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(seblak_check.isSelected()) {
		            total[0] += 8000.0;
		            String totalString = Arrays.toString(total);
		            totalharga.setText(totalString);
		        }
		        else {
		        	total[0] -= 8000.0;
		        	String totalString = Arrays.toString(total);
		            totalharga.setText(totalString);
		        }
		    }
		});

		JCheckBox ayamgeprek_check = new JCheckBox("Ayam Geprek");
		ayamgeprek_check.setBounds(308, 108, 93, 21);
		contentPane.add(ayamgeprek_check);
		ayamgeprek_check.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(ayamgeprek_check.isSelected()) {
		        	total[0] += 10000.0;
		        	String ayamgeprek = ayamgeprek_check.getText();
		        	String totalString = Arrays.toString(total);
		            totalharga.setText(totalString);
		        }
		        else {
		        	total[0] -= 10000.0;
		        	String totalString = Arrays.toString(total);
		            totalharga.setText(totalString);
		        }
		    }
		});

		JCheckBox cilok_check = new JCheckBox("Cilok");
		cilok_check.setBounds(308, 142, 93, 21);
		contentPane.add(cilok_check);
		cilok_check.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
		        if(cilok_check.isSelected()) {
		        	String cilok = cilok_check.getText();
		        	total[0] += 3500.0;
		        	String totalString = Arrays.toString(total);
		            totalharga.setText(totalString);
		        }
		        else {
		        	total[0] -= 3500.0;
		        	String totalString = Arrays.toString(total);
		            totalharga.setText(totalString);
		        }
		    }
		});

		
		JTextArea datapenjualan = new JTextArea();
		datapenjualan.setBounds(38, 228, 458, 213);
		contentPane.add(datapenjualan);

		
		lblNewLabel_6 = new JLabel("Data Penjualan");
		lblNewLabel_6.setBounds(23, 205, 114, 13);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nama = nama_customer.getText();
				String nomor = nomor_customer.getText();
				String alamat = alamat_customer.getText();
				String pesanan = "";
				String total = totalharga.getText();
				if(seblak_check.isSelected()) {
					String seblak = seblak_check.getText();
					String hargaseblak = "8000";
					pesanan = pesanan+seblak+" ["+hargaseblak+"]\n";
				}
				if(ayamgeprek_check.isSelected()) {
					String ayamgeprek = ayamgeprek_check.getText();
					String hargaayamgeprek = "10000";
					pesanan = pesanan+ayamgeprek+" ["+hargaayamgeprek+"]\n";
				}
				if(cilok_check.isSelected()) {
					String cilok = cilok_check.getText();
					String hargacilok = "3500";
					pesanan = pesanan+cilok+" ["+hargacilok+"]\n";
				}
				
				datapenjualan.setText("Nama\t: " + nama +"\nAlamat\t: " +alamat+"\nTelp\t: " +nomor+"\n-------------------------------------------------------------------------------------\nPesanan:\n"
				+pesanan+"-------------------------------------------------------------------------------------\nTotal Harga\n"+total);
			}
		});
		btnNewButton.setBounds(418, 178, 55, 21);
		contentPane.add(btnNewButton);
	}
}
