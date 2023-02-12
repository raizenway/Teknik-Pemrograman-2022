public class Menu{
	private Restaurant menu;
	
	public Menu(Restaurant menu) {
		this.menu = menu;
	}
	
	public void pemesanan(int id, int jumlahPesanan) {
		int stok = menu.getStok()[id];
		if (stok>=jumlahPesanan) {
			int stokBaru = stok - jumlahPesanan;
			menu.getStok()[id] = stokBaru;		
			System.out.println(jumlahPesanan +" porsi " + menu.getNama_makanan()[id]+" telah dipesan, stok saat ini: " +stokBaru + "\n");
		}
		else {
			System.out.println("Maaf, stok " + menu.getNama_makanan()[id]+" tidak mencukupi.\n");
		}
	}
}