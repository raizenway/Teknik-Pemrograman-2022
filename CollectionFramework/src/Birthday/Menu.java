package Birthday;

import java.util.Scanner;

public class Menu {
	private int pilih, tanggal, bulan;
	private String uncle, niece, hadiah;
	
	
	Family family = new Family();
	
	Scanner input = new Scanner(System.in);
	
	public void tampilanMenuUtama() {
		System.out.println("1. Keluarga");
		System.out.println("2. Hadiah");
		System.out.println("99 Keluar");
		System.out.print("Pilih Opsi Menu : ");
		pilih = input.nextInt();
		this.pilihTampilkanMenuUtama(pilih);
	}
	
	public void pilihTampilkanMenuUtama(int pilih) {
		switch(pilih) {
		case 1: 
			tampilanMenuFamily();
			break;
		case 2:
			tampilanMenuPresent();
			break;
		case 0:
			break;
		default:
			System.out.println("Masukkan Opsi Yang Valid");
			this.tampilanMenuUtama();
		}
	}
	
	public void tampilanMenuFamily() {
		System.out.print("\033\143");
		System.out.println("1. Tambahkan Paman");
		System.out.println("2. Tambahkan Keponakan");
		System.out.println("3. Cari Paman");
		System.out.println("4. Cari Keponakan");
		System.out.println("5. Tampilkan Paman");
		System.out.println("6. Tampilkan Keponakan");
		System.out.println("99 Kembali");
		pilih = input.nextInt();
		pilihMenuTampilkanMenuFamily(pilih);
	}
	
	public void pilihMenuTampilkanMenuFamily(int pilih) {
		switch(pilih) {
			case 1:
				System.out.print("\033\143");
				System.out.println("Masukan nama uncle : ");
				uncle = input.next();
				family.addUncle(uncle);
				break;
			case 2: 
				System.out.print("\033\143");
				System.out.println("Masukan nama niece : ");
				niece = input.next();
				System.out.print("Masukan tanggal lahir niece : ");
				tanggal = input.nextInt();
				System.out.print("Masukan bulan lahir niece : ");
				bulan = input.nextInt();
				family.addNiece(niece, tanggal, bulan);
				break;
			case 3: 
				System.out.print("\033\143");
				System.out.print("Masukan nama uncle : ");
				uncle = input.next();
				family.findUncle(uncle);
				break;
			case 4: 
				System.out.print("\033\143");
				System.out.print("Masukan nama niece : ");
				niece = input.next();
				family.findNiece(niece);
				break;
			case 5: 
				System.out.print("\033\143");
				family.listUncles();
				break;
			case 6: 
				System.out.print("\033\143");
				family.listNieces();
				break;
			case 0: 
				System.out.print("\033\143");
				tampilanMenuUtama();
				break;
			default: 
				System.out.print("\033\143");
				System.out.println("Opsi Tersebut Tidak Ada");
				tampilanMenuFamily();
		}
		tampilanMenuUtama();
	}
	
	public void tampilanMenuPresent() {
		System.out.print("\033\143");
		System.out.println("1. Tambah Hadiah");
		System.out.println("2. Display Pemberi Hadiah");
		System.out.println("3. Display Penerima Hadiah");
		System.out.println("99 Kembali");
		pilih = input.nextInt();
		pilihTampilanMenuPresent(pilih);
	};
	
	public void pilihTampilanMenuPresent(int pilih) {
		switch(pilih) {
			case 1: 
				System.out.print("\033\143");
				System.out.print("Isi nama Paman : ");
				uncle = input.next();
				System.out.print("Isi nama Keponakan : ");
				niece = input.next();
				System.out.print("Masukan nama hadiah : ");
				hadiah = input.next();
				family.findUncle(uncle).addPresent(family.findNiece(niece), hadiah);
				break;
			case 2: break;
			case 3:
				System.out.print("\033\143");
				System.out.print("Masukan nama Keponakan : ");
				niece = input.next();
				family.findNiece(niece).listPresents(family.getUncles());
				break;
			case 4:
				System.out.print("\033\143");
				System.out.print("Masukan nama Paman : ");
				uncle = input.next();
				family.findUncle(uncle).listPresents(family.getNieces());
				break;
			case 0: 
				tampilanMenuUtama();
				break;
			default:
				System.out.println("Masukkan Opsi Yang Valid!");
				tampilanMenuPresent();
		}
		tampilanMenuUtama();
	}
 }

