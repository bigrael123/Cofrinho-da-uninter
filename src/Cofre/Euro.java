package Cofre;

public class Euro extends Moeda{

	@Override
	public String info() { //implementação do metodo info criado na classe Moeda
		// TODO Auto-generated method stub
		return"Euro: " + value; //implementação do metodo info criado na classe Moeda
	}

	@Override
	public double converter() { //metodo para converter a moeda para real
		return value * 3; // retorna o valor da moeda de acordo com a cotação(cada euro é 3 reais)
		// TODO Auto-generated method stub
		
	}

}
