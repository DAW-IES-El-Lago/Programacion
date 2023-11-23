package aritmetica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



//new->unitj test
class AritmeticaTest {

	/*Aritmetica a;
	@BeforeEach//algo general para hacer antes de cada test
	void setUp() {
		a=new Aritmetica();
	}*/
	
	static Aritmetica a;
	
	private static Stream<Arguments> datos(){
		return Stream.of(Arguments.of(4,1,3), Arguments.of(5,2,3), Arguments.of(2,3,-1));
	}
	
	@ParameterizedTest
	@MethodSource("datos")
	public void restasTest(float n1, float n2, float esperado) {
		assertEquals(a.resta(n1, n2), esperado);
	}
	
	
	
	
	
	
	@BeforeAll//lo hace una vez antes de hacer los tests
	static void setUpBeforeClass() {
		a=new Aritmetica();
	}
	
	
	
	
	
	@Test//poner esto en cada test sino no lo coge
	void testSuma() {
		//Aritmetica a=new Aritmetica();
		double resultadoActual=a.suma(1, 1);
		double resultadoEsperado=2;
		assertEquals(resultadoActual, resultadoEsperado);
	}
	
	@Test	
	void testResta() {
		//Aritmetica a=new Aritmetica();
		double resultadoActual=a.resta(1, 1);
		double resultadoEsperado=0;
		assertEquals(resultadoActual, resultadoEsperado);
	}
	
	@Test	
	void testMultiplicacion() {
		//Aritmetica a=new Aritmetica();
		double resultadoActual=a.multiplicacion(4, 2);
		double resultadoEsperado=8;
		assertEquals(resultadoActual, resultadoEsperado);
	}
	
	@Test	
	void testDivision() {
		//Aritmetica a=new Aritmetica();
		double resultadoActual=a.division(4, 2);
		double resultadoEsperado=2;
		assertEquals(resultadoActual, resultadoEsperado);
	}
	
	/*@AfterEach
	void tearDown() {
		a=null;
	}*/
	
	@AfterAll
	static void tearDownAfterClass() {
		a=null;
	}
	

}
