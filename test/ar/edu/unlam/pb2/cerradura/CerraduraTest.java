package ar.edu.unlam.pb2.cerradura;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CerraduraTest {

	@Test
	public void testQueUnaCerraduraNuevaEstaCerrada() {
		Cerradura cerradura = new Cerradura(1234, 3);
		Boolean estadoDeLaCerradura = true;
		assertEquals(estadoDeLaCerradura , cerradura.estaCerrada());
	}
	
	@Test
	public void testQueCuandoIngresoClaveCorrectaSeAbra() {
		Cerradura cerradura = new Cerradura(1234, 3);
		Boolean estadoDeLaCerradura = true;
		cerradura.abrir(1234);
		assertEquals(estadoDeLaCerradura , cerradura.estaAbierta());
	}
	
	@Test
	public void testQueCuandoIngresoClaveIncorrectaNoSeAbra() {
		Cerradura cerradura = new Cerradura(1234, 3);
		Boolean estadoDeLaCerradura = false;
		cerradura.abrir(123);
		cerradura.cerrar();
		cerradura.abrir(12);
		assertEquals(estadoDeLaCerradura , cerradura.estaAbierta());
	}
	
	@Test
	public void testQueCuandoIngresoClaveIncorrectaTresVecesSeBLoqueaLaCerradura() {
		Cerradura cerradura = new Cerradura(1234, 3);
		cerradura.abrir(123);
		cerradura.abrir(156);
		cerradura.abrir(6589);
		Boolean cerraduraBloqueada = true;
		assertEquals(cerraduraBloqueada , cerradura.fueBloqueada());
	}
	
	@Test
	public void testQueCuentaLasAperturasExitosasDeLaCerradura() {
		Cerradura cerradura = new Cerradura(1234, 3);
		Cerradura cerraduraDos = new Cerradura(1234, 3);
		cerradura.abrir(1234);
		cerraduraDos.abrir(1234);
		Integer aperturasExitosas = cerradura.contarAperturasExitosas() + cerraduraDos.contarAperturasExitosas();
		assertEquals(2 , aperturasExitosas.intValue());
	}
	
	@Test
	public void testQueCuentaLasAperturasFallidasDeLaCerradura() {
		Cerradura cerradura = new Cerradura(1234, 3);
		Cerradura cerraduraDos = new Cerradura(1234, 3);
		cerradura.abrir(12547);
		cerraduraDos.abrir(7896);
		Integer aperturasFallidas = cerradura.contarAperturasFallidas() + cerraduraDos.contarAperturasFallidas();
		assertEquals(2 , aperturasFallidas.intValue());
	}
}
