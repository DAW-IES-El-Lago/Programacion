package appBancaria;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class BancoTest {

	static Banco a;
	
	
	//---------------------------------------TESTS PARAMETRIZADOS---------------------------------------------------
	
	public static Stream<Arguments> datos1(){
		return Stream.of(Arguments.of(210, false, true), Arguments.of(0, false, false), Arguments.of(23754, true, true));
	}
	
	@ParameterizedTest
	@MethodSource("datos1")
	public void codigoBancoTest(int n, boolean b1, boolean b2) {
		assertEquals(a.codigoBanco(n, b1), b2);
	}
	
	
	
	public static Stream<Arguments> datos2(){
		return Stream.of(Arguments.of(1200, true), Arguments.of(900, false), Arguments.of(1800, true));
	}
	
	@ParameterizedTest
	@MethodSource("datos2")
	public void codigoSucursalTest(int n, boolean b1) {
		assertEquals(a.codigoSucursal(n), b1);
	}
	
	
	
	public static Stream<Arguments> datos3(){
		return Stream.of(Arguments.of(98374, true), Arguments.of(20, false), Arguments.of(34584, true));
	}
	
	@ParameterizedTest
	@MethodSource("datos3")
	public void numeroCuentaTest(int n, boolean b1) {
		assertEquals(a.numeroCuenta(n), b1);
	}
	
	
	
	public static Stream<Arguments> datos4(){
		return Stream.of(Arguments.of("H66J2", true), Arguments.of("L", false), Arguments.of("A22L9", true));
	}
	
	@ParameterizedTest
	@MethodSource("datos4")
	public void clavePersonalTest(String s, boolean b1) {
		assertEquals(a.clavePersonal(s), b1);
	}
	
	
	
	public static Stream<Arguments> datos5(){
		return Stream.of(Arguments.of("", true), Arguments.of("QUIERO DINERO", false), Arguments.of("TALONARIO", true));
	}
	
	@ParameterizedTest
	@MethodSource("datos5")
	public void ordenTest(String s, boolean b1) {
		assertEquals(a.orden(s), b1);
	}
	
	
	
	
	
	
	
	
	
	
	
	//---------------------------------------TESTS SIMPLES---------------------------------------------------

	
	@BeforeAll//lo hace una vez antes de hacer los tests
	static void setUpBeforeClass() {
		a=new Banco();
	}
	
	
	
	@Test
	void testCodigoBanco() {
		
		boolean actual=a.codigoBanco(210, false);
		boolean esperado=true;
		assertEquals(actual, esperado);
	}
	
	@Test
	void testCodigoSucursal() {
		
		boolean actual=a.codigoSucursal(1200);
		boolean esperado=true;
		assertEquals(actual, esperado);
	}
	
	@Test
	void testNumeroCuenta() {
		
		boolean actual=a.numeroCuenta(98374);
		boolean esperado=true;
		assertEquals(actual, esperado);
	}
	
	@Test
	void testClavePersonal() {
		
		boolean actual=a.clavePersonal("H66J2");
		boolean esperado=true;
		assertEquals(actual, esperado);
	}
	
	@Test
	void testOrden() {
		
		boolean actual=a.orden("");
		boolean esperado=true;
		assertEquals(actual, esperado);
	}
	
	
	
	
	
	@AfterAll
	static void tearDownAfterClass() {
		a=null;
	}
	

}
