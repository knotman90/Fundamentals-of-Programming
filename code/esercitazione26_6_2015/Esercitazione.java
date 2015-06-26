
public class Esercitazione {


	public static int[] componiVett(int[] V){
		int cont=0;
		for (int i = 1; i < V.length; i++) {
			boolean NONmultiplo=true;
			for (int j = 0; j < i; j++) {
				if(V[i]%V[j]==0)
					NONmultiplo=false;

			}

			if(NONmultiplo)
				cont++;
		}


		int inseriti=0;
		int[] r = new int[cont];	
		for (int i = 1; i < V.length; i++) {
			boolean NONmultiplo=true;
			for (int j = 0; j < i; j++) {
				if(V[i]%V[j]==0)
					NONmultiplo=false;

			}

			if(NONmultiplo){
				r[inseriti]=V[i];
				inseriti++;
			}
		}

		return r;

	}

	public static int[] copiaReverse(int[] V){
		int[] copia = new int[V.length];
		for(int i=V.length-1,j=0; i>=0 ;i--,j++)
			copia[j]=V[i];
		return copia;
	}

	public static boolean uguali(int[] V,int[] W){
		for(int i=0;i<V.length;i++)
			if(V[i]!=W[i])
				return false;

		return true;
	}

	public static void stampavettore(int[]V){
		for(int i=0;i<V.length;i++)
			System.out.print(V[i]+" ");

		System.out.println();
	}

	public static void stampavettore(double[]V){
		for(int i=0;i<V.length;i++)
			System.out.print(V[i]+" ");

		System.out.println();
	}

	public static boolean palindromoCopia(int[] V){
		int []Vreverse=copiaReverse(V);
		stampavettore(Vreverse);
		stampavettore(V);
		return uguali(Vreverse,V);

	}


	public static void main(String[] args) {
		int[] v={8,9,7,0,6,7};
		//stampavettore(v);
		//System.out.println("esercizio 3 "+verifica(v));
		int[] v1={8,9,7,7,9,8};
		//System.out.println("esercizio 4 "+palindromoCopia(v));
		System.out.println("esercizio 4 "+palindromoCopia(v1));

		System.out.println("Esercizio 12");
		int[]v2={5,2,11,15,3,90};
		stampavettore(v2);
		stampavettore(componiVett(v2));

		double [][] id = {{2,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
		double [][] m2 = {{1,0,3,1},{3,1,4,0},{0,0,1,2},{0,1,0,2}};

		double [][] m1 = {{1,0},{3,1},{0,0},{0,1}};
		double[][]M = moltiplicaMatrici(id, m2);

		if(M!=null)
			stampaMatrice(M);
		else
			System.out.println("Matrici Incompatibili");
	}

	private static void stampaMatrice(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+ " ");

			}
			System.out.println();

		}

	}

	public static double[] riga(double[][]M, int riga){
		//restituisce la riga i-esima di M
		return M[riga];
	}


	public static double prodottoScalare(double[] V, double[]W){

		double r=0;
		for (int i = 0; i < W.length; i++) 
			r=r+V[i]*W[i];

		return r;
	}

	public static double[] colonna(double[][]M, int colonna){
		double[] col = new double [M.length];
		for (int i = 0; i < col.length; i++) {//per tutte le righe
			col[i]=M[i][colonna];

		}
		return col;
	}

	public static double[][] moltiplicaMatrici(double[][] M, double[][] N) {
		if(M.length!=N[0].length)
			return null;

		double[][] r= new double [M.length][N[0].length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < N[0].length; j++) {
				r[i][j]= prodottoScalare(riga(M,i), colonna(N, j));
			}

		}
		//return r;

		//metodo 2 matri mult
		double[][] r1= new double [M.length][N[0].length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < N[0].length; j++) {
				for (int k 	= 0; k < N.length; k++) {
					r1[i][j]+= M[i][k]*N[k][j];

				}
			}

		}

		return r1;		



	}


	public static boolean verifica(int[] L){
		double media=0;
		for(int i=0;i<L.length/2;i++){
			media+=L[i];
		}
		media/=L.length/2;

		double max=Integer.MIN_VALUE;
		for(int i=L.length/2;i<L.length;i++){
			if(L[i]>max)
				max=L[i];
		}


		return media>max;

	}


}
