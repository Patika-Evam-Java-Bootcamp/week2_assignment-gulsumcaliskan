import java.util.Date;

public class Payment {

	// Variables and constructor method is created.
    private int id;
    private boolean status;
    private Date paymentDate;
    private int memberAccId;
    private double amount;

    public Payment() {
    }

    // Constructor is created
    public Payment(int id, boolean status, Date paymentDate, int memberAccId, double amount) {
        this.id = id;
        this.status = status;
        this.paymentDate = paymentDate;
        this.memberAccId = memberAccId;
        this.amount = amount;
    }

   // Getter and Setter's are created
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public boolean isStatus() {
        return status;
    }

   
    public void setStatus(boolean status) {
        this.status = status;
    }

    
    public Date getPaymentDate() {
        return paymentDate;
    }

    
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

   
    public int getMemberAccId() {
        return memberAccId;
    }

   
    public void setMemberAccountId(int memberAccId) {
        this.memberAccId = memberAccId;
    }

    
    public double getAmount() {
        return amount;
    }

    
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
