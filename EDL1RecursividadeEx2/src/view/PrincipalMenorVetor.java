package view;
import controller.ControllerMenorVetor;
public class PrincipalMenorVetor {
	public static void main (String [] args) {
		
		ControllerMenorVetor m = new ControllerMenorVetor();
		int[] vet = {5, 12, 14, 3,-8, 4, 8, 1};
		int tamanho = vet.length;
		int menor = m.MostraMenorValor(vet, tamanho, vet[tamanho-1]);
		System.out.println("O menor valor deste vetor é " + menor);
	
	}

}
