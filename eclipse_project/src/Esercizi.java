
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






}



