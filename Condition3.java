import java.util.*;

public class Condition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();
        switch (Button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
            System.out.println("Namaste");
                break;
            case 3:
            System.out.println("fuck");
              break;
            default:
            System.out.println("invalid button");
                break;
        }
    }
}
