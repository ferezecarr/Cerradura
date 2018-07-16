package ar.edu.unlam.pb2.cerradura;

public class Cerradura {

	private Integer claveDeApertura;
	private Integer cantidadDeFallosConsecutivosQueLaBloquean;
	private Boolean estadoDeLaCerradura = false;
	private Boolean estadoBloqueado = false;
	private Integer contadorExitoso = 0;
	private Integer contadorFallido = 0;
	
	public Cerradura(Integer claveDeApertura , Integer cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
	}
	
	public void abrir(Integer clave) {
		if(this.claveDeApertura.equals(clave) && this.estadoBloqueado.equals(false)) {
			this.estadoDeLaCerradura = true;
			this.contadorExitoso++;
			this.contadorFallido = 0;
			
		} else {
			this.contadorFallido++;
			if(this.contadorFallido >= this.cantidadDeFallosConsecutivosQueLaBloquean) {
				this.estadoBloqueado = true;
			}
		}
	}
	
	public void cerrar() {
		this.estadoDeLaCerradura = false;
	}
	
	public Boolean estaAbierta() {
		return this.estadoDeLaCerradura;
	}
	
	public Boolean estaCerrada() {
		return !this.estadoDeLaCerradura;
	}
	
	public Boolean fueBloqueada() {
		return this.estadoBloqueado;
	}
	
	public Integer contarAperturasExitosas() {
		return this.contadorExitoso;
	}
	
	public Integer contarAperturasFallidas() {
		return this.contadorFallido;
	}
	
}
