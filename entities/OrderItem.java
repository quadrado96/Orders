package entities;

public class OrderItem {
	
	private String name;
	private Integer quantity;
	private Double price;
	
	private Product product;

	public OrderItem() {
	}

	public OrderItem(String name, Integer quantity, Double price, Product product) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return quantity * price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name + ", " + price + "Quantity: " + quantity + ", Subtotal: " + subTotal();
	}
}
