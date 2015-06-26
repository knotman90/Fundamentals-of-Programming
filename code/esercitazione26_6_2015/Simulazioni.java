import java.util.Random;


public class Simulazioni {




	public static int numPartecipanti(int[][]M, int competizione) {
		int cont=0;
		for(int i=0;i<M.length;i++)
			if(M[i][competizione]!=-1)
				cont++;

		return cont;
	}


	public static int[][] prendiColonneBuone(int[][]M, int[]colonneBuone) {
		int [][] n = new int[M.length][colonneBuone.length];

		for(int i=0;i<M.length;i++)
			for (int j = 0; j < colonneBuone.length; j++) {
				n[i][j] = M[i][colonneBuone[j]];
			}

		return n;
	}

	public static int maxColonne(int [][] M){
		int max = numPartecipanti(M, 0);
		int indice=0;
		for (int i = 0; i < M[0].length; i++) {
			int part = numPartecipanti(M, i);
			if(part>max){
				max=part;
				indice=i;
			}
		}
		//aggiusta qui!!!!
		return colonneBuone[indice];
	}

	public static int max(int [] M){
		int max = M[0];
		for (int i = 0; i < M.length; i++) {
			if(M[i]>max)
				max=M[i];
		}
		return max;
	}


	public static int  bestScore(int[][]M, int i, int t, int[]T) {
		return	max(
				prendiSoloColonneBuone(
						gareAtleta(M, i),indiciGareBuone(T,t)
						)
				);


	}
	public static int[] gareAtleta(int [][]M,int atleta) {
		return M[atleta];
	}


	public static int[] prendiSoloColonneBuone(int[] input,int[]colonneDaConsiderare) {
		int[] colonneBuone = new int[colonneDaConsiderare.length];

		for (int i = 0; i < colonneDaConsiderare.length; i++) {
			colonneBuone[i]=input[colonneDaConsiderare[i]];

		}

		return colonneBuone;

	}
	public static int[] indiciGareBuone (int[] T,int t) {
		int[] tt = new int[T.length];
		int cont=0;
		for (int i = 0; i < tt.length; i++) {
			if(T[i]==t)
				tt[cont++]=i;

		}
		return ridimensiona(tt, cont);

	}

	public static int[] ridimensiona(int[] V, int cont) {
		//ridimensioniamo
		double rr [] = new double[cont];
		for (int i = 0; i < cont; i++) {
			rr[i] = V[i]; 

		}
		return rr;

	}


	public static double[] maxMIn3D(double[] V , double []W){
		int cont=0;
		//max numero di min locali 
		double r [] = new double[V.length/2];
		for(int i=0;i<V.length;i++){
			if(minimoLocale(W,i)){
				r[cont++]=V[i];
			}
		}

		//ridimensioniamo
		double rr [] = new double[cont];
		for (int i = 0; i < cont; i++) {
			rr[i] = r[i]; 

		}

		return rr;

	}

	public static void stampavettore(double[]V){
		for(int i=0;i<V.length;i++)
			System.out.print(V[i]+" ");

		System.out.println();
	}


	public static boolean minimoLocale(double[] w, int i) {
		boolean minSinistra=true;
		boolean minDestra=true;
		if(i>0)
			minSinistra=w[i]<w[i-1];

		if(i<w.length-1)
			minDestra=w[i]<w[i+1];

		return ( minDestra &&  minSinistra);

	}


	public static Random randomGenerator = new Random(System.currentTimeMillis());
	public static double[] creaVettoreRandom(int dim) {
		double [] r = new double[dim];
		for(int i=0;i<dim;i++)
			r[i]= randomGenerator.nextDouble();

		return r;
	}
	public static void main(String[] args) {
		//		double [] V ={1.4,2.2,5.5,6.1,7.3,8.0,9.1};
		//		double [] W ={1.5,3.6,4.4,3.9,1.0,2.2,0.7};
		double [] V =creaVettoreRandom(20);
		double [] W =creaVettoreRandom(20);

		System.out.println("V");
		stampavettore(V);
		System.out.println("W");
		stampavettore(W);
		double [] res = maxMIn3D(V, W);


		stampavettore(res);
	}

}
