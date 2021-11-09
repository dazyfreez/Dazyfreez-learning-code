import java.util.Random;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        System.out.println("Wie viel Spieler sind sie es sind maximal 6 zugelassen");
        Scanner scanner = new Scanner (System.in);
        int i = scanner.nextInt();
       
        switch (i) {
            case 1:
                System.out.println("Das ist sehr Schade das Spiel macht mehr Spasß in Gesellschaft");
                System.out.println("Player 1 bitte geben sie ihren Namen ein");
                scanner.nextLine();
                String s = scanner.nextLine();
                System.out.println("Danke für den logIn " + s);
                System.out.println("Es tut uns leid Sie sind gestorben" + s);
                break;
            case 2:
                System.out.println("Sind sie sich sicher dass sie nur zu Zweit spielen wollen");  
                System.out.println("Player 1 bitte geben sie den Namen ein");
                scanner.nextLine();
                String m = scanner.nextLine();
                System.out.println("Danke dass sie sich eingeloogt haben " + m);
                System.out.println("Nun meldet sich bitte der zweite Spieler an");
                String c = scanner.nextLine();
                System.out.println("Danke dass sie sich angemeldet haben " + c);
                System.out.println("Genießen sie noch das Spiel so lange sie noch können");
                String[] arr={"1", "2"};
                Random r=new Random();        
                int randomNumber=r.nextInt(arr.length);
                System.out.println(arr[randomNumber]);
                String[] cars = {c,m};
                System.out.println(cars[randomNumber]);
                break;
            case 3: 
                System.out.println("Jetzt sind es schon 3 Leute dass ist ja schonmal ein Anfang");   
                System.out.println("Player 1 bitte geben sie den Namen ein");
                scanner.nextLine();
                String n = scanner.nextLine();
                System.out.println("Danke dass sie sich eingeloogt haben " + n);
                System.out.println("Nun meldet sich bitte der zweite Spieler an");
                String b = scanner.nextLine();
                System.out.println("Danke dass sie sich angemeldet haben " + b);
                System.out.println("Nun meldet sich bitte der dritte Spieler an");
                String v = scanner.nextLine();
                System.out.println("Danke dass sie sich angemeldet haben " + v);
                System.out.println("Genießen sie noch das Spiel so lange sie noch können");
                String[] arr5={"1", "2", "3"};
                Random r5=new Random();        
                int randomNumber5=r5.nextInt(arr5.length);
                System.out.println(arr5[randomNumber5]);
                String[] cars5 = {n,b,v};
                System.out.println(cars5[randomNumber5]);
                
                break;
            case 4:
                System.out.println("Das wird ja ein richtig cooles Game");        
                System.out.println("Player 1 bitte geben sie den Namen ein");
                scanner.nextLine();
                String x = scanner.nextLine();
                System.out.println("Danke dass sie sich eingeloogt haben " + x);
                System.out.println("Nun meldet sich bitte der zweite Spieler an");
                String y = scanner.nextLine();
                System.out.println("Danke dass sie sich angemeldet haben " + y);
                System.out.println("Nun meldet sich bitte der dritte Spieler an");
                String l = scanner.nextLine();
                System.out.println("Danke dass sie sich angemeldet haben " + l);
                System.out.println("Nun meldet sich bitte der vierte Spieler an");
                String k = scanner.nextLine();
                System.out.println("Danke dass sie sich angemeldet haben " + k);
                System.out.println("Genießen sie noch das Spiel so lange sie noch können");
                String[] arr2={"1", "2", "3", "4"};
                Random r1=new Random();        
                int randomNumber2=r1.nextInt(arr2.length);
                System.out.println(arr2[randomNumber2]);
                String[] cars2 = {x,y,l,k};
                System.out.println(cars2[randomNumber2]);
                break;
            case 5:
                System.out.println("Ihr braucht nur noch einen Mitspieler dann hättet ihr ein volles Spiel");
                System.out.println("Das wird ja ein richtig cooles Game");        
                System.out.println("Player 1 bitte geben sie den Namen ein");
                scanner.nextLine();
                String j = scanner.nextLine();
                System.out.println("Danke dass sie sich eingeloogt haben " + j);
                System.out.println("Nun meldet sich bitte der zweite Spieler an");
                String h = scanner.nextLine();
                System.out.println("Danke dass sie sich angemeldet haben " + h);
                System.out.println("Nun meldet sich bitte der dritte Spieler an");
                String g = scanner.nextLine();
                System.out.println("Danke dass sie sich angemeldet haben " + g);
                System.out.println("Nun meldet sich bitte der vierte Spieler an");
                String f = scanner.nextLine();
                System.out.println("Danke dass sie sich angemeldet haben " + f);
                System.out.println("Nun meldet sich bitte der fünfte Spieler an");
                String d = scanner.nextLine();
                System.out.println("Danke dass sie sie sich angemeldet haben " + d);
                System.out.println("Genießen sie noch das Spiel so lange sie noch können");
                String[] arr3={"1", "2", "3", "4","5",};
                Random r3=new Random();        
                int randomNumber3=r3.nextInt(arr3.length);
                System.out.println(arr3[randomNumber3]);
                String[] cars3 = {j,h,g,f,d};
                System.out.println(cars3[randomNumber3]);
                break;
            case 6:
                System.out.println("Das ist Vorbildlich so gehört sich das endlich ein Volles Spiel");
                System.out.println("Ihr braucht nur noch einen Mitspieler dann hättet ihr ein volles Spiel");
                System.out.println("Das wird ja ein richtig cooles Game");        
                System.out.println("Player 1 bitte geben sie den Namen ein");
                scanner.nextLine();
                String a = scanner.nextLine();
                System.out.println("Danke dass sie sich eingeloogt haben " + a );
                System.out.println("Nun meldet sich bitte der zweite Spieler an");
                String p = scanner.nextLine();
                System.out.println("Danke dass sie sich angemeldet haben " + p);
                System.out.println("Nun meldet sich bitte der dritte Spieler an");
                String o = scanner.nextLine();
                System.out.println("Danke dass sie sich angemeldet haben " + o);
                System.out.println("Nun meldet sich bitte der vierte Spieler an");
                String u = scanner.nextLine();
                System.out.println("Danke dass sie sich angemeldet haben " + u);
                System.out.println("Nun meldet sich bitte der fünfte Spieler an");
                String z = scanner.nextLine();
                System.out.println("Danke dass sie sie sich angemeldet haben " + z);
                System.out.println("Nun meldet sich bitte der sechste Spieler an");
                String t = scanner.nextLine();
                System.out.println("Danke dass sie sich angemeldet haben " + t);
                System.out.println("Genießen sie noch das Spiel so lange sie noch können");
                String[] arr4={"1", "2", "3", "4","5","6"};
                Random r4=new Random();        
                int randomNumber4=r4.nextInt(arr4.length);
                System.out.println(arr4[randomNumber4]);
                String[] cars4 = {a,p,o,u,z,t};
                System.out.println(cars4[randomNumber4]);
                break;
        }
        scanner.close();
    }
}
