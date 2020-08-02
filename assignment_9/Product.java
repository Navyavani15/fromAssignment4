package assignment_9;

public class Product {
private String productCode;
private String productName;
private String productPrice;
private String productCat;
public Product(String pCode, String pName, String pPrice, String pCat) {
	super();
	this.productCode = pCode;
	this.productName = pName;
	this.productPrice = pPrice;
	this.productCat = pCat;
}
public String getProductCode() {
	return productCode;
}
public void setProductCode(String productCode) {
	this.productCode = productCode;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductPrice() {
	return productPrice;
}
public void setProductPrice(String productPrice) {
	this.productPrice = productPrice;
}
public String getProductCat() {
	return productCat;
}
public void setProductCat(String productCat) {
	this.productCat = productCat;
}

}

