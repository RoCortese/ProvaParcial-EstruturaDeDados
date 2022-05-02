package exercicio2;

public class Fila {

	No inicio, fim;
	
	// método para inserir um elemento no final da fila (enfileirar)
	public void enfileirar(Motorista motorista) {
		No aux = new No(motorista);
		if(inicio == null) {
			inicio = aux;
		} else {
			aux.esq = fim;
			fim.dir = aux;
		}
		fim = aux;
	}
	
	// método para desenfileirar um elemento da fila, ou seja, remover o primeiro elemento
	public void desenfileirar() {
		if(inicio != null) {
			No x = inicio.dir;
			inicio.dir.esq = null;
			inicio = x;
		}
	}
	
	// método para exibir os dados (nome e placa) dos motoristas
	public void mostrarDados() {
		No x = inicio;
		while(x != null) {
			System.out.println("A placa do caminhoneiro " + x.motorista.getNome() + " é: " + x.motorista.getPlaca());
			x = x.dir;
		}
	}
}
