
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args [0]);
		double pi = Math.PI;
		int i = 0;
		double n = 1;
		int minus = 1;
		double sum = 0;
		while(i < num){
			double term = 1 / n;
			sum = sum + (term * minus);
			minus *= (-1);
			n += 2;
			i++;
			
		}
		System.out.println("pi according to Java: " + pi);
		System.out.println("pi, approximated:     " + sum * 4);
	}
}
