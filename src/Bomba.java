
public class Bomba {
	private int pressaoDesejada;
	private int pressaoLida;
	private int diferecaPneu;
	
	public int getDiferecaPneu() {
		return diferecaPneu;
	}
	public void setDiferecaPneu(int diferecaPneu) {
		this.diferecaPneu = diferecaPneu;
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
		this.diferecaPneu= this.getPressaoDesejada() - this.getPressaoLida();
	}
	
	
	
}
