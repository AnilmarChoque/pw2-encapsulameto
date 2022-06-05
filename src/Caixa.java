
public class Caixa {
	
	private int altura;
	private int largura;
	private int profundidade;
	private int cabeCaixaResp;
	
	public int getCabeCaixaresp() {
		return cabeCaixaResp;
	}
	public void setCabeCaixaResp(int cabeCaixaResp) {
		this.cabeCaixaResp = cabeCaixaResp;
	}
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
	
	public void cabeDentro(int diametroBola)
	{
		if((diametroBola <= this.getAltura() && diametroBola <= this.getLargura()) && diametroBola <= this.getProfundidade())
		{
			this.cabeCaixaResp = 1;
		}
		else
		{
			this.cabeCaixaResp = 2;
		}
	}

}
	