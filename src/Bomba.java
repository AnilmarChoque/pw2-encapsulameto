
public class Bomba {
	private int pressaoDesejada;
	private int pressaoLida;
	private int difereçaPneu;
	
	public int getDifereçaPneu() {
		return difereçaPneu;
	}
	public void setDifereçaPneu(int difereçaPneu) {
		this.difereçaPneu = difereçaPneu;
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
		this.difereçaPneu= this.getPressaoDesejada() - this.getPressaoLida();
	}
	
	
	
}
