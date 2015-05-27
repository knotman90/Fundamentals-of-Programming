
public class Esercizi {


	//-----------------------------------------------------------------------------------------------
	/*ENGLISH:
	Write a procedure that take a vector on integers A of length n as input and returns true if 
	for each 1 <= i<=n-1  A[i] = A[i+1]-A[i-1]
	Example:A= [1, 2, 3, 5, 8, 13, 21] return TRUE!

 ITALIAN:
 	Scrivere un metodo verifica che riceve un vettore A di interi di lunghezza n, e restituisce il valore true se ogni
	elemento di A, ad esclusione del primo e dell’ultimo, è uguale alla differenza tra l’elemento che lo segue e quello che lo
	precede, false altrimenti. Ad esempio, se A= [1, 2, 3, 5, 8, 13, 21] il metodo restituirà true.

	 */

	//SOLUTION
	// Author: Davide Spataro
	public static boolean verify(int [] A) {

		for(int i=1;i<A.length-1;i++){
			if(A[i]!=A[i+1]-A[i-1])
				return false;
		}
		return true;
	}



	//-----------------------------------------------------------------------------------------------
	/*ENGLISH:
	Write the disting procedure that takes a vector on integers V as input and returns the number of elements
	that are distinct from each other in V itself. An element of index i is not repeated if does not exist j != i
	s.t. V[i] = V[j]
	Example: V = [15, 12, 3, 15, 7, 12] -> n = 2 (infact, V[2] e V[4] appears just once, others are repeated (hence not distinct)).
	Example: V = [15, 12, 15, 12] -> n = 0.

ITALIAN:
	Si scriva un metodo distinti che riceve un array di interi V e restituisce il numero di elementi distinti di V, cioè quelli
	che compaiono una sola volta in V.
	Esempio: V = [15, 12, 3, 15, 7, 12] -> n = 2 (infatti, V[2] e V[4] compaiono una sola volta ciascuno).
	Esempio: V = [15, 12, 15, 12] -> n = 0.

	 */

	//SOLUTION
	//Author: Davide Spataro
	public static int distinct(int [] V) {

		int cont=0;
		for(int i=1;i<V.length;i++){
			boolean dist=true;
			for(int j=1;j<V.length && dist;j++){
				if(V[i]==V[j] && i != j)
					dist=false;
			}
			if(dist)
				cont++;
		}
		return cont;
	}


	//-----------------------------------------------------------------------------------------------
	/*ENGLISH:

ITALIAN:
	Scrivere un metodo verifica che riceve un vettore L di interi di lunghezza n, con n pari, e restituisce il valore true se
	la media della prima metà degli elementi di L, è maggiore del valore massimo della seconda metà degli elementi di L,
	false altrimenti. Ad esempio, se L= [8, 9, 7, 0, 6, 7] il metodo restituirà true.

	 */

	//SOLUTION
	//Author: Davide Spataro

	public static boolean verify(int [] V, int start, int end) {
		double media =average(V, 0, V.length/2-1); //indices from 0 to half  
		int max= max(V,V.length/2,V.length-1);
		if( media > max)
			return true;

		return false;
	}



	public static double average(int [] V, int start, int end) {
		int sum=0;
		for(int i=start;i<=end;i++){
			sum+=V[i];
		}

		return sum/(end-start);

	}

	public static int max(int [] V, int start, int end) {
		int max=V[start];
		//can start safely from start+1
		for(int i=start+1;i<=end;i++){
			if(V[i] > max)
				max=V[i];
		}

		return max;

	}


	//-----------------------------------------------------------------------------------------------
	/*ENGLISH:
	Write a method that receives as input a vector of integers V that returns the number of element in V that appears at least two.
	Example: V = [1, 2, 3, 2, 2, 3, 5] n = 5 (infact, V[1] appears 3 times, V[2] 2 times, V[3] and V[4] three times volte, V[5] 2 times).
	Esempio: V = [15, 12, 3, 7] n = 0 (all distinct).

ITALIAN:
	Si scriva un metodo replicati che riceve un array di interi V e restituisce il numero di elementi replicati di V, cioè quelli
	che compaiono almeno due volte in V.
	Esempio: V = [1, 2, 3, 2, 2, 3, 5] n = 5 (infatti, V[1] compare 3 volte, V[2] 2 volte, V[3] e V[4] 3 volte, V[5] 2 volte).
	Esempio: V = [15, 12, 3, 7] n = 0.

	 */

	//SOLUTION
	//Author: Davide Spataro
	public static int replicated(int [] V) {
		int cont=0;
		for(int i=1;i<V.length;i++){
			for(int j=1;j<V.length ;j++){
				if(V[i]==V[j] && i != j){
					cont++;
					break;
				}
			}
		}
		return cont;
	}


