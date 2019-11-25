// Assignment 9
// Design a class for a generic product:
// The product data should include a product code, description, price and product count. 
// In addition to the getter and setter methods, the class should implement toString and also a formatted output of the price
// By Hiro Egashira on 11/25/2019

package generic;

import java.text.NumberFormat;

public class Product {	
	private String sku;
	private String prodName;
	private String prodDesc;
	private double sellPrice;
	private int invCount;
	
	
	
	// Get Product Information
	
	public Product(String sku, String prodName, String prodDesc, double sellPrice, int invCount) {
		this.sku = sku;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.sellPrice = sellPrice;
		this.invCount = invCount;
	}
	
	
	// toString override
	
	@Override
	public String toString() {
		return 	"SKU:\t\t\t" + sku + 
				"\nProduct Name:\t\t" + prodName +  
				"\nProduct Description:\t" + prodDesc +
				"\nSell Price:\t\t" + getPriceFormatted(sellPrice) + 
				"\nOn Hand:\t\t" + invCount + 
				"\n\n";	
	}
	
	// Formatted output of price
	
	public String getPriceFormatted(double sellPrice) {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(sellPrice);
        return formattedPrice;
    }
	
	
	// Getters & Setters
	
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public double getSellPrice() {
		return this.sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public double getInvCount() {
		return invCount;
	}

	public void setInvCount(int invCount) {
		this.invCount = invCount;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
}
