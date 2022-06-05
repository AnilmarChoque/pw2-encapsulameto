
public class TesteCaixa {

	public static void main(String[] args) {
		
		int DiametroBola = 3;
		
		Caixa cix = new Caixa();
		cix.setAltura(2);
		cix.setLargura(3);
		cix.setProfundidade(5);
		cix.cabeDentro(DiametroBola);
		
		if(cix.getCabeCaixaresp() == 1)
		{
			System.out.println("Sim");
		}
		else
		{
			System.out.println("Não");
		}
		

	}

}
