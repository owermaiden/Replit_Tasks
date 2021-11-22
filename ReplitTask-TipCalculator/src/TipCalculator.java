import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        double tipPerPerson, totalTip, total, totalPerPerson;
        double checkAmount = 476.0;
        int people;
        String serviceQuality, numberOfPeople;
        boolean isSplit;

        HashMap<String, Double> quality = new HashMap<>();
        quality.put("poor", 1.05);
        quality.put("fair",1.10);
        quality.put("good",1.15);
        quality.put("great", 1.20);
        quality.put("excellent",1.25);

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Split:");
        isSplit = scan.next().equalsIgnoreCase("Yes");
        System.out.println("Number of people:");
        people = scan.nextInt();
        System.out.println("Check amount:");
        checkAmount = scan.nextDouble();
        System.out.println("Service Quality: poor? fair? good? great? excellent? ");
        serviceQuality = scan.next();
        scan.nextLine();

        total = checkAmount * quality.get(serviceQuality);
        totalPerPerson = total / people;
        totalTip = total - checkAmount;
        tipPerPerson = totalTip / people;


        System.out.println("Number of people entered: "+"&".repeat(people));
        System.out.println("Total to pay: "+total);
        System.out.println("Total tip: "+totalTip);
        System.out.println("Total per person: "+totalPerPerson);
        System.out.println("Tip per person: "+tipPerPerson);

    }

}
