package br.com.foursys.fourcamp.fourstore.data;

import br.com.foursys.fourcamp.fourstore.model.Product;

public interface ProductDataInterface {
	
	public String create(Product product);
	public String read();
	public void update(Product product);
	public Boolean delete();

}
