package Cofre;

public class Dolar extends Moeda{

	@Override
	public String info() { //implementação do metodo info criado na classe Moeda
		// TODO Auto-generated method stub
		return "Dolar: " + value; //implementação do metodo info criado na classe Moeda
	}

	@Override
	public double converter() { //metodo para converter a moeda para real
		return value * 2; // retorna o valor da moeda de acordo com a cotação(cada dolar é 2 reais)
		
		// TODO Auto-generated method stub
		
	}

}
