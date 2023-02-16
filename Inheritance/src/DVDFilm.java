import java.util.Scanner;

public class DVDFilm {
	private String[] judul;
	private String[] kategori;
	private String[] publisher;
	private String[] sutradara;
	private String[] pemeran;
	private int[] stok;
	private static byte id=0;
	
	public DVDFilm(){
		judul = new String[5];
		kategori = new String[5];
		publisher = new String[5];
		sutradara = new String[5];
		pemeran = new String[5];
		stok = new int[5];
	}
	
	public void entryFilm() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan judul film: ");
		judul[id] = input.nextLine();
		System.out.println("Masukkan pemeran film: ");
		pemeran[id] = input.nextLine();
		System.out.println("Masukkan sutradara film: ");
		sutradara[id] = input.nextLine();
		System.out.println("Masukkan publisher film: ");
		publisher[id] = input.nextLine();
		System.out.println("Masukkan kategori film (SU = semua umur, D = dewasa, R = remaja, A = anak-anak): ");
		kategori[id] = input.nextLine();
		System.out.println("Masukkan stok film: ");
		stok[id] = input.nextInt();
	}
	
	public void tampilFilm() {
		System.out.println("Judul film: "+ judul[id]);
		System.out.println("Pemeran film :"+pemeran[id]);
		System.out.println("Sutradara film :"+sutradara[id]);
		System.out.println("Publisher :"+publisher[id]);
		System.out.println("Kategori film: "+kategori[id]);
		System.out.println("Stok :"+stok[id]);
		
	}
	

	public String[] getJudul() {
		return judul;
	}

	public void setJudul(String[] judul) {
		this.judul = judul;
	}

	public String[] getKategori() {
		return kategori;
	}

	public void setKategori(String[] kategori) {
		this.kategori = kategori;
	}

	public String[] getPublisher() {
		return publisher;
	}

	public void setPublisher(String[] publisher) {
		this.publisher = publisher;
	}

	public String[] getSutradara() {
		return sutradara;
	}

	public void setSutradara(String[] sutradara) {
		this.sutradara = sutradara;
	}

	public String[] getPemeran() {
		return pemeran;
	}

	public void setPemeran(String[] pemeran) {
		this.pemeran = pemeran;
	}

	public int[] getStok() {
		return stok;
	}

	public void setStok(int[] stok) {
		this.stok = stok;
	}

	public byte getId() {
		return id;
	}

	public static void setId(byte id) {
		DVDFilm.id = id;
	}

	public static void nextId() {
		id++;
	}
}
