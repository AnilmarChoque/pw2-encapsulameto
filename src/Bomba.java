
public class Bomba {
	private int pressaoDesejada;
	private int pressaoLida;
	private int diferešaPneu;
	
	public int getDiferešaPneu() {
		return diferešaPneu;
	}
	public void setDiferešaPneu(int diferešaPneu) {
		this.diferešaPneu = diferešaPneu;
	}
	
	public int getPressaoDesejada() {
		return pressaoDesejada;
	}
	public void setPressaoDesejada(int pressaoDesejada) {
		this.pressaoDesejada = pressaoDesejada;
	}
	public int getPressaoLida() {
		return pressaoLida;
	}
	public void setPressaoLida(int pressaoLida) {
		this.pressaoLida = pressaoLida;
	}
	
	public void ObterResultado()
	{
		this.diferešaPneu= this.getPressaoDesejada() - this.getPressaoLida();
	}
	
	
	
}
