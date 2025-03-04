package Cofre;

public abstract class Moeda {
	double value; //valor da moeda
	public abstract String info(); //metodo para pegar informações da moeda
	public abstract double converter(); //metodo para converter as moedas e pegar o valor total
}
