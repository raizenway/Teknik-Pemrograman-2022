import java.util.Scanner;

public class DVDMain {

	public static void main(String[] args) {
		byte opsi, valid=1;
		
		DVDFilm film = new DVDFilm();
		DVDMusik musik = new DVDMusik();
		Scanner sc = new Scanner(System.in);
		
		while(valid==1) {
			System.out.println("Ingin mengentrikan DVD apa?\n1. Film\n2. Musik");
			Scanner keyboard = new Scanner(System.in);
			opsi = keyboard.nextByte();
			if(opsi==1) {
				film.entryFilm();
				film.tampilFilm();
				DVDFilm.nextId();
				valid=0;
			}
			else if(opsi==2){
				musik.entryMusik();
				musik.tampilkanMusik();
				DVDFilm.nextId();
				valid=0;
			}
			else {
				System.out.println("Maaf, silahkan pilih opsi yang tersedia (Tekan enter untuk kembali)");
				sc.nextLine();
			}
		}
		
		
	}

}