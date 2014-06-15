class ClasePadre
{
	String getNombreClase()
	{
		return "Soy tipo ClasePadre";
	}
}

class ClaseHijo
{
	
}

public class Ejemplos
{
	//Devuelve el valor "arreglo" en la posicion "pos", si esta fuera de los limites devuelve 0
	//Sugerencia, hacer uso del try catch
	static int ejemploTryCatch(int arreglo[], int pos)
	{
		return -1;
	}
	
	//Escribe los numeros del 0 al 9 separados por espacios o finales de linea
	static void escribir10Numeros(String path)
	{
		
	}
	
	//Cuantos numeros hay en un archivo
	static int cuantosNumeros(String path)
	{
		return -1;
	}
	
	
	//Implementar las clases en la parte superior de este archivo de modo que:
	//Si la clase es de tipo "ClasePadre" la funcion devuelve: "Soy tipo ClasePadre"
	//Si la clase es de tipo "ClaseHijo" la funcion devuelve: "Soy tipo ClaseHijo"
	static String getNombreClase(ClasePadre p)
	{
		return p.getNombreClase();
	}
	
	public static void main(String args[])
	{
	}
}
