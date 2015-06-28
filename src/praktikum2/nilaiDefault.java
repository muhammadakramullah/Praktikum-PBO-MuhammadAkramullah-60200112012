package praktikum2;

public class nilaiDefault {
	static boolean bool;
	static byte by;
	static char ch;
	static double d;
	static float f;
	static int i;
	static long l;
	static short sh;
	static String \u006e\u0061\u006d\u0061 = "Nama saya \u0061\u006b\u0072\u0061\u006d"; /*Akram*/
	
	public static void main(String[] args){
		if (nama == null) /*jika nilai dari variable nama tidak d inisialisasi*/
		{		
			System.out.println("nilai default boolean " + bool);	
			System.out.println("nilai default Byte " + by);
			System.out.println("nilai default char " + ch);
			System.out.println("nilai default double " + d);
			System.out.println("nilai default Float " + f);
			System.out.println("nilai default int " + i);
			System.out.println("nilai default long " + l);
			System.out.println("nilai default short " + sh);
			System.out.println(nama);
			
		}
		else {
			Boolean refBoolean = new Boolean(true); /*memberikan nilai true pada var refBoolean bertype Boolean*/
			boolean bool = refBoolean.booleanValue(); /*variable bool menyamakan nilai dengan nilai refBoolean*/		
			System.out.println("bool " + bool);
			
			Byte refByte = new Byte((byte) 124);
			byte b = refByte.byteValue();		
			System.out.println("Byte " + b);
			
			Character refChar = new Character((char) 65); /*memberikan nilai 65 pada var refChar bertype Character*/
			char c = refChar.charValue();	/*variable c menyamakan nilai dengan nilai refChar, hasil untuk 65 = A, d terjemahkan dari ASCII*/
			System.out.println("char " + c );
			
			Double refDouble = new Double(0.155f);
			double d = refDouble.doubleValue();		
			System.out.println("double " + d);
			
			Float refFloat = new Float(12.3F);
			float f = refFloat.floatValue();
			System.out.println("Float " + f);
			
			Integer refInteger = new Integer(65000);
			int i = refInteger.intValue();		
			System.out.println("int " + i);
			
			Long refLong = new Long(2000000000);
			long l = refLong.longValue();		
			System.out.println("long " + l);
			
			Short refShort = new Short((short) 'A');
			short s = refShort.shortValue();	/*diterjemahkan menajdi kode ASCII, A = 65*/
			System.out.println("short " + s);
			
			System.out.println(nama); /*variable nama di dapat dari unicode \u006e\u0061\u006d\u0061*/
			
		}		
	}
}
