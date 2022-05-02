package exercicio1;

public class Lista {
	No inicio, fim;
	
	// insere um nó no final da lista. Esse método será chamado pelo método inserir
	private void inserirFim(No aux) {
		if(inicio == null) {
			inicio = aux;
		} else {
			fim.prox = aux;
		}
		fim = aux;
	}
	
	//esse método deverá ser implementado de acordo com o enunciado do exercício
	private void inserirPrioridade(No aux) {
		if(inicio == null){
			inicio = aux;
			fim = aux;

		} else {
			if(fim.cor.equals(aux.cor)) {

			} else {
				No verde = null;
				if(inicio.cor.equals(aux.cor)){
					No amarelo = inicio;
	
						while(amarelo.prox.cor.equals(aux.cor)){
							amarelo = amarelo.prox;
	
						}
	
					verde = amarelo.prox;
					amarelo.prox = aux;
					aux.prox = verde;
	
				} else {
					verde = inicio;
					inicio = aux;
					aux.prox = verde;
				}
			}
		}
	}
	
	
	// método inserir. Esse método será chamado a partir da classe Main
	public void inserir(int numero, String cor) {
		No aux = new No(numero, cor);
		if(cor.equalsIgnoreCase("verde")) {
			inserirFim(aux);
		} else {
			inserirPrioridade(aux);
		}
	}
	
	// método utilizado para imprimir os dados da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.numero);
			aux = aux.prox;
		}
	}
}
