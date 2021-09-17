package negocio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class TableroTest { 

	@Test
	public void agregarValorRandomTableroCompletoTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.agregarValoresRandom(16);//(tablero 4x4)

		// verify
		assertFalse(tablero.agregarValorRandom());
		
	}

	@Test
	public void moverCuadroPosicionOrigenTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setValor(0, 0, 2);
		tablero.moverCuadro(0, 0, 0, 3);

		// verify
		assertFalse(tablero.existeValor(0, 0));
	}

	@Test
	public void moverCuadroPosicionDestinoTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setValor(0, 0, 2);
		tablero.moverCuadro(0, 0, 0, 3);

		// verify
		assertTrue(tablero.existeValor(0, 3));
	}

	@Test
	public void sumarDerechaSinValoresTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnTableroCompleto(0));

	}

	@Test
	public void sumarDerechaCol0Col1Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(1, 4));

	}

	@Test
	public void sumarDerechaCol0Col2Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 4));

	}

	@Test
	public void sumarDerechaCol0Col3Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(3, 2);
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 4));

	}

	@Test
	public void sumarDerechaCol1Col2Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 4));

	}

	@Test
	public void sumarDerechaCol1Col3Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(3, 2);
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 4));

	}

	@Test
	public void sumarDerechaCol2Col3Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.setColumnaCompletaConValor(3, 2);
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 4));

	}

	@Test
	public void sumarDerechaCol0Col1ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(1, 4));

	}

	@Test
	public void sumarDerechaCol0Col2ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(2, 4);
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 4));

	}

	@Test
	public void sumarDerechaCol0Col3ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(3, 4);
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 4));

	}

	@Test
	public void sumarDerechaCol1Col2ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(2, 4);
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 4));

	}

	@Test
	public void sumarDerechaCol1Col3ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(3, 4);
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 4));

	}

	@Test
	public void sumarDerechaCol2Col3ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.setColumnaCompletaConValor(3, 4);
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 4));

	}

	@Test
	public void sumarDerechaCol3Col2SinValorAnteriorTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(3, 2);
		tablero.sumarDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 2));
	}

	@Test
	public void sumarIzquierdaSinValoresTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnTableroCompleto(0));

	}

	@Test
	public void sumarIzquierdaCol0Col1Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 4));

	}

	@Test
	public void sumarIzquierdaCol0Col2Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 4));

	}

	@Test
	public void sumarIzquierdaCol0Col3Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(3, 2);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 4));

	}

	@Test
	public void sumarIzquierdaCol1Col0Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(1, 4));

	}

	@Test
	public void sumarIzquierdaCol1Col2Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(1, 4));

	}

	@Test
	public void sumarIzquierdaCol1Col3Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(3, 2);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(1, 4));

	}

	@Test
	public void sumarIzquierdaCol2Col3Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.setColumnaCompletaConValor(3, 2);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 4));

	}

	@Test
	public void sumarIzquierdaCol0Col1ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 2));

	}

	@Test
	public void sumarIzquierdaCol0Col2ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(2, 4);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 2));

	}

	@Test
	public void sumarIzquierdaCol0Col3ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(3, 4);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 2));

	}

	@Test
	public void sumarIzquierdaCol1Col2ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(2, 4);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(1, 2));

	}

	@Test
	public void sumarIzquierdaCol1Col3ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(3, 4);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(1, 2));

	}

	@Test
	public void sumarIzquierdaCol2Col3ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.setColumnaCompletaConValor(3, 4);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 2));

	}

	@Test
	public void sumarIzquierdaCol3Col2SinValorSiguienteTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.sumarIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 2));
	}

	@Test
	public void sumarArribaSinValoresTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnTableroCompleto(0));

	}

	@Test
	public void sumarArribafila0fila1Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(1, 2);
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 4));

	}

	@Test
	public void sumarArribafila0fila2Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 4));

	}

	@Test
	public void sumarArribafila0fila3Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 4));

	}

	@Test
	public void sumarArribafila1fila2Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(1, 4));

	}

	@Test
	public void sumarArribafila1fila3Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(1, 4));

	}

	@Test
	public void sumarArribafila2fila3Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(2, 2);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 4));

	}

	@Test
	public void sumarArribafila0fila1ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 2));

	}

	@Test
	public void sumarArribafila0fila2ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(2, 4);
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 2));

	}

	@Test
	public void sumarArribafila0fila3ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(3, 4);
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 2));

	}

	@Test
	public void sumarArribafila1fila2ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(2, 4);
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(1, 2));

	}

	@Test
	public void sumarArribafila1fila3ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(3, 4);
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(1, 2));

	}

	@Test
	public void sumarArribafila2fila3ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(2, 2);
		tablero.setFilaCompletaConValor(3, 4);
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 2));

	}

	@Test
	public void sumarArribaCol3Col2SinValorAbajoTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.sumarArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 2));
	}

	@Test
	public void sumarAbajoSinValoresTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnTableroCompleto(0));

	}

	@Test
	public void sumarAbajo1ValorEnFila2SinOtrosValoresTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(2, 2);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 0));

	}

	@Test
	public void sumarAbajoFila0Fila1Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(1, 2);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(1, 4));

	}

	@Test
	public void sumarAbajoFila0Fila2Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 4));

	}

	@Test
	public void sumarAbajoFila0Fila3Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 4));

	}

	@Test
	public void sumarAbajoFila1Fila2Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 4));

	}

	@Test
	public void sumarAbajoFila1Fila3Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 4));

	}

	@Test
	public void sumarAbajoFila2Fila3Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(2, 2);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 4));

	}

	@Test
	public void sumarAbajoFila0Fila1ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(1, 4));

	}

	@Test
	public void sumarAbajoFila0Abajo2ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(2, 4);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 4));

	}

	@Test
	public void sumarAbajoFila0Fila3ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(3, 4);

		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 4));

	}

	@Test
	public void sumarAbajoFila1Fila2ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(2, 4);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 4));

	}

	@Test
	public void sumarAbajoFila1Fila3ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(3, 4);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 4));

	}

	@Test
	public void sumarAbajoFila2Fila3ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(2, 2);
		tablero.setFilaCompletaConValor(3, 4);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 4));

	}

	@Test
	public void sumarAbajoFila3Fila2SinValorAnteriorTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(3, 2);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 2));
	}

	@Test
	public void sumarAbajoFila3Fila0ValoresDistintosTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(3, 4);
		tablero.sumarAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 8));

	}

	@Test
	public void moverDerechaCol0Col1OrigenTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(2, 4);
		tablero.setColumnaCompletaConValor(3, 4);

		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 0));
	}

	@Test
	public void moverDerechaCol0Col1LibreTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(2, 4);
		tablero.setColumnaCompletaConValor(3, 4);
		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(1, 2));
	}

	@Test
	public void moverDerechaCol0Col2OrigenTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(3, 4);

		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 0));
	}

	@Test
	public void moverDerechaCol0Col2LibreTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(3, 4);

		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(1, 2));
	}

	@Test
	public void moverDerechaCol0Col3OrigenTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 4);

		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 0));
	}

	@Test
	public void moverDerechaCol0Col3LibreTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 4);
		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(1, 2));
	}

	@Test
	public void moverDerechaCol1Col2OrigenTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 4);
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(3, 4);

		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 0));
	}

	@Test
	public void moverDerechaCol1Col2DestinoTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 4);
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(3, 4);
		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 2));
	}

	@Test
	public void moverDerechaCol1Col3OrigenTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 4);
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(2, 4);

		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 0));
	}

	@Test
	public void moverDerechaCol1Col3DestinoTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 4);
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(2, 4);
		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 2));
	}

	@Test
	public void moverDerechaCol2Col3OrigenTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 4);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 2);

		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 0));
	}

	@Test
	public void moverDerechaCol2Col3DestinoTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 4);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 2));
	}

	@Test
	public void moverDerechaSinMovimientoTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 8);
		tablero.setColumnaCompletaConValor(3, 16);
		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 8));
	}

	@Test
	void moverDerecha2ColumnasVaciasTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 2));
	}

	@Test
	void moverDerecha3ColumnasVaciasTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 2));
	}

	@Test
	void moverDerecha4ColumnasVaciasTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.moverDerecha();

		// verify
		assertTrue(tablero.verificarValoresEnTableroCompleto(0));
	}

	@Test
	public void moverIzquierdaCol0Col1Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(2, 4);
		tablero.setColumnaCompletaConValor(3, 2);

		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 0));
	}

	@Test
	public void moverIzquierdaCol0Col1Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(2, 4);
		tablero.setColumnaCompletaConValor(3, 2);

		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(1, 4));
	}

	@Test
	public void moverIzquierdaCol0Col2Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(3, 2);

		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 0));
	}

	@Test
	public void moverIzquierdaCol0Col2Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(3, 2);

		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 0));
	}

	@Test
	public void moverIzquierdaCol0Col3Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 2);

		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 0));
	}

	@Test
	public void moverIzquierdaCol0Col3Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 2);

		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 2));
	}

	@Test
	public void moverIzquierdaCol1Col2Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 4);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(3, 2);

		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 0));
	}

	@Test
	public void moverIzquierdaCol1Col2Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 4);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(3, 2);

		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 2));
	}

	@Test
	public void moverIzquierdaCol1Col3Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 4);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 2);

		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 0));
	}

	@Test
	public void moverIzquierdaCol1Col3Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 4);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 2);

		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 2));
	}

	@Test
	public void moverIzquierdaCol2Col3Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 4);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 2);

		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(3, 0));
	}

	@Test
	public void moverIzquierdaCol2Col3Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 4);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 2);

		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 2));
	}

	@Test
	public void moverIzquierdaSinMovimientoTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 8);
		tablero.setColumnaCompletaConValor(3, 16);
		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(2, 8));
	}

	@Test
	public void moverIzquierda2ColumnasVaciasTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.setColumnaCompletaConValor(3, 4);
		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 2));
	}

	@Test
	public void moverIzquierda3ColumnasVaciasTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(3, 2);
		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 2));
	}

	@Test
	public void moverIzquierda4ColumnasVaciasTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.moverIzquierda();

		// verify
		assertTrue(tablero.verificarValoresEnTableroCompleto(0));
	}

	@Test
	public void moverArribaFila0Fila1Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(2, 4);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 0));
	}

	@Test
	public void moverArribaFila0Fila1Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(2, 4);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 2));
	}

	@Test
	public void moverArribaFila0Fila2Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 0));
	}

	@Test
	public void moverArribaFila0Fila2Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 2));
	}

	@Test
	public void moverArribaFila0Fila3Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 0));
	}

	@Test
	public void moverArribaFila0Fila3Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 2));
	}

	@Test
	public void moverArribaFila1Fila2Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 0));
	}

	@Test
	public void moverArribaFila1Fila2Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 2));
	}

	@Test
	public void moverArribaFila1Fila3Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 0));
	}

	@Test
	public void moverArribaFila1Fila3Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 2));
	}

	@Test
	public void moverArribaFila2Fila3Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 0));
	}

	@Test
	public void moverArribaFila2Fila3Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 2));
	}

	@Test
	public void moverArribaSinMovimientoTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(2, 8);
		tablero.setFilaCompletaConValor(3, 16);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 8));
	}

	@Test
	public void moverArribaFila1Test() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(3, 2);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 2));
	}

	@Test
	public void moverArriba2FilasVaciasTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(2, 2);
		tablero.setFilaCompletaConValor(3, 4);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 2));
	}

	@Test
	public void moverArriba3FilasVaciasTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(2, 4);
		tablero.setFilaCompletaConValor(3, 8);
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 2));
	}

	@Test
	public void moverArriba4FilasVaciasTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.moverArriba();

		// verify
		assertTrue(tablero.verificarValoresEnTableroCompleto(0));
	}

	@Test
	public void moverAbajoFila0Fila1Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(2, 4);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 0));
	}

	@Test
	public void moverAbajoFila0Fila1Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(2, 4);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(1, 4));
	}

	@Test
	public void moverAbajoFila0Fila2Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 0));
	}

	@Test
	public void moverAbajoFila0Fila2Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(1, 4));
	}

	@Test
	public void moverAbajoFila0Fila3Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 0));
	}

	@Test
	public void moverAbajoFila0Fila3Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(1, 4));
	}

	@Test
	public void moverAbajoFila1Fila2Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 0));
	}

	@Test
	public void moverAbajoFila1Fila2Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(1, 4));
	}

	@Test
	public void moverAbajoFila1Fila3Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 0));
	}

	@Test
	public void moverAbajoFila1Fila3Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 2));
	}

	@Test
	public void moverAbajoFila2Fila3Origen() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 0));
	}

	@Test
	public void moverAbajoFila2Fila3Libre() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setFilaCompletaConValor(1, 2);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(1, 4));
	}

	@Test
	public void moverAbajoSinMovimientoTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(2, 8);
		tablero.setFilaCompletaConValor(3, 16);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(2, 8));
	}

	@Test
	public void moverAbajo2FilasVaciasTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 4));
	}

	@Test
	public void moverAbajo3FilasVaciasTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 2));
	}

	@Test
	public void moverAbajo4FilasVaciasTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.moverAbajo();

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(3, 0));
	}
	
	///////////////////////////////////////////////////////////////////////////////

	@Test
	public void moverParametroDerecha_sumaFalseMovFalse_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.setColumnaCompletaConValor(3, 4);
		tablero.mover("derecha");
		

		// verify
		assertFalse(tablero.getSumaDerechaEfectuada() && tablero.getMovDerechaEfectuado());
	}
	
	@Test
	public void moverParametroDerecha_sumaTrueMovFalse_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.setColumnaCompletaConValor(3, 2);
		tablero.mover("derecha");
		

		// verify
		assertTrue(tablero.getSumaDerechaEfectuada() && tablero.getMovDerechaEfectuado());
	}
	
	@Test
	public void moverParametroDerecha_sumaFalseMovTrue_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.mover("derecha");
		

		// verify
		assertTrue(tablero.getSumaDerechaEfectuada() && tablero.getMovDerechaEfectuado());
	}
	
	@Test
	public void moverParametroDerecha_sumaTrueMovTrue_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.mover("derecha");
		

		// verify
		assertTrue(tablero.getSumaDerechaEfectuada() && tablero.getMovDerechaEfectuado());
	}

	@Test
	public void moverParametroIzquierda_sumaFalseMovFalse_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 4);
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.setColumnaCompletaConValor(3, 4);
		tablero.mover("izquierda");
		

		// verify
		assertFalse(tablero.getSumaIzquierdaEfectuada() && tablero.getMovIzquierdaEfectuado());
	}
	
	@Test
	public void moverParametroIzquierda_sumaTrueMovFalse_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.mover("izquierda");
		

		// verify
		assertTrue(tablero.getSumaIzquierdaEfectuada() && tablero.getMovIzquierdaEfectuado());
	}
	
	@Test
	public void moverParametroIzquierda_sumaFalseMovTrue_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(3, 2);
		tablero.mover("izquierda");
		

		// verify
		assertTrue(tablero.getSumaIzquierdaEfectuada() && tablero.getMovIzquierdaEfectuado());
	}
	
	@Test
	public void moverParametroIzquierda_sumaTrueMovTrue_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.setColumnaCompletaConValor(3, 2);
		tablero.mover("izquierda");
		

		// verify
		assertTrue(tablero.getSumaIzquierdaEfectuada() && tablero.getMovIzquierdaEfectuado());
	}
	
	//****************************************

	@Test
	public void moverParametroArriba_sumaFalseMovFalse_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.setFilaCompletaConValor(3, 4);
		tablero.mover("arriba");
		

		// verify
		assertFalse(tablero.getSumaArribaEfectuada() && tablero.getMovArribaEfectuado());
	}
	
	@Test
	public void moverParametroArriba_sumaTrueMovFalse_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(1, 2);
		tablero.mover("arriba");
		

		// verify
		assertTrue(tablero.getSumaArribaEfectuada() && tablero.getMovArribaEfectuado());
	}
	
	@Test
	public void moverParametroArriba_sumaFalseMovTrue_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(3, 2);
		tablero.mover("arriba");
		

		// verify
		assertTrue(tablero.getSumaArribaEfectuada() && tablero.getMovArribaEfectuado());
	}
	
	@Test
	public void moverParametroArriba_sumaTrueMovTrue_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(2, 2);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.mover("arriba");
		

		// verify
		assertTrue(tablero.getSumaArribaEfectuada() && tablero.getMovArribaEfectuado());
	}
	
	//******************************************

	@Test
	public void moverParametroAbajo_sumaFalseMovFalse_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(1, 4);
		tablero.setFilaCompletaConValor(2, 2);
		tablero.setFilaCompletaConValor(3, 4);
		tablero.mover("abajo");
		

		// verify
		assertFalse(tablero.getSumaAbajoEfectuada() && tablero.getMovAbajoEfectuado());
	}
	
	@Test
	public void moverParametroAbajo_sumaTrueMovFalse_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(2, 2);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.mover("abajo");
		

		// verify
		assertTrue(tablero.getSumaAbajoEfectuada() && tablero.getMovAbajoEfectuado());
	}
	
	@Test
	public void moverParametroAbajo_sumaFalseMovTrue_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.mover("abajo");
		

		// verify
		assertTrue(tablero.getSumaAbajoEfectuada() && tablero.getMovAbajoEfectuado());
	}
	
	@Test
	public void moverParametroAbajo_sumaTrueMovTrue_Test() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		tablero.setFilaCompletaConValor(1, 2);
		tablero.mover("abajo");
		

		// verify
		assertTrue(tablero.getSumaAbajoEfectuada() && tablero.getMovAbajoEfectuado());
	}
	
	//**********************************************

	@Test
	public void moverParametroVacioTest() {

		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(2, 2);
		tablero.setFilaCompletaConValor(3, 2);
		tablero.mover("");

		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 0));
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	@Test
	public void juegoActivoTest() {
		
		//setup
		
		//excercise
		
		//verify
		
	}

	///////////////////////////////////////////////////////////////////////////
	
	/////  Test de Getters y Setters auxiliares para los testeos
	///////////////////////////////////////////////////////////////////////////
	
	@Test
	public void verificarValoresEnColumnaCompletaTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		
		// verify
		assertTrue(tablero.verificarValoresEnColumnaCompleta(0, 2));	
	}
	
	@Test
	public void verificarValoresEnColumnaCompletaFalsoTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setColumnaCompletaConValor(0, 2);
		
		// verify
		assertFalse(tablero.verificarValoresEnColumnaCompleta(0, 4));	
	}
	
	@Test
	public void verificarValoresEnFilaCompletaTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 2);
		
		// verify
		assertTrue(tablero.verificarValoresEnFilaCompleta(0, 2));	
	}
	
	@Test
	public void verificarValoresEnFilaCompletaFalsoTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setFilaCompletaConValor(0, 4);
		tablero.setColumnaCompletaConValor(0, 2);
		//tablero.setValor(0, 0, 2);
		
		// verify
		assertFalse(tablero.verificarValoresEnFilaCompleta(0, 4));	
	}
	
	@Test
	public void verificarValoresEnTableroCompletoTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		tablero.setValor(3, 3, 2);
		
		// verify
		assertFalse(tablero.verificarValoresEnTableroCompleto(0));	
	
	}
	
	@Test
	public void existeLugarDisponibleFalsoTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.setColumnaCompletaConValor(0, 2);
		tablero.setColumnaCompletaConValor(1, 2);
		tablero.setColumnaCompletaConValor(2, 2);
		tablero.setColumnaCompletaConValor(3, 2);
		
		// verify
		assertFalse(tablero.existeLugarDisponible());		
	}
	
	@Test
	public void existeLugarDisponibleVerdaderoTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.vaciarTablero();
		
		// verify
		assertTrue(tablero.existeLugarDisponible());		
	}
	
	@Test
	public void reiniciarTest() {
		// setup
		Tablero tablero = new Tablero();

		// excercise
		tablero.reiniciar();
		
		// verify
		assertTrue(tablero.existeLugarDisponible());
		
	}
}
