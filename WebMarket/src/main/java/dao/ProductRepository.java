package dao;
import java.util.ArrayList;
import dto.Product;
public class ProductRepository {

		
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	
	public ProductRepository() {
		Product phone = new Product("P1234","iPhone 6s", 8000000);
		phone.setDescription("4.7-inch, 1334X750 Renia HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		phone.setFilename("P1234.png");
		
		Product notebook = new Product("P1235","LG 그램", 15000000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel core processors");
		notebook.setCategory("NoteBook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbish");
		notebook.setFilename("P1235.png");
		
		Product tablet = new Product("P1236","Galaxy Tab S", 9000000);
		tablet.setDescription("212.9*125.6*6mm, Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("old");
		tablet.setFilename("P1236.png");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
		
	}
	
	public ArrayList<Product> getAllProducts(){
			return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		
		for(int i = 0;i<listOfProducts.size();i++) {
			Product product = listOfProducts.get(i);
			if(product !=null && product.getProductId() !=null &&product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	
	public static ProductRepository getInstance() {
		return instance;
	}
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
	
	
}
