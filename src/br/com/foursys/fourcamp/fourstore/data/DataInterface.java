package br.com.foursys.fourcamp.fourstore.data;

public interface DataInterface {
	
	public Boolean create(Object obj);
	public String read();
	public Boolean update(Object obj);
	public Boolean delete(String respost);

}
