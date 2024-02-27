import java.util.Scanner;

public class szovegesertekeles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írd be az érdemjegyet!");
        int szam = scanner.nextInt();

        switch (szam) {
            case 1:
                System.out.println("A jegy: elégtelen");
                break;
            case 2:
                System.out.println("A jegy: elégséges");
                break;
            case 3:
                System.out.println("A jegy: közepes");
                break;
            case 4:
                System.out.println("A jegy: jó");
                break;
            case 5:
                System.out.println("A jegy: jeles");
                break;
            default:
                System.out.println("Nincs ilyen jegy!");
                break;
        }
    }
}