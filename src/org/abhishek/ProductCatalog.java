package org.abhishek;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.abhishek.business.ProductServiceImpl;
import org.abhishek.model.Product;

@WebService(name = "TestMartCatalog", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService",
targetNamespace = "http://www.testmart.com")
public class ProductCatalog {
	
	ProductServiceImpl productservice = new ProductServiceImpl();
	
	/*Use this annotation with exclude = true when you don't want your method to be included inside the WSDL 
	 and the tester  */
	@WebMethod(exclude = true)
	public List<String> getproductCategoeries(){
		return productservice.getproductCategories();
	}
	
	public List<String> getProducts(String category){
		return productservice.getProducts(category);
	}
	
	public boolean addProducts(String category, String product){
		return productservice.addProducts(category, product);
	}
	
	public boolean removeProducts(String category, String product){
		return productservice.removeProducts(category, product);
	}
	
	public List<Product> getProductsv2(String category){
		return productservice.getProductsv2(category);
	}
	
	
	}


