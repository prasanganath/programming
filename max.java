import java.util.scanner;
public class max{
	public static void public static void main(String[] args) {
		int m,n,c,d;
		Sacanner in=new scanner(System.in);
		System.out.print("number of matrix rows");
		m=in.nextInt();
		System.out.print("number of matrix column");
		n=in.nextInt();
		int array1 [][]=new Int[m][n];
		int array2 [][]=new Int[m][n];
		int sum [][]=new Int[m][n];
        System.out.println("input 1 elements to matrix");
        for(c=0;c<m;c++){
        	for (d=0;d<n;d++) {
        		
        	}
        }
        array1[c][d]=in.nextInt();
        System.out.println("input 2 elements to matrix ");
        for(c=0;c<m;c++){
        	for (d=0;d<n ;d++ ) {
        		
        	}
        }
        array2[c][d]=in.nextInt();
		for ( c = 0 ; c < m ; c++ ){
         for ( d = 0 ; d < n ; d++ ){
             sum[c][d] = array1[c][d] + array2[c][d]; 
         }
		}
		System.out.println("sum of array");
		for ( c = 0 ; c < m ; c++ ){
         for ( d = 0 ; d < n ; d++ ){
           System.out.println(sum[c][d]);
           System.out.println();
         }  
        } 	
	}
}