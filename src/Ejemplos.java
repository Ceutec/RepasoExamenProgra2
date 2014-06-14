class ClasePadre
{
	String getNombreClase()
	{
		return "Soy tipo ClasePadre";
	}
}

class ClaseHijoA
{
	
}

public class Ejemplos
{
	//Lee un numero, si el usuario no ingresa un dato incorrecto, devuelve 0
	static int ejemploTryCatch()
	{
		return -1;
	}
	
	//Escribe los numeros del 0 al 9
	static void escribir10Numeros(String path)
	{
		
	}
	
	//Cuantos numeros hay en un archivo
	static int cuantasVecesExiste(String path)
	{
		return -1;
	}
	
	
	//Implementar las clases en la parte superior de este archivo de modo que:
	//Si la clase es de tipo "ClasePadre" la funcion devuelve: "Soy tipo ClasePadre"
	//Si la clase es de tipo "ClaseHijoA" la funcion devuelve: "Soy tipo ClaseHijoA"
	static String getNombreClase(ClasePadre p)
	{
		return p.getNombreClase();
	}
	
	public static void main(String args[])
	{
	}
}
