package bookmyshow_java.models;

public class Payment extends BaseModel {
    private Long amount;
    private PaymentProvider paymentProvider;
    private PaymentMode paymentMode;
    private Long referenceNumber;

    public Payment(int id, Long amount, PaymentProvider paymentProvider, PaymentMode paymentMode,
            Long referenceNumber) {
        super(id);
        this.amount = amount;
        this.paymentProvider = paymentProvider;
        this.paymentMode = paymentMode;
        this.referenceNumber = referenceNumber;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public PaymentProvider getPaymentProvider() {
        return paymentProvider;
    }

    public void setPaymentProvider(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Long getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Long referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Payment(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }
    
}
