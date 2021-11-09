import java.util.Scanner;
import java.util.Random;
public class essensplaner {
    public static void main(String[] args) {
        System.out.println("Wollen Sie einen gesamten Wochenplan oder ein einzelnes Gericht geben sie Eine Woch für die erste Option ein und Ein Tag für die Zweite.");
        Scanner scanner = new Scanner(System.in);
        String Bestellung = scanner.nextLine();
        scanner.close();
                String[] essensliste = {"nudeln", "Pizza", "Burger", "Salat", "Lasagne", "Tacos", "Nachos", "Lachs"}; 
                Random random = new Random();
                int x1 = random. nextInt(8);
                int x2 = random. nextInt(8);
                int x3 = random. nextInt(8);
                int x4 = random. nextInt(8);
                int x5 = random. nextInt(8);
                int x6 = random. nextInt(8);
                int x7 = random. nextInt(8);
        switch (Bestellung) {
            case "Eine Woche":
                System.out.println("Montag: " + essensliste [x1] +" Dienstag: " + essensliste [x2]+ " Mittwoch: " + essensliste [x3]+ " Donnerstag: " + essensliste [x4] + " Freitgag: " + essensliste [x5] +
                " Samstag: " + essensliste [x6] + " Sonntag: " + essensliste [x7]);
                
            case "Ein Tag":
            System.out.println(essensliste [x1]);


    }
}
}
