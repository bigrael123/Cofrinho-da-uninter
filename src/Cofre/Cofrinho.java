package Cofre; //nome do pacote

import java.util.ArrayList; //importando arraylist
import java.util.Scanner; //importando scanner

public class Cofrinho {

	private static ArrayList<Moeda> listaMoedas; // declarando lista de moedas

	public static void main(String[] args) {
		listaMoedas = new ArrayList<Moeda>(); // iniciando lista de moedas
		while (true) { // loop da ação inicial
			int a = 0; // iniciando a variavel a que é o numero usado para escolher a ação
			// Texto das opções de ações
			System.out.println("Selecione sua ação:");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Valor Total Convertidoa");
			System.out.println("5 - Encerrar");
			try {
				Scanner acao = new Scanner(System.in); // cria scanner
				a = acao.nextInt(); // pega o valor digitado pelo usuário e o dá para a variavel a
			} catch (Exception e) { // detecta erro
				System.out.println("Por favor digite apenas numeros"); // erro quando usário digita algo que não é um
																		// número
				continue;
			}

			if (a > 0 && a < 6) { // se o usuário tiver digitado um número entre 1 e 5 continue o if
				if (a == 1) { // se o usuario tiver digitado o numero 1 continue o if
					while (true) { // loop do tipo de moeda
						// texto da seleção de tipo de moeda
						System.out.println("Selecione O tipo de moeda:");
						System.out.println("1 - Real");
						System.out.println("2 - Euro");
						System.out.println("3 - Dolar");
						System.out.println("4 - Voltar");
						try {
							Scanner adicionarTipo = new Scanner(System.in); // cria o scanner
							int aT = adicionarTipo.nextInt(); // atribui o valor digitado pelo usário a variável aT
							if (aT > 0 && aT < 5) { // se o usuario tiver digitado um número entre 1 e 4 continue o if
								if (aT == 1) { // se o usuário tiver digitado o número 1 continue o if
									while (true) { // while para adicionar reais
										// Texto da quantidade de reais
										System.out.println("Quantos reais você quer adicionar?");
										try {
											Scanner adicionarValor = new Scanner(System.in); // cria o scanner
											int aV = adicionarValor.nextInt(); // da o valor de aV o que o usário
																				// digitou
											System.out.println("Você adicionou " + aV + " Reais."); // escreve uma
																									// mensagem com a
																									// quantidade de
																									// reais adicionados
											Moeda moeda = new Real(); // cria a moeda real
											moeda.value = aV; // da o valor a moeda
											adicionar(moeda); // adiciona a moeda a lista de moedas
											break; // encerra o loop
										} catch (Exception e) {
											System.out.println("Por favor digite apenas numeros."); // erro se o usuário
																									// digitar algo que
																									// não seja numers
											continue; // reinicia o loop da adição de reais
										}
									}
									break; // encerra o loop do tipo de moeda
								}
								// os próximos 2 ifs são iguais ao amterior mas com euro e dolar ao invés de
								// reais
								if (aT == 2) {
									while (true) {
										System.out.println("Quantos euros você quer adicionar?");
										try {
											Scanner adicionarValor = new Scanner(System.in);
											int aV = adicionarValor.nextInt();
											System.out.println("Você adicionou " + aV + " Euros.");
											Moeda moeda = new Euro();
											moeda.value = aV;
											adicionar(moeda);
											break;
										} catch (Exception e) {
											System.out.println("Por favor digite apenas numeros.");
											continue;
										}
									}
									break;

								}

								if (aT == 3) {
									while (true) {
										System.out.println("Quantos reais você quer adicionar?");
										try {
											Scanner adicionarValor = new Scanner(System.in);
											int aV = adicionarValor.nextInt();
											System.out.println("Você adicionou " + aV + " Dola(res).");
											Moeda moeda = new Dolar();
											moeda.value = aV;
											adicionar(moeda);
											break;
										} catch (Exception e) {
											System.out.println("Por favor digite apenas numeros.");
											continue;
										}

									}

								}
								if (aT == 4) { // encerra o loop da seleção de tipo de moeda
									break;

								}
							} else {
								System.out.println("Numero inválido."); // mensagem de erro se o numero estiver fora do
																		// intervalo
								continue;
							}
						} catch (Exception e) {
							System.out.println("Por favor digite apenas numeros."); // erro se o usuário digitar algo
																					// que nãp seja numeros
							continue;// renicia o loop de tipo de moeda
						}

						break;
					}

				}
				if (a == 2) { // se o usuário tiver digitado 2
					while (true) { // while da remoção de moeda
						// texto da remoçãp de moeda
						System.out.println("Qual Moeda Você quer remover?");
						// lista moedas
						listagemMoedas();
						// detecta quantidade de moedas e mostra um número acima para o usário voltar
						System.out.println(listaMoedas.size() + 1 + " - Voltar");
						try {
							Scanner removerMoeda = new Scanner(System.in);// cria um scanner
							int rM = removerMoeda.nextInt(); // da o valord digitado pelo usuário a variável rM
							if (rM > 0 && rM - 1 < listaMoedas.size()) { // checa se o número esta no intervalo do array
								remover(listaMoedas.get(rM - 1)); // seleciona a moeda digitada pelo usuário( é o valor
																	// digitado -1 para achar a moeda)
							} else {
								if (rM == listaMoedas.size() + 1) { // s o usuário tiver digitado o número voltar(1 a
																	// mais que o tamanho da lista)
									break; // quebra o loop da seleção da remoção de moedas
								}
								continue; // renicia o loop se o if anterior não passar
							}

							break; // quebra o loop da seleção da remoção de moedas
						} catch (Exception e) {
							System.out.println("Por favor digite apenas numeros."); // se o usuário digitar algo que não
																					// seja números esse erro será
																					// mostrado
							continue; // reinicia o loop da remoção de moedas
						}

					}
				}
				if (a == 3) { // se o usuário tiver digitado 3
					listagemMoedas(); // chama o metodo de listagem das moedas
				}
				if (a == 4) { // se o usuário tiver digitado 4
					totalConvertido(); // chama o métpodo da conversão das moedas
				}
				if (a == 5) { // se o usuário tiver digitado 5
					System.out.println("Encerrando programa..."); // mensagem de encerramento do programa
					System.exit(0); // fechando o programa
				}

			} else {
				System.out.println("Numero inválido."); // texto mostrado se o usuário digitar um numero que não esteha
														// no intervalo correto
				continue; // reinicia o loop inicial
			}

		}

	}

	public static void adicionar(Moeda moeda) { // metodo adiciona moeda a lista de moedas
		listaMoedas.add(moeda); // adiciona a moeda a lista de moedas
	}

	public static void remover(Moeda moeda) { // metodo remove a moeda da lista de moedas
		listaMoedas.remove(moeda); // remove a moeda da lista de moedas
	}

	public static void listagemMoedas() {// metodo para listar as moedas
		int count = 0; // variável para contar a quantidade de moedas
		for (Moeda moeda : listaMoedas) { // loop para analisar as moedas
			count += 1; // adiciona 1 a contagem
			System.out.println(count + " - " + moeda.info()); // mostra a contagem da moeda, seu tipo e seu valor
		}

	}

	public static void totalConvertido() { // metodo para conversão das moedas para real
		double Total = 0; // inicialização do valor total
		for (Moeda moeda : listaMoedas) { // loop para pegar valor de todas as moedas
			Total += moeda.converter(); // adiciona o valor da moeda atual ao total
		}
		System.out.println("Valor Total Convertido: " + Total); // mostra o valor total convertido para o usuário
	}
}
