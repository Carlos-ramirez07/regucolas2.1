package geometria;

public class Nodo<T> {

	private T info;
	private Nodo siguiente;
	
	public Nodo(T info) {
		this.info=info;
		siguiente=null;
	}
	
	public Nodo(T info, Nodo<T> siguiente) {
		this.info = info;this.siguiente = siguiente;
	}
	
	public T getInfo() {
		return (T) info.getClass();
	}
	
	public void setInfo(T info) {
		 
		this.info = info;
		
	}
	
	public Nodo getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
}
