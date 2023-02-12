public class Produk {
		
		private String[] nama_produk;
		private double[] harga;
		private int[] qty;
		private static byte id=0;

		
		public double[] getHarga() {
			return harga;
		}

		public String[] getnama_produk() {
			return nama_produk;
		}
		
		public int[] getqty() {
			return qty;
		}

		public void setqty(int[] qty) {
			this.qty = qty;
		}

		public static byte getId() {
			return id;
		}

		public static void setId(byte id) {
			Produk.id = id;
		}

		public Produk() {
			nama_produk = new String[10];
			harga = new double[10];
			qty = new int[11];
		}
		
		public void tambahMenuMakanan(String nama, double harga, int qty) {
			this.nama_produk[id] = nama;
			this.harga[id] = harga;
			this.qty[id] = qty;
		}
		
		public void tampilMenuMakanan() {
			System.out.println("Menu:");
			for(int i = 0; i <= id; i++){
				if(!isOutOfStock(i)) {
					System.out.println(i+1+ ". " + nama_produk[i] + "["+qty[i]+"]"+"\tRp. "+harga[i]);					
				}
			}
		}
		public boolean isOutOfStock(int id) {
			if(qty[id] == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public static void nextId() {
			id++;
		}
		
}
		
		