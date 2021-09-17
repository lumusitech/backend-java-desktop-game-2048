package negocio;

import java.io.Serializable;
import java.util.Random;

////////////////////////////////////////////////////////////////////////////////////////

@SuppressWarnings("serial")
public class Tablero implements Serializable{
	
	private int[][] tablero;
	private int tamanio;
	private int fila;
	private int columna;
	private String usuario;
	private String nivel;
	private int puntaje;
	private String [][] records;
	
	private boolean sumaDerechaEfectuada;
	private boolean sumaIzquierdaEfectuada;
	private boolean sumaArribaEfectuada;
	private boolean sumaAbajoEfectuada;
	
	private boolean movDerechaEfectuado;
	private boolean movIzquierdaEfectuado;
	private boolean movArribaEfectuado;
	private boolean movAbajoEfectuado;
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	public Tablero() {

		tamanio = 4;
		tablero = new int[tamanio][tamanio];
		usuario = "";
		nivel = "";
		puntaje = 0;
		records = new String [5][3];
		for(int i=0; i<records.length; i++) {
			records[i][0]="";//Nombre del Jugador con record
			records[i][1]="0";//Record
			records[i][2]="";//Nivel con el que hizo ese record
		}
	
		sumaDerechaEfectuada = true;
		sumaIzquierdaEfectuada = true;
		sumaArribaEfectuada = true;
		sumaAbajoEfectuada = true;
		movDerechaEfectuado = true;
		movIzquierdaEfectuado = true;
		movArribaEfectuado = true;
		movAbajoEfectuado = true;

	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	public void agregarValoresIniciales() {
		// Agrega el 1er valor al tablero (posicion y valor aleatorio)
		agregarValorRandom();

		// Agrega el 2do valor al tablero (posiciï¿½n y valor aleatorio)
		agregarValorRandom();
	}

	////////////////////////////////////////////////////////////////////////////////////////
	boolean agregarValorRandom() {
		if (lugarAleatorio()) {
			// busca un lugar aleatorio disponible
			setValor(fila, columna, dosOCuatro());// asigna a ese lugar dos o cuatro aleatoriamente
			return true;
		}
		return false;
	}

	////////////////////////////////////////////////////////////////////////////////////////
	boolean lugarAleatorio() {
		Random r1 = new Random();
		Random r2 = new Random();

		int contador = 0;
		do {

			fila = r1.nextInt(4);
			columna = r2.nextInt(4);

			contador++;

		} while (existeValor(fila, columna) && contador < 10);

		// cuando el contador llego a 10 se pasa a recorrer la matriz completa
		// en busca de un lugar libre
		if (contador == 10) {
			if (!existeLugarDisponible()) {
				return false;
			}
		}
		return true;
	}

	////////////////////////////////////////////////////////////////////////////////////////
	
	int dosOCuatro() {
		int porcentaje = 0;
		String dificultad = nivel;
		
		if(dificultad.equals("principiante")) {
			porcentaje = 10;
		}
		if(dificultad.equals("intermedio")) {
			porcentaje = 50;
		}
		if(dificultad.equals("experto")) {
			porcentaje = 85;
		}
		
		Random r = new Random();
		if (r.nextInt(100) < porcentaje) {
			return 2;
		}
	
		return 4; 
	}

	////////////////////////////////////////////////////////////////////////////////////////
	boolean existeLugarDisponible() {

		for (int i = 0; i < getTamanio(); i++) {
			for (int j = 0; j < getTamanio(); j++) {
				if (!existeValor(i, j)) {
					// guarda la fila y columna que encontro vacï¿½a
					fila = i;
					columna = j;
					return true;
				}
			}
		}
		return false;
	}

	////////////////////////////////////////////////////////////////////////////////////////
	
	public int getTamanio() {
		return tamanio;
	}
	
	public int getValor(int fila, int columna) {
		return tablero[fila][columna];
	}

	public void setValor(int fila, int columna, int valor) {
		tablero[fila][columna] = valor;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {

		if(usuario==null || usuario.equals("")) {
			this.usuario = "Anónimo";
		}
		else if(usuario.length()>8) {
			this.usuario="";
			for(int i=0; i<8; i++) {
				this.usuario+=usuario.charAt(i);
			}
		}
		else {
			this.usuario = usuario;
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	public int getPuntaje() {
		return puntaje;
	}
	
	void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////

	public int getRecord(int posicion) {
		return Integer.parseInt(records[posicion][1]);
	}
	
	public void setRecord(int puntaje, int posicion) {
		records[posicion][1]=Integer.toString(getPuntaje());
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	public String getNivel() {
		return nivel;
	}
	
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	String getNivelDeLaListaDeRecords(int posicion) {
		return records[posicion][2];
	}
	
	void setNivelDeLaListaDeRecords(String nivel, int posicion) {
		records[posicion][2]=nivel; 
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	public String getUsuarioConRecord(int posicion) {
		return records[posicion][0];
	}
	
	public void setUsuarioConRecord(String usuario, int posicion) {
		this.records[posicion][0]=usuario;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	String getRecordRealizado(int posicion) {
		return records[posicion][1];
	}
	
	void setRecordRealizado(String record, int posicion) {
		this.records[posicion][1]=record;
	}

	////////////////////////////////////////////////////////////////////////////////////////
	
	public String getNivelUsado(int posicion) {
		return records[posicion][2];
	}
	
	void setNivelUsado(String nivelUsado, int posicion) {
		this.records[posicion][2]=nivelUsado;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	public boolean estaValor2048EnTablero() {
		for (int i = 0; i < tamanio; i++) {
			for (int j = 0; j < tamanio; j++) {
				if(getValor(i, j)==2048) {
					return true;
				}
			}
		}
		return false;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	boolean getSumaDerechaEfectuada() {
		return sumaDerechaEfectuada;
	}
	
	boolean getMovDerechaEfectuado() {
		return movDerechaEfectuado;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	boolean getSumaIzquierdaEfectuada() {
		return sumaIzquierdaEfectuada;
	}
	
	boolean getMovIzquierdaEfectuado() {
		return movIzquierdaEfectuado;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	boolean getSumaArribaEfectuada() {
		return sumaArribaEfectuada;
	}
	
	boolean getMovArribaEfectuado() {
		return movArribaEfectuado;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	boolean getSumaAbajoEfectuada() {
		return sumaAbajoEfectuada;
	}
	
	boolean getMovAbajoEfectuado() {
		return movAbajoEfectuado;
	}

	////////////////////////////////////////////////////////////////////////////////////////
	
	public void reiniciar() {

		vaciarTablero();
		
		controlDePuntajes();
		
		resetearSumasYMov();

		agregarValoresIniciales();

	}
	
	////////////////////////////////////////////////////////////////////////////////////////

	void controlDePuntajes() {
		
		for(int i=records.length-1; i>=0; i--) {
			
			int actual = i;
			int siguiente = actual+1;
			if( puntaje > getRecord(actual) ) {
				if(actual==4) {
					setUsuarioConRecord(getUsuario(), actual);
					setRecordRealizado(Integer.toString(getPuntaje()), actual);
					setNivelUsado(getNivel(), actual);
				}
				else {
					setUsuarioConRecord(getUsuarioConRecord(actual), siguiente);
					setUsuarioConRecord(getUsuario(), actual);
					
					setRecordRealizado(Integer.toString(getRecord(actual)), siguiente);
					setRecordRealizado(Integer.toString(getPuntaje()), actual);
					
					setNivelDeLaListaDeRecords(getNivelDeLaListaDeRecords(actual), siguiente);
					setNivelUsado(getNivel(), actual);
				}
			}
		}
			
		setPuntaje(0);
	}
	
	////////////////////////////////////////////////////////////////////////////////////////

	void vaciarTablero() {
		for (int i = 0; i < tamanio; i++) {
			for (int j = 0; j < tamanio; j++) {
				// Pone a todas las posiciones en cero
				setValor(i, j, 0);
			}
		}
	}

	////////////////////////////////////////////////////////////////////////////////////////	
	
	public boolean mover(String direccion) {
		
		if (direccion.equals("derecha")) {
			
			sumaDerechaEfectuada = sumarDerecha();
			movDerechaEfectuado = moverDerecha();

			if(movDerechaEfectuado || sumaDerechaEfectuada) {
				agregarValorRandom();
				resetearSumasYMov();
			}
		}

		if (direccion.equals("izquierda")) {
			
			sumaIzquierdaEfectuada = sumarIzquierda();
			movIzquierdaEfectuado = moverIzquierda();

			if(movIzquierdaEfectuado || sumaIzquierdaEfectuada) {
				agregarValorRandom();
				resetearSumasYMov();
			}
		}

		if (direccion.equals("arriba")) {
			
			sumaArribaEfectuada = sumarArriba();
			movArribaEfectuado = moverArriba();

			if(movArribaEfectuado || sumaArribaEfectuada) {
				agregarValorRandom();
				resetearSumasYMov();
			}
		}

		if (direccion.equals("abajo")) {
			
			sumaAbajoEfectuada = sumarAbajo();
			movAbajoEfectuado = moverAbajo();

			if(movAbajoEfectuado || sumaAbajoEfectuada) {
				agregarValorRandom();
				resetearSumasYMov();
			}
		}
		return juegoActivo();
	}
	
	////////////////////////////////////////////////////////////////////////////////////////

	boolean juegoActivo() {
		
		//si no hay sumas ni movmientos posibles el juego ya no estará activo, termina
		if( (!getSumaDerechaEfectuada()    &&   !getMovDerechaEfectuado()) 
		&&  (!getSumaIzquierdaEfectuada()  &&   !getMovIzquierdaEfectuado())
		&&  (!getSumaArribaEfectuada()     &&   !getMovArribaEfectuado())
		&&  (!getSumaAbajoEfectuada()      &&   !getMovAbajoEfectuado()) ) {
			return false;
		}
		
		return true;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	void resetearSumasYMov() {
		//agregar los set correspondientes
		sumaDerechaEfectuada = true;
		sumaIzquierdaEfectuada = true;
		sumaArribaEfectuada = true;
		sumaAbajoEfectuada = true;
		
		movDerechaEfectuado = true;
		movIzquierdaEfectuado = true;
		movArribaEfectuado = true;
		movAbajoEfectuado = true;
		
	}

	////////////////////////////////////////////////////////////////////////////////////////
	
	boolean sumarDerecha() {
		int cont = 0;
		for (int fila = 0; fila < tamanio; fila++) {
			for (int columna = tamanio-1; columna > 0; columna--) {
				if( sumarDerecha(fila, columna, columna-1) ) {
					cont++;
				}
			}
		}
		return cont > 0;
	}
	
	boolean sumarDerecha(int fila, int actual, int anterior) {
		if(anterior >= 0 && existeValor(fila, actual)) {
			if(!existeValor(fila, anterior)) {
				return sumarDerecha(fila, actual, anterior-1);
			}
			else if ((getValor(fila, actual) == getValor(fila, anterior))){
				sumarCuadrosDeFila(fila, actual, anterior);
				return true;
			}
		}
		return false;
	}

	////////////////////////////////////////////////////////////////////////////////////////
	
	boolean moverDerecha() {
		int cont = 0;
		for (int fila = 0; fila < tamanio; fila++) {
			for (int columna = tamanio-1; columna > 0; columna--) {
				if(!existeValor(fila, columna)) {
					if( moverDerecha(fila, columna, columna-1) ) {
						cont++;
					}
				}
			}
		}
		return cont > 0;
	}
	
	boolean moverDerecha(int fila, int lugarLibre, int anterior) {
		if(anterior >= 0) {
			if(!existeValor(fila, anterior)) {
				return moverDerecha(fila, lugarLibre, anterior-1);
			}
			else{
				moverCuadro(fila, anterior, fila, lugarLibre);
				return true;
			}
		}
		return false;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	boolean sumarIzquierda() {
		int cont = 0;
		for (int fila = 0; fila < tamanio; fila++) {
			for (int columna = 0; columna < tamanio; columna++) {
				if( sumarIzquierda(fila, columna, columna+1) ) {
					cont++;
				}
			}
		}
		return cont > 0;
	}
	
	boolean sumarIzquierda(int fila, int actual, int siguiente) {
		if(siguiente < tamanio && existeValor(fila, actual)) {
			if(!existeValor(fila, siguiente)) {
				return sumarIzquierda(fila, actual, siguiente+1);
			}
			else if ( getValor(fila, actual) == getValor(fila, siguiente) ){
				sumarCuadrosDeFila(fila, actual, siguiente);
				return true;
			}
		}
		return false;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	boolean moverIzquierda() {
		int cont = 0;
		for (int fila = 0; fila < tamanio; fila++) {
			for (int columna = 0; columna < tamanio; columna++) {
				if(!existeValor(fila, columna)) {
					if( moverIzquierda(fila, columna, columna+1) ) {
						cont++;
					}
				}
			}
		}
		return cont > 0;
	}
	
	boolean moverIzquierda(int fila, int lugarLibre, int siguiente) {
		if(siguiente < tamanio) {
			if(!existeValor(fila, siguiente)) {
				return moverIzquierda(fila, lugarLibre, siguiente+1);
			}
			else{
				moverCuadro(fila, siguiente, fila, lugarLibre);
				return true;
			}
		}
		return false;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	boolean sumarArriba() {
		int cont = 0;
		for (int columna = 0; columna < tamanio; columna++) {
			for (int fila = 0; fila < tamanio; fila++) {
				if( sumarArriba(columna, fila, fila+1) ) {
					cont++;
				}
			}
		}
		return cont > 0;
	}
	
	boolean sumarArriba(int columna, int actual, int siguiente) {
		if(siguiente < tamanio && existeValor(actual, columna)) {
			if(!existeValor(siguiente, columna)) {
				return sumarArriba(columna, actual, siguiente+1);
			}
			else if ( getValor(actual, columna) == getValor(siguiente, columna) ){
				sumarCuadrosDeColumna(columna, actual, siguiente);
				return true;
			}
		}
		return false;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	boolean moverArriba() {
		int cont = 0;
		for (int columna = 0; columna < tamanio; columna++) {
			for (int fila = 0; fila < tamanio; fila++) {
				if(!existeValor(fila, columna)) {
					if( moverArriba(columna, fila, fila+1) ) {
						cont++;
					}
				}
			}
		}
		return cont > 0;
	}
	
	boolean moverArriba(int columna, int lugarLibre, int siguiente) {
		if(siguiente < tamanio) {
			if(!existeValor(siguiente, columna)) {
				return moverArriba(columna, lugarLibre, siguiente+1);
			}
			else{
				moverCuadro(siguiente, columna, lugarLibre, columna);
				return true;
			}
		}
		return false;
	}

	////////////////////////////////////////////////////////////////////////////////////////
	
	boolean sumarAbajo() {
		int cont = 0;
		for (int columna = 0; columna < tamanio; columna++) {
			for (int fila = tamanio-1; fila > 0; fila--) {
				if( sumarAbajo(columna, fila, fila-1) ) {
					cont++;
				}
			}
		}
		return cont > 0;
	}
	
	boolean sumarAbajo(int columna, int actual, int anterior) {
		if(anterior >= 0 && existeValor(actual, columna)) {
			if(!existeValor(anterior, columna)) {
				return sumarAbajo(columna, actual, anterior-1);
			}
			else if ((getValor(actual, columna) == getValor(anterior, columna))){
				sumarCuadrosDeColumna(columna, actual, anterior);
				return true;
			}
		}
		return false;
	}

	////////////////////////////////////////////////////////////////////////////////////////
	
	boolean moverAbajo() {
		int cont = 0;
		for (int columna = 0; columna < tamanio; columna++) {
			for (int fila = tamanio-1; fila > 0; fila--) {
				if(!existeValor(fila, columna)) {
					if( moverAbajo(columna, fila, fila-1) ) {
						cont++;
					}
				}
			}
		}
		return cont > 0;
	}
	
	boolean moverAbajo(int columna, int lugarLibre, int anterior) {
		if(anterior >= 0) {
			if(!existeValor(anterior, columna)) {
				return moverAbajo(columna, lugarLibre, anterior-1);
			}
			else{
				moverCuadro(anterior, columna, lugarLibre, columna);
				return true;
			}
		}
		return false;
	}

	////////////////////////////////////////////////////////////////////////////////////////
	
	boolean existeValor(int fila, int columna) {
		return getValor(fila, columna) != 0;
	}

	////////////////////////////////////////////////////////////////////////////////////////
	
	void sumarCuadrosDeFila(int fila, int actual, int cuadroASumar) {
		// los sumo
		int suma = (getValor(fila, actual)) + (getValor(fila, cuadroASumar));
		setValor(fila, actual, suma);
		// se quita el valor del cuadro a sumar poque el resultado de la suma queda solo en el actual
		setValor(fila, cuadroASumar, 0);
		// sumo al puntaje
		puntaje += suma;
	}
	
	void sumarCuadrosDeColumna(int columna, int actual, int cuadroASumar) {
		// los sumo
		int suma = (getValor(actual, columna)) + (getValor(cuadroASumar, columna));
		setValor(actual, columna, suma);
		// se quita el valor del cuadro a sumar poque el resultado de la suma queda solo en el actual
		setValor(cuadroASumar, columna, 0);
		// sumo al puntaje
		puntaje += suma;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	void moverCuadro(int OrigenFila, int OrigenColumna, int DestinoFila, int DestinoColumna) {
		setValor(DestinoFila, DestinoColumna, getValor(OrigenFila, OrigenColumna));
		setValor(OrigenFila, OrigenColumna, 0);
	}
	
	
	/////////////////////////////METODOS PARA TESTING///////////////////////////////////////
	
	void agregarValoresRandom(int cant) {
		for (int i = 0; i < cant; i++) {
			agregarValorRandom();
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////////////

	void setFilaCompletaConValor(int fila, int valor) {

		for (int columna = 0; columna < getTamanio(); columna++) {
			setValor(fila, columna, valor);
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////////////

	void setColumnaCompletaConValor(int columna, int valor) {

		for (int fila = 0; fila < getTamanio(); fila++) {
			setValor(fila, columna, valor);
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	// Se utiliza acumuladores booleanos
	boolean verificarValoresEnColumnaCompleta(int columna, int valor) {
		boolean ret = true;
		for (int fila = 0; fila < getTamanio() && ret; fila++) {
			ret = ret && (getValor(fila, columna) == valor);
		}
		return ret;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
		
	// Se utiliza acumuladores booleanos
	boolean verificarValoresEnFilaCompleta(int fila, int valor) {
		boolean ret = true;
		for (int columna = 0; columna < getTamanio() && ret; columna++) { 
			ret = ret && (getValor(fila, columna) == valor);			
		}
		return ret;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////

	// Se utiliza acumuladores booleanos
	boolean verificarValoresEnTableroCompleto(int valor) {
		boolean ret = true;
		for (int fila = 0; fila < getTamanio(); fila++) {
			for (int columna = 0; columna < getTamanio() && ret; columna++) {
				ret = ret && (getValor(fila, columna) == 0);
			}
		}
		return ret;
	}
}
