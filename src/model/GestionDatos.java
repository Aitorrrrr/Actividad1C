package model;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class GestionDatos {

	FileReader fr1;
	
	public GestionDatos() {

	}

	//TODO: Implementa una funci�n para abrir ficheros
	
	//TODO: Implementa una funci�n para cerrar ficheros
	
	public boolean compararContenido (String fichero1, String fichero2)
	{
		FileReader fr1 = new FileReader(fichero1);
		FileReader fr2 = new FileReader(fichero2);
		
		
		
		return true;
	}
	
	public int buscarPalabra (String fichero1, String palabra, boolean primera_aparicion){
		//TODO: Implementa la funci�n
		return 1;
	}	

}
