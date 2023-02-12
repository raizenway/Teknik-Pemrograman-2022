public class Restaurant {
		
		private String[] nama_makanan;
		private double[] harga_makanan;
		private int[] stok;
		private static byte id=0;

		public String[] getNama_makanan() {
			return nama_makanan;
		}
		
		public int[] getStok() {
			return stok;
		}

		public void setStok(int[] stok) {
			this.stok = stok;
		}

		public static byte getId() {
			return id;
		}

		public static void setId(byte id) {
			Restaurant.id = id;
		}

		public Restaurant() {
			nama_makanan = new String[10];
			harga_makanan = new double[10];
			stok = new int[10];
		}
		
		public void tambahMenuMakanan(String nama, double harga, int stok) {
			this.nama_makanan[id] = nama;
			this.harga_makanan[id] = harga;
			this.stok[id] = stok;
		}
		
		public void tampilMenuMakanan() {
			System.out.println("Menu:");
			for(int i = 0; i <= id; i++){
				if(!isOutOfStock(i)) {
					System.out.println(nama_makanan[i] + "["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);					
				}
			}
		}
		public boolean isOutOfStock(int id) {
			if(stok[id] == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public static void nextId() {
			id++;
		}
		
		/*public static void tampilid() {
			id-=3;
			System.out.println(id);
		}
		
		public void tampilmakanan() {
			System.out.println(nama_makanan[id]);
		}*/
}
		
		