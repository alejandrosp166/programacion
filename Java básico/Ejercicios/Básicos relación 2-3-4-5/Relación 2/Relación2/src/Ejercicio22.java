public class Ejercicio22 {

	public static void main(String[] args) {
		int cont=0;
		for(int i =2;i<=100;i++) {	
			for(int j = 2;j<=i;j++) {	
				if(i%j==0) {
					cont++;
				}
			}
			if(cont==1) {
				System.out.println(i);
			}
			cont=0;
		}
	}
}