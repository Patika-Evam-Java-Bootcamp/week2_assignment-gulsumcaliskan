import java.util.Date;

public interface Client {
	
	Response payTheBill(int billType, String memberCode, double amount, double balance) throws CustomException;
    Response queryBill(int billType, String memberCode, String phone);
    Response queryBill(int billType, String memberCode, String phone, double amount);
    Response cancelPayment(int billType, String memberCode, double amount, Date processDate); 
}
