
public class Bomba {
	private int pressaoDesejada;
	private int pressaoLida;
	private int difere�aPneu;
	
	public int getDifere�aPneu() {
		return difere�aPneu;
	}
	public void setDifere�aPneu(int difere�aPneu) {
		this.difere�aPneu = difere�aPneu;
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
		this.difere�aPneu= this.getPressaoDesejada() - this.getPressaoLida();
	}
	
	
	
}
