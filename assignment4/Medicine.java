package assignment4;

public abstract class Medicine {
	double price;
	String expireDate;
	abstract void displayLabel();
	public void setPrice(double price) {
		this.price = price;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	void getDetails() {
		System.out.println("Price : "+ this.price + "\nExpiry date : " + this.expireDate);
	}
	
	
	
	}

