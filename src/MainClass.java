import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // proměnná (variable)
        int invoiceNumber = 202500001;   // datový typ int (celé číslo)
        String customerName;  // textová proměnná (typ String)
        LocalDate invoiceDate = LocalDate.now();   // datový typ LocalDate (datum)
        BigDecimal totalAmount = new BigDecimal("1250.00");   // datový typ BigDecimal (desetinné číslo)
        double packageWeight = 25.5;   // datový typ double (desetinné číslo)

        customerName = "Karel Dvořák";   // přiřazení hodnoty do proměnné
        packageWeight = 128;
        double totalWeight = packageWeight + 2;

        System.out.println("Číslo faktury: " + invoiceNumber);
        System.out.println("Jméno zákazníka: " + customerName);
        System.out.println("Datum vystavení faktury: " + invoiceDate);
        System.out.println("Celková částka: " + totalAmount);

        String name = "Karel" + " " + "Dvořák";
        System.out.println(name);

    }
}