package org.abhishek.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement(name = "Product")
@XmlType(propOrder = {"price" , "sku", "name"}) /*So below you can see in class that declaration is name,
 												sku and price. But using @XmlType(propOrder, I can declare it 
 												my own way	*/
public class Product {
		
	private String name;
	private String sku;
	private double price;

	/*Note: Whenever we annotate our class with JAXB annotation then we always define a no arg constructor.
	 * the reason why we need a no arg constructor is because we need a way to initialize JAXB a new instance 
	 * of the class and if we have one constructor with arguments then JAXB doesn't know what arguments to pass.
	 * And JAXB will not be able to create a new instance of the product.  */
	
	public Product(){
		
	}
	
	
	public Product(String name, String sku, double price){
	this.name = name;
	this.sku = sku;
	this.price = price;
	}
	@XmlElement(name = "ProductName") /*Here we have given the "name" according to our choice. So now instead of 
										name now we have ProductName*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}