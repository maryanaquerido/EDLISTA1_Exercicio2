package controller;

public class ControllerMenorVetor {
	public ControllerMenorVetor() {
		super ();
		
	}
	
	public int MostraMenorValor (int[] vet, int tamanho, int menor) {
		if (tamanho == 0) { // CONDIÇÃO DE PARADA: QUANDO TAMANHO FOR ZERO QUER DIZER QUE JA PERCORREMOS TODO O VETOR, A RECURSIVA ACABA E DEVE RETORNAR O MENOR VALOR ENCONTRADO.
			return menor;
		}
		else {
			if (vet[tamanho-1] < menor) {
				menor = vet[tamanho-1];
			}
			return MostraMenorValor(vet, tamanho-1, menor);
		}
	}


//RELAÇÃO DE CHAMADA DE PASSOS:

//TAMANHO = 8, LOGO VET[TAMANHO-1] = VET[7] = 1

//1. MOSTRAMENORVALOR (VET, 8, 1)
//1.1 CONFERE SE 1 É MENOR QUE 1. NÃO É, ENTÃO SEGUE 

//2. MOSTRAMENORVALOR (VET, 7, 1)
//2.1 CONFERE SE 8 É MENOR QUE 1. NÃO É, ENTÃO SEGUE

//3. MOSTRAMENORVALOR (VET, 6, 1)
//3.1 CONFERE SE 4 É MENOR QUE 1. NÃO É, ENTÃO SEGUE

//4. MOSTRAMENORVALOR (VET, 5, 1)
//4.1 CONFERE SE -8 É MENOR QUE 1. É, ENTÃO MENOR RECEBE -8, ENCERRA A RECURSIVA E RETORNA O MENOR.

// MENOR = -8



