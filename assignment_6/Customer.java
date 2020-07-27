package assignment_6;

public class Customer {
	private String custNo;
	private String custName;
	private String category;
	public Customer(String custNo,String custName,String category)
	{
		this.custNo=custNo;
this.custName=custName;
this.category=category;
	}
void validate(String custNo,String custName, String category) throws InvalidInputException{
	String custNo1=custNo.toUpperCase();
	
	
if(custNo1.charAt(0)=='C' && custName.length()>=4 && (category.equals("PLATINUM") || category.equals("GOLD") || category.equals("SILVER")))
			{
				
			}
			else
			{
				throw new InvalidInputException("invalid inputs");
			}
	}
	
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	


}
