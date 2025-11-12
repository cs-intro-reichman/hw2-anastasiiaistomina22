public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        /* Total minutes = (10 hours * 60 minutes) + 30 minutes + 4055 minutes = 4685 minutes;
Total hours = 4685 / 60 = 78;
New hours = 78 % 24 = 6; // The remainder operator % is also known as modulo
New minutes = 4685 – (78 * 60) = 5;
Therefore the answer is 06:05.*/
        int totalMin = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMin / 60;
        int newHours = totalHours % 24;
        int newMin = totalMin - (totalHours * 60);

    }
}
