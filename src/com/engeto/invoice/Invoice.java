package com.engeto.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {
    // Zapouzdření (encapsulation) - skrytí datových členů třídy
    private int invoiceNumber = 202500001;   // datový typ int (celé číslo)
    private String customerName;  // textová proměnná (typ String)
    private LocalDate invoiceDate = LocalDate.now();   // datový typ LocalDate (datum)
    private BigDecimal totalAmount = new BigDecimal("1250.00");   // datový typ BigDecimal (desetinné číslo)
    private double packageWeight = 25.5;   // datový typ double (desetinné číslo)

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }
}
