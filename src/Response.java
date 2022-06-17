//import java.util.Date;

public class Response {
	
	// Variables and constructor method is created.
	private String code; 
	private String date; 
	
	public Response(String code, String date) {
		this.code = code;
		this.date = date;
//		this.date = LocalDate.now().toString();
	}
	
	public Response() {		
	}
	
	// Getter and Setter's are created.
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}

}
