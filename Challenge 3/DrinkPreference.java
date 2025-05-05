public class DrinkPreference {
    public static void main(String[] args) {
        boolean likesLatte = true;
        boolean likesMatcha = false;

        if (likesLatte && likesMatcha) {
            System.out.println("You love both latte and matcha!");
        } else if (likesLatte && !likesMatcha) {
            System.out.println("You prefer coffee latte over matcha.");
        } else if (!likesLatte && likesMatcha) {
            System.out.println("You prefer matcha over coffee latte.");
        } else {
            System.out.println("You don't like either latte or matcha.");
        }
    }
}
