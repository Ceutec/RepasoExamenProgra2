import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class ClasePadreResuelta
{
	String getNombreClase()
	{
		return "Soy tipo ClasePadre";
	}
}

class ClaseHijoAResuelta extends ClasePadre
{
	String getNombreClase()
	{
		return "Soy tipo ClaseHijoA";
	}
}

public class EjemplosResueltos
{
	//Lee un numero, si el usuario no ingresa un dato incorrecto, devuelve 0
	static int ejemploTryCatch()
	{
		Scanner s = new Scanner(System.in);
		int num;
		try
		{
			num = s.nextInt();
		}catch(Exception e)
		{
			num = 0;
		}
		return num;
	}
	
	//Escribe los numeros del 0 al 9
	static void escribir10Numeros(String path)
	{
		try
		{
			File f = new File(path);
			FileWriter fw = new FileWriter(f);
			for(int i = 0; i < 10; i++)
			{
				fw.write(i+" ");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Cuantos numeros hay en un archivo
	static int cuantasVecesExiste(String path)
	{
		int num = 0;
		try
		{
			File f = new File(path);
			Scanner s = new Scanner(f);
			while(s.hasNext())
			{
				s.nextInt();
				num++;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return num;
	}
	
	
	//Implementar las clases en la parte superior de este archivo de modo que:
	//Si la clase es de tipo "ClasePadre" la funcion devuelve: "Soy tipo ClasePadre"
	//Si la clase es de tipo "ClaseHijoA" la funcion devuelve: "Soy tipo ClaseHijoA"
	static String getNombreClase(ClasePadreResuelta p)
	{
		return p.getNombreClase();
	}
	
	public static void main(String args[])
	{
	}
}
