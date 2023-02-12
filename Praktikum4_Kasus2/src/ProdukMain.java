public class ProdukMain {
	
	public static void main(String[] args) {
		Produk menu = new Produk ();
		Penjualan pesan = new Penjualan(menu);
		menu.tambahMenuMakanan("Bakwan", 1_000, 14);
		Produk.nextId();
		menu.tambahMenuMakanan("Gehu", 1_250, 18);
		Produk.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 17);
		Produk.nextId();
		menu.tambahMenuMakanan("Molen", 1_200, 20);
		Produk.nextId();
		menu.tambahMenuMakanan("Pisang", 1_500, 16);
		Produk.nextId();
		menu.tambahMenuMakanan("Kroket", 1_000, 15);
		Produk.nextId();
		menu.tambahMenuMakanan("Cireng", 1_000, 19);
		Produk.nextId();
		menu.tambahMenuMakanan("Tempe", 1_250, 18);
		Produk.nextId();
		menu.tambahMenuMakanan("Bola Ubi", 1_000, 20);
		Produk.nextId();
		menu.tambahMenuMakanan("Risol", 1_500, 10);
		Produk.nextId();

		while(pesan.getKonfirm()==1) {
			menu.tampilMenuMakanan();
			pesan.inputpesanan();
			if(pesan.getKonfirm()==1) {
				pesan.pemesanan();
				pesan.konfirmasi();	
			}
			
		}
		
		
		
		
	}

}
