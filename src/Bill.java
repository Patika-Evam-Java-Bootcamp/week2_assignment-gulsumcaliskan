import java.util.Date;

public class Bill {
	
	// the variables is created
	private int id; 
	private double amount;
	private int billType; 
	private Date processDate;
    private String memberCode;
	
    
    // A constructor method is created as a empty 
	public Bill(){
	}
	
	// Constructor method is created
	public Bill(int id, double amount, int billType, Date processDate, String memberCode) {
		this.id = id;
		this.amount = amount;
		this.billType = billType;
		this.processDate = processDate;
		this.memberCode = memberCode;
		
	}
	
	//getter and setter methods are created
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getBillType() {
		return billType;
	}
	
	public void setBillType(int billType) {
		this.billType = billType;
	}
	
	public Date getProcessDate() {
		return processDate;
	}
	
	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}
	
	public String getMemberCode() {
		return memberCode;
	}
	
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	
	
	
	
}
