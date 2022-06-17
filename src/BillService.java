import java.util.Date;

public class BillService implements Client{
	
	
	public boolean status = true;
	
	// payments
	
	@Override
	public Response payTheBill(int billType, String memberCode, double amount, double balance) throws CustomException{
		
		// check the amount 
		if(balance < amount) {
			throw new CustomException("Insufficient Balance Exception"); // it will show the error messages
		} else {
			//member.setBalance(member.getBalance() - member.getAmount());
		    return new Response("0", "2022-05-04");  // otherwise the result shown as "0".
		    
		}
	}
	
	
	//queryBill
	
	@Override
	
	public Response queryBill(int billType, String memberCode, String phone) {
		if(status){
		    return new Response("0", "2022-05-04"); // until the status true the result will be "0".
		} else {
		    return new Response("1", "2022-05-04");
		}
	}
	
	

	@Override
	
	public Response queryBill(int billType, String memberCode, String phone, double amount) {
		if(status){
		    return new Response("0", "2022-05-04");
		} else {
		    return new Response("1", "2022-05-04");
		}
	}
	
	
	//cancel payment
	@Override
	public Response cancelPayment(int billType, String memberCode, double amount, Date processDate) {
		return new Response("0", "2022-05-04");
	}

}
