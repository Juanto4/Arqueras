package Inicio;

class reglas{
	private String nombre;
	private int num_orcos;
	private int num_guerreros;
	private String estado;
	private String monedas;
	private int num_flechas;
	private int cartas_accion;
	
	//constructores
	reglas (String estado){
		setEstado("Defendido");
	}
	reglas (String estado, int num_orcos, int num_guerreros, String monedas, int num_flechas){
		setEstado("Defendido");
		setNum_orcos(num_orcos);
		setNum_guerreros(num_guerreros);
		setMonedas("verde");
		setNum_flechas(num_flechas);
		
	}
	
	
	
	//metodos
	
	public int getNum_orcos() {
		return num_orcos;
	}
	public void setNum_orcos(int num_orcos) {
		this.num_orcos = num_orcos;
	}
	public int getNum_guerreros() {
		return num_guerreros;
	}
	public void setNum_guerreros(int num_guerreros) {
		this.num_guerreros = num_guerreros;
	}
	public String getMonedas() {
		return monedas;
	}
	public void setMonedas(String monedas) {
		this.monedas = monedas;
	}
	public int getNum_flechas() {
		return num_flechas;
	}
	public void setNum_flechas(int num_flechas) {
		this.num_flechas = num_flechas;
	}
	public int getCartas_accion() {
		return cartas_accion;
	}
	public void setCartas_accion(int cartas_accion) {
		this.cartas_accion = cartas_accion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
public class Juego {
	
	
	

}
