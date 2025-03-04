package Cofre;

public class Real extends Moeda{
	
	
	@Override
	public String info() { //implementação do metodo info criado na classe Moeda
		// TODO Auto-generated method stub
		return "Real: " + value; //retorna uma string com o tipo e o valor da moeda
		
	}

	@Override
	public double converter() { //metodo para converter a moeda para real
		return value; // retorna o valor da moeda de acordo com a cotação
		// TODO Auto-generated method stub
		
	}
	
	
}
