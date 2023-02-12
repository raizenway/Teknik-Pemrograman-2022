public class ProdukMain {
	
	public static void main(String[] args) {
		Produk menu = new Produk ();
		Penjualan pesan = new Penjualan(menu);
		menu.tambahMenuMakanan("1. Bala-bala", 1_000, 14);
		Produk.nextId();
		menu.tambahMenuMakanan("2. Gehu", 1_000, 18);
		Produk.nextId();
		menu.tambahMenuMakanan("3. Tahu", 1_000, 17);
		Produk.nextId();
		menu.tambahMenuMakanan("4. Molen", 1_000, 20);
		Produk.nextId();
		menu.tambahMenuMakanan("5. Pisang", 1_000, 16);
		Produk.nextId();
		menu.tambahMenuMakanan("6. Kroket", 1_000, 15);
		Produk.nextId();
		menu.tambahMenuMakanan("7. Cireng", 1_000, 19);
		Produk.nextId();
		menu.tambahMenuMakanan("8. Tempe", 1_000, 18);
		Produk.nextId();
		menu.tambahMenuMakanan("9. Bola Ubi", 1_000, 20);
		Produk.nextId();
		menu.tambahMenuMakanan("10. Risol", 1_500, 10);
		Produk.nextId();

		while(pesan.getKonfirm()==1) {
			menu.tampilMenuMakanan();
			pesan.inputpesanan();
			pesan.pemesanan();
			pesan.konfirmasi();
		}
		
		
		
		
	}

}
