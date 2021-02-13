import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test03 {
	
	//crear las instancias de cada clase
	Empleado pepe;
	Categoria cadete;
	Categoria gerente;
	BonoPorPresentismo bonopresentismo;
	BonoNulo bononulo;

	@BeforeEach
	void setUp() throws Exception {
		
		//Inicializo todas las variables
		pepe = new Empleado();
		
		cadete = new Categoria();
		cadete.setNeto(15000);
		
		gerente = new Categoria();
		gerente.setNeto(10000);
		
		bonopresentismo = new BonoPorPresentismo();
		bononulo = new BonoNulo();
		
	}

	@Test
	void testSueldoPepeBonoPresentismo() {
		
		pepe.setCategoria(gerente);
		pepe.setFaltas(0);
		pepe.setBono(bonopresentismo);
		assertEquals(10100, pepe.CalcularSueldo());
		System.out.println(pepe.CalcularSueldo());
		
	}

}
