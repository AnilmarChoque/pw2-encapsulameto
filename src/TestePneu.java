
public class TestePneu {

	public static void main(String[] args) {
		
		
		
		Bomba bomb = new Bomba();
		bomb.setPressaoDesejada(27);
		bomb.setPressaoLida(30);
		bomb.ObterResultado();
		
		System.out.println("Resultado: "+bomb.getDifereçaPneu());

	}

}
