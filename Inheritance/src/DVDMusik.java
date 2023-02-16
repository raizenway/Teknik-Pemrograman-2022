import java.util.Scanner;

public class DVDMusik extends DVDFilm{
	private String[] penyanyi;
	private String[] produser;
	private String[] tophits;
	private String[] temp = new String[1];
	private int[] indeks = new int[1];

	DVDFilm film = new DVDFilm();
	public DVDMusik(){
		super();
		penyanyi = new String[5];
		produser = new String[5];
		tophits = new String[5];
	}
	
	public void entryMusik() {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan judul album :");
		getJudul()[getId()]=input.nextLine();
		System.out.println("Masukkan penyanyi :");
		getPenyanyi()[getId()]=input.nextLine();
		System.out.println("Masukkan produser album :");
		getProduser()[getId()]=input.nextLine();
		System.out.println("Masukkan publisher album :");
		getPublisher()[getId()]=input.nextLine();
		System.out.println("Masukkan lagu teratas :");
		getTophits()[getId()]=input.nextLine();
		System.out.println("Masukkan kategori musik (C = classic, J = jazz, P= pop, R= rock, O = Other) :");
		getKategori()[getId()]=input.nextLine();
		System.out.println("Masukkan stok DVD :");
		getStok()[getId()]=input.nextInt();
				
		
	}
	
	public void tampilkanMusik() {
		System.out.println("Judul album musik: " + getJudul()[getId()]);
		System.out.println("Nama penyanyi: " + getPenyanyi()[film.getId()]);
		System.out.println("Nama produser: " + getProduser()[film.getId()]);
		System.out.println("Nama perusahaan produksi: " + getPublisher()[film.getId()]);
		System.out.println("Lagu yang diandalkan: " + getTophits()[film.getId()]);
		System.out.println("Kategori musik: " + getKategori()[film.getId()]);
		System.out.println("Stok: " + getStok()[film.getId()]);
	}

	public String[] getPenyanyi() {
		return penyanyi;
	}

	public void setPenyanyi(String[] penyanyi) {
		this.penyanyi = penyanyi;
	}

	public String[] getProduser() {
		return produser;
	}

	public void setProduser(String[] produser) {
		this.produser = produser;
	}

	public String[] getTophits() {
		return tophits;
	}

	public void setTophits(String[] tophits) {
		this.tophits = tophits;
	}
}