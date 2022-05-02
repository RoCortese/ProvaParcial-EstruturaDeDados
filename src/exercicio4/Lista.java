package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// método para inserir um elemento na lista.
	// a inserção deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No auxiliar = new No(dado);
		if (inicio == null) {
			inicio = auxiliar;
			fim = auxiliar;
		}
		else {
			No aux_inicio = inicio;
			boolean inserido = false;
			while (!inserido) {
				if (dado < aux_inicio.dado) {
					if (aux_inicio == inicio) {
						inicio = auxiliar;
					} else {
						aux_inicio.esq.dir = auxiliar;
					}
					aux_inicio.esq = auxiliar;
					auxiliar.dir = aux_inicio;
					inserido = true;
				} else {
					if (aux_inicio == fim) {
						aux_inicio.dir = auxiliar;
						auxiliar.esq = aux_inicio;
						fim = auxiliar;
						inserido = true;
					} 
					aux_inicio = aux_inicio.dir;
				}
			}
		}
	}
		
	// método para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}
