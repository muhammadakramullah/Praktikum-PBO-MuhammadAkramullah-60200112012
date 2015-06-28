package praktikum7.Bentuk;
import praktikum7.Bentuk.Bentuk;
import praktikum7.Bentuk.SegitigaSamaKaki;
import praktikum7.Bentuk.SeigitigaSamaSisi;
import praktikum7.Bentuk.bujurSangkar;

public class cobaBentuk {
	public static void cetakBangun(Bentuk b){
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}
	public static void main(String[] args) {
		cetakBangun(new bujurSangkar());
		cetakBangun(new SegitigaSamaKaki());
		cetakBangun(new SeigitigaSamaSisi());
	}

}
