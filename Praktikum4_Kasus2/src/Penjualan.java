import java.util.Scanner;

public class Penjualan{
	private Produk menu;
	private byte id;
	private int quantity;
	private byte konfirm = 1;
	private byte valid = 0;
	Scanner keyboard = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	
	
	public Penjualan(Produk menu) {
		this.menu = menu;
	}
	
	public void inputpesanan() {
		while(valid==0) {
			System.out.print("Mau gorengan yang mana bang?(Tulis nomornya aja, ketik 11 kalo gajadi mesen): ");
			id = keyboard.nextByte();
			id -=1;
			if (id>=0 && id<10) {
				System.out.print("\nPengen pesan berapa banyak " + menu.getnama_produk()[id] + " nich?");
				quantity = keyboard.nextInt();
				valid=1;
			}
			else if(id==10) {
				konfirm=-1;
				System.out.print("Okee bang, makasih udah berkunjung kemari. Ditunggu kunjungannya lagii, Arigatou Gozaimasu");
				valid=1;
			}
			else {
				
				System.out.println("Kagak ada di menu bang buset :(\n(Tekan enter untuk lanjut memilih)");
				sc.nextLine();
			}
		}
		
		
	}
	
	public void pemesanan() {
		int stok = menu.getqty()[id];
		if (stok>=quantity) {
			int stokBaru = stok - quantity;
			menu.getqty()[id] = stokBaru;		
			double harga_total = menu.getHarga()[id]*quantity;
			System.out.println(quantity +" porsi " + menu.getnama_produk()[id]+" udah dipesen sabar yee, total harga nya: " + harga_total + " aja kokk\n");
		}
		else {
			System.out.println("Gomen, out of stock ngab :(");
		}
	}
	public void konfirmasi() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Mau pesen yang lain gak bang?(Jika ya, tekan 1)");
		konfirm = keyboard.nextByte();
		valid = 0;
		if(konfirm!=1) {
			System.out.print("Okee bang, makasih udah jajan disini. Ditunggu orderannya lagii, Arigatou Gozaimasu");
			keyboard.close();
			sc.close();
		}
		
	}

	public byte getKonfirm() {
		return konfirm;
	}
}