package org.abhishek.business;

import java.util.ArrayList;
import java.util.List;

import org.abhishek.model.Product;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl(){
		bookList.add("Complete Reference");
		bookList.add("Head First");
		bookList.add("Effective Java");
		
		musicList.add("Linkin Park");
		musicList.add("Adele");
		musicList.add("AR Rehman");
		
		movieList.add("Jurassic Park");
		movieList.add("Mission Impossible");
		movieList.add("Terminator");
	}
	
	
public List<String> getproductCategories(){
	List<String> categories = new ArrayList<>();
	categories.add("Books");
	categories.add("Music");
	categories.add("Movies");
	return categories;
}
	public List<String> getProducts (String category){
		switch(category.toLowerCase()){
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}
	
	public boolean addProducts (String category, String products){
		switch(category.toLowerCase()){
		case "books":
			bookList.add(products);
			break;
		case "music":
			musicList.add(products);
			break;
		case "movies":
			movieList.add(products);
			break;
			default:
				return false;
		}
		return true;	}
	
	public boolean removeProducts (String category, String products){
		switch(category.toLowerCase()){
		case "books":
			bookList.remove(products);
			break;
		case "music":
			musicList.remove(products);
			break;
		case "movies":
			movieList.remove(products);
			break;
			default:
				return false;
		}
		return true;
	}


	public List<Product> getProductsv2(String category) {
		List<org.abhishek.model.Product> productList = new ArrayList<>();
		productList.add(new Product("Java Super Book", "Kathy Siera", 129.99));
		productList.add(new Product("Another Book", "John Lock", 29.99));
		productList.add(new Product("Lost in the Woods", "Marvels", 999.99));
		return productList;
	}
	
	
}

