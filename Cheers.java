

public class Cheers {
    public static void main(String[] args) {
	String str = args[0];
        int num = Integer.parseInt(args[1]);
        String upperStr = str.toUpperCase();
        int length = str.length() - 1;
        String an = "AEFHILMNORSX";
        for(int i = 0; i <= length; i++){
            char c = upperStr.charAt(i);
            if (an.indexOf(c) != -1){
                System.out.println("Give me an " + upperStr.charAt(i) + ": " + 
                upperStr.charAt(i) + "!");
            }else{
                System.out.println("Give me a  " + upperStr.charAt(i) + ": " + 
                upperStr.charAt(i) + "!");
            }
        }
        System.out.println("What does that spell?");
        int i = 0;
        while(i < num){
            System.out.println(upperStr + "!!!");
            i++;
        }
    }
}
