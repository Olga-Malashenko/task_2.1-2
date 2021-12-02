public class Main {
    public static void main(String[] args) {

        int amount = 1200;
        int refill = 1500;
        int amountNew;
        int bonus = 0;

        if (refill > 1000) {
            bonus = refill / 100;
        }

        amountNew = amount + refill + bonus;

        System.out.println(amountNew);
    }
}
