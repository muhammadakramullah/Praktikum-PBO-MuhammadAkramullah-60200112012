package praktikum3;

public class bitwise {

	public static void main(String[] args) {
		byte angka1 = 99;
		byte angka2 = -77;
		System.out.println(~angka1);
		System.out.println(~angka2);
		

		System.out.println(angka1 & 5);
		System.out.println(angka1 | 5);
		System.out.println(angka1 ^ 5);
		System.out.println(angka1>>3);
		System.out.println(angka2>>6);
		System.out.println(angka1<<4);
		System.out.println(angka1>>>4);
		System.out.println(angka2>>>6);
		
	}

}
