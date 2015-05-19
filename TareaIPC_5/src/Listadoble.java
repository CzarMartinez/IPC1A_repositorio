
public class Listadoble {
	private Nodo inicio;
	private Nodo fin;
	public Listadoble(){
		inicio= null;
		fin = null;
		}
	public void insertarinicio(String dato){
		if(inicio==null){
			inicio = new Nodo(dato,null,null);
			fin = inicio;
		}
		else{ 
			Nodo nuevo = new Nodo(dato,null,inicio);
			inicio.setAnterior(nuevo);
			inicio= nuevo;
		}
	}
	
	public void insertarfin(String dato){
		if(inicio==null){
			fin = new Nodo(dato,null,null);
			inicio = fin;
		}
		else{ 
			Nodo nuevo = new Nodo(dato,null,inicio);
			fin.setAnterior(nuevo);
			fin= nuevo;
		}
	}
	public String ExtraerInicio(){
		String dato = inicio.getDato();
		inicio = inicio.getSiguiente();
		if(inicio==null){
			inicio.setAnterior(null);
		}
		else{
			fin=null;
		}
		return dato;
	}
	public String ExtraerFin(){
		String dato = fin.getDato();
		fin = fin.getAnterior();
		if(fin!=null){
			fin.setSiguiente(null);
			
		}
		else{
			inicio = null;
		}
		return dato;
	}
	public void Mostrar(){
		Nodo temp = inicio;
		while(temp != null){
			System.out.println(temp.getDato());
			temp = temp.getAnterior();
		}
		
	}
}
