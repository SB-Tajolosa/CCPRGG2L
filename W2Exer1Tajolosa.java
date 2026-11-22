public class Main {
	public static void main(String[] args) {

		int[][] Tajolosa_matrix = {
		    {1,2,3},
		    {4,5,6},
		    {7,8,9}};

		int[] Tajolosa_rSum = new int[Tajolosa_matrix.length];
		int[] Tajolosa_cSum = new int[Tajolosa_matrix.length];
        int Tajolosa_DiagSum = 0;	

		System.out.println("Original Matrix:");

		for(int Tajolosa_r=0;Tajolosa_r<Tajolosa_matrix.length;Tajolosa_r++) {
			int Tajolosa_sum = 0;
			for(int Tajolosa_c=0;Tajolosa_c<Tajolosa_matrix[Tajolosa_r].length;Tajolosa_c++) {
				System.out.print(Tajolosa_matrix[Tajolosa_r][Tajolosa_c] + " ");
				Tajolosa_sum += Tajolosa_matrix[Tajolosa_r][Tajolosa_c];	
			}
			System.out.println();
			Tajolosa_rSum[Tajolosa_r] = Tajolosa_sum;
		}
		
		for(int Tajolosa_c = 0; Tajolosa_c<Tajolosa_matrix[0].length; Tajolosa_c++){
		    int Tajolosa_sum =0;
		 for(int Tajolosa_r=0;Tajolosa_r<Tajolosa_matrix.length;Tajolosa_r++){
		        Tajolosa_sum += Tajolosa_matrix[Tajolosa_r][Tajolosa_c];
		        }
		        Tajolosa_cSum[Tajolosa_c] = Tajolosa_sum;
		    }

		System.out.print("\nRow sums:");
		for(int Tajolosa_i=0; Tajolosa_i<Tajolosa_rSum.length; Tajolosa_i++) {
			System.out.print(Tajolosa_rSum[Tajolosa_i] + " ");
		}
		
		System.out.print("\nColumn sums:");
		for(int Tajolosa_i=0; Tajolosa_i<Tajolosa_matrix.length; Tajolosa_i++){
		    System.out.print(Tajolosa_cSum[Tajolosa_i] + " ");
		    }

        System.out.print("\nMain Diagonal Sum:");
        for(int Tajolosa_i=0;Tajolosa_i<Tajolosa_matrix.length;Tajolosa_i++){
            Tajolosa_DiagSum += Tajolosa_matrix[Tajolosa_i][Tajolosa_i];
            }
            System.out.print(Tajolosa_DiagSum + "\n");
            
            System.out.print("\nTranspose:\n");
            for(int Tajolosa_r=0;Tajolosa_r<Tajolosa_matrix[0].length;Tajolosa_r++){
                for(int Tajolosa_c=0;Tajolosa_c<Tajolosa_matrix.length;Tajolosa_c++){
                   System.out.print(Tajolosa_matrix[Tajolosa_c][Tajolosa_r] + " ");
                     }
                     System.out.println();     
                }
	}
}