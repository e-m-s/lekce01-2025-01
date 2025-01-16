import com.engeto.invoice.Invoice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MainClass {  // PascalCase
    public static void main(String[] args) {
        // Ahoj!
        Invoice invoice1 = new Invoice();
        Invoice invoice2 = new Invoice();
        Invoice invoice3 = new Invoice();

        invoice1.setInvoiceNumber(202500004);
        System.out.println("Číslo faktury: " + invoice1.getInvoiceNumber());
        // proměnná (variable)

        // camelCase


        //customerName       = "Karel Dvořák";   // přiřazení hodnoty do proměnné
        //packageWeight      = 128;
        //double totalWeight = packageWeight + 2;

        // NEJDE! invoice1.invoiceNumber = 202500004;
        System.out.println("Číslo faktury: " + invoice1.invoiceNumber);
//        System.out.println("Jméno zákazníka: "         + customerName);
//        System.out.println("Datum vystavení faktury: " + invoiceDate);
//        System.out.println("Celková částka: "          + totalAmount);
//
//        String name = "Karel" + " " + "Dvořák";
//        System.out.println(name);

    }
}