import java.util.ArrayList;

public class NumeroPrimo {
    public static void main(String[] args) {
		int primo = Integer.valueOf( args[0] );
		boolean isPrimo = true;
		ArrayList<Integer> divisor = new ArrayList<Integer>(); 
		for (int i = 2; i <= primo; i++) {
			if ( ( (primo % i) == 0) && (i != primo) ) {
				isPrimo = false;
				divisor.add( i );
			}
		}
		if (isPrimo) {
			System.out.println( "é Primo" );
		} else {
			System.out.print( "Não é Primo e seus divisores são --> ");
			for (Integer i : divisor) {
				System.out.print( i + ", ");
			}
		}

	}
}
   