	//-----------------------------------------------------------------------------------------------
	/*ENGLISH:
	write a method that takes two vector as input V1 and V2 (of integers and equal size) and return a vector V3 (boolean) of same size of V1 and V2
	in which each element is true if V1[i] and V2[i] are both even or both odd. False otherwise.
	Example: V1 = [2, 5, 8, 3, 2] , V2 = [4, 2, 3, 5, 0] then V3 = [true, false, false, true, true].
ITALIAN:
	Si scriva un metodo esercizio che riceve in input due vettori V1 e V2 di interi e restituisce un vettore V3 di booleani
	così formato: il valore nell’i-sima posizione di V3 sarà true se e solo se i valori nella i-sima posizione di V1 e V2 sono
	entrambi pari o entrambi dispari, false altrimenti.
	Esempio: V1 = [2, 5, 8, 3, 2] , V2 = [4, 2, 3, 5, 0] allora V3 = [true, false, false, true, true].
	 */

	//SOLUTION
	//Author: Davide Spataro
	public static boolean[] bothEvenOdd(int [] V1,int [] V2) {
		boolean[] V3 = new boolean [V1.length];
		for(int i=0;i<V1.length;i++){
			if((V1[i]+V2[i]) % 2 ==0)
				V3[i]=true;
			else
				V3[i] = false;
		}
		return V3;
	}

	//-----------------------------------------------------------------------------------------------
	/*
ENGLISH:
	//TO-DO

 ITALIAN:
 	Si scriva un metodo esercizio che riceve in ingresso un vettore v1, e restituisce un vettore v2 della stessa dimensione
	di v1. In particolare, v2[i] conterrà il primo elemento di v1 che si incontra muovendosi dalla posizione i+1 alla posizione
	v1.length-1 ed il cui valore sia maggiore di v1[i]; se non esiste nessun elemento in v1 che soddisfa la condizione, allora
	v2[i] sarà uguale a v1[i]. Si noti che l’ ultimo elemento di v2 sarà sempre uguale all’ultimo elemento di v1.
	 */

	//SOLUTION
	// Author: Davide Spataro
	public static int[] ex6(int [] V1) {
		int V2[] = new int [V1.length];
		for(int i=0;i<V1.length-1;i++){
			int el=V1[i];
			for(int j=1;j<V1.length-1;j++){
				if(el < V1[j]){
					V2[i] = V1[j];
					break;
				}
			}
		}
		return V2;
	}

	//-----------------------------------------------------------------------------------------------
	/*
ENGLISH:
	//TO-DO

 ITALIAN:
 	Si scriva un metodo esercizio che riceve in input due vettori A e B di interi e restituisce un vettore C di booleani così
formato: il valore nell’i-sima posizione di C sarà true se e solo se il valore nell’i-sima posizione di A è multiplo oppure
sottomultiplo del valore contenuto nell’i-esima posizione di B, false altrimenti. 
 	
 	*/

	//SOLUTION
	// Author: Davide Spataro
	//SOLUTION
	//Author: Davide Spataro
	public static boolean[] ex7(int [] V1,int [] V2) {
		boolean[] V3 = new boolean [V1.length];
		for(int i=0;i<V1.length;i++){
			if((V1[i]%V2[i] ==0)  ||  (V2[i] % V1[i] ==0) )
				V3[i]=true;
			else
				V3[i] = false;
		}
		return V3;
	}

	
	//-----------------------------------------------------------------------------------------------
	/*
ENGLISH:
	//TO-DO

 ITALIAN:
	 	Si scriva un metodo componivett che riceve un array di interi V1 e restituisce un array di interi V2 contenente gli
	elementi V1[i], con 0 < i < V1.length, che sono multipli di tutti gli elementi che li precedono nel vettore V1.
	Ad esempio, se V1 = [5, 2, 10, 30, 3,90] allora il risultato sarà V2 = [10,30,90] .
 	*/

	//SOLUTION
	//Author: Davide Spataro
	public static int[] ex9(int [] V1) {
		//conto il numero di elementi
		int cont=0;
		for(int i=1;i<V1.length;i++){
			boolean mult=true;
			for (int j = i; j > 0; j--) {
				if(V1[i] % V1[j] != 0)
					mult=false;
				
			}
			if(mult)
				cont++;
		}
		//alloco il vettore della quantità esatta e lo riempio con i valori richiesti
		int[] V2 = new int[cont];
		for(int i=1;i<V1.length;i++){
			boolean mult=true;
			for (int j = i; j > 0; j--) {
				if(V1[i] % V1[j] != 0)
					mult=false;
				
			}
			if(mult)
				V2[i]=V1[i];
		}
		return V2;
		
	}
	

}//class



