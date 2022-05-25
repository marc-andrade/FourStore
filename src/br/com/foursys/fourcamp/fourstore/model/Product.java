package br.com.foursys.fourcamp.fourstore.model;

public class Product {
	
	private int id = 0;
	private String sku;
	private Integer qtt;
	private Double originalPrice;
	private Double salePrice;
	private String type; 
	private String size;
	private String color;
	private String category;
	private String departament;
	private String description;
	
	public Product(String sku, Integer qtt) {
		this.sku = sku;
		this.qtt = qtt;
	}

	public Product(String sku, Integer qtt, Double originalPrice, Double salePrice, String type, String size,
			String color, String category, String departament, String description) {
		
		this.sku = sku;
		this.qtt = qtt;
		this.originalPrice = originalPrice;
		this.salePrice = salePrice;
		this.type = type;
		this.size = size;
		this.color = color;
		this.category = category;
		this.departament = departament;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getQtt() {
		return qtt;
	}

	public void setQtt(Integer qtt) {
		this.qtt = qtt;
	}

	public Double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSku() {
		return sku;
	}

	@Override
	public String toString() {
		return  "SKU:" + sku 
				+ "\nQuantidade:" + qtt 
				+ "\nPreço original: " + originalPrice
				+ "\nSalePrice: " + salePrice 
				+ "\nTipo: " + type 
				+ "\nTamanho: " + size 
				+ "\nCor: " + color 
				+ "\nCategoria: " + category 
				+ "\nDepartamento: " + departament 
				+ "\nDescrição: " + description;
	}
	
	
}
