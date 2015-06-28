package praktikum7.Interface.Extend;

import praktikum7.Interface.BentukKeliling;
import praktikum7.Interface.BentukLuas;

public interface BentukInterface extends BentukKeliling, BentukLuas{
	public static final double PHI=3.14;
	public void tulis();
}
