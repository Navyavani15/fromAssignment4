package assignment4;


public class TestCustomer {
	public static void main(String args[])
			{
		Customer customer = new Customer();
		customer.setCustomerName("John");
		Address address = new Address("Ist Main HSR Layout"," Bangalore");
		System.out.println(customer.getCustomerName());
		System.out.println(address.getAddressDetails());
		
		Customer customer1 = new Customer("Johnson","Ist Main HSR Layout"," Bangalore");
		System.out.println(customer1.getCustomerDetails());
		
			}
	
	

}
