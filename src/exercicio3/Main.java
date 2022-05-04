package exercicio3;

public class Main {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		// inserção dos elementos na lista
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		
		// inverte os elementos da lista
		inverter(lista);
		
		// imprime os elementos da lista
		lista.imprimir();
	}
	
	public static void inverter(Lista lista) {
		No auxiliar = lista.fim;
		lista.inicio = auxiliar;

		boolean iterando = true;
		while (iterando) {
			auxiliar.dir = auxiliar.esq;
			auxiliar = auxiliar.esq;
		
			if(auxiliar == null) {
				iterando = false;

			}
		}
	}
}
