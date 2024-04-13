package com.practice.Assignments.lld2.day138prototypeandregistry.invoice;

public class Invoice implements ClonableObject<Invoice> {
    private Long invoiceId;
    private String customerName;
    private Double amount;
    private String paymentMethod;
    private InvoiceType type;

    public Invoice(Long invoiceId, String customerName, Double amount, String paymentMethod, InvoiceType type) {
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.type = type;
    }
    private Invoice(Invoice org){
        this.invoiceId = org.invoiceId;
        this.customerName = org.customerName;
        this.amount = org.amount;
        this.paymentMethod = org.paymentMethod;
        this.type = org.type;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public InvoiceType getType() {
        return type;
    }

    @Override
    public Invoice cloneObject() {
        return new Invoice(this);
    }
}