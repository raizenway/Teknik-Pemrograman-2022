import java.util.Scanner;

public class Penjualan{
	private Produk menu;
	private byte id;
	private int quantity;
	private byte konfirm = 1;
	Scanner keyboard = new Scanner(System.in);
	
	public Penjualan(Produk menu) {
		this.menu = menu;
	}
	
	public void inputpesanan() {
		System.out.print("Mau gorengan yang mana bang?(Tulis nomornya aja): ");
		id = keyboard.nextByte();
		System.out.print("Ingin pesan berapa banyak nich?");
		quantity = keyboard.nextInt();
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
		System.out.print("Mau pesen yang lain gak bang?(Jika ya, tekan 1)");
		konfirm = keyboard.nextByte();
		if(konfirm!=1) {
			System.out.print("Okee bang, makasih udah jajan disini. Ditunggu orderannya lagii, Arigatou Gozaimasu");
		}
	}

	public byte getKonfirm() {
		return konfirm;
	}
}