package assignment4;

public class Customer {
	private String customerName;
	Address resAddress=new Address();
	
	public Customer(String customerName,String add)
	{
		super();
		this.customerName=customerName;
		resAddress.setAddressLine(add);
		
	}
	public Customer(String customerName, String addressLine, String city) {
		super();
		this.customerName = customerName;
		resAddress.setAddressLine(addressLine);
		resAddress.setCity(city);
	}

public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Customer() {
	}
	
	public String getCustomerDetails1() {
		return ("Customer : "+ getCustomerName() +"\n" + "Residential Address : "+ resAddress.getAddressDetails());
	}

String getCustomerDetails()
{
	String cust=" customer : "+customerName+"\nResidential Address : "+resAddress.getAddressDetails();
	return cust;
	
}
	
}
