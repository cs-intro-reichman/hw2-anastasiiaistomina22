public class Collatz {
	public static void main(String args[]) {
	    int j = Integer.parseInt(args[0]);
		String type = args[1];
		boolean t = (type.equals("v")) == true;
        if(t){                                           //mode 1
			int n = 1;
		    while(n <= j){                               //from 1 to N
			    int seed = n;
		        int i = 1;
		        if(seed == 1){                           //if first number = 1
			        System.out.print(seed + " ");
			        seed = (seed * 3) + 1;               //hailstone sequence
			        i++;
			        System.out.print(seed + " ");
                    while(seed != 1){
			            if(seed % 2 == 0){
					        seed /= 2;
				        }else{seed = (seed * 3) + 1;}
			        i++;
			        System.out.print(seed + " ");
                    }
                    System.out.print("(" + i + ")");
				    System.out.println();
			
		        }else{                                    //if numer not = 1
				    System.out.print(seed + " ");
			        while(seed != 1){
			            if(seed % 2 == 0){
					        seed /= 2;
				        }else{seed = (seed * 3) + 1;}
			        i++;
			        System.out.print(seed + " ");
                    }
                    System.out.print("(" + i + ")");
				    System.out.println();
				
		        }
			    n++;
		    }
	        System.out.println("Every one of the first " + j + " hailstone sequences reached 1.");
		}else{System.out.println("Every one of the first " + j + " hailstone sequences reached 1.");}//mode 2
    }
}

