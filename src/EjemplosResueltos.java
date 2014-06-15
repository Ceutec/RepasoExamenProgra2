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

class ClaseHijoResuelta extends ClasePadreResuelta
{
	String getNombreClase()
	{
		return "Soy tipo ClaseHijo";
	}
}

public class EjemplosResueltos
{
	//Devuelve el valor "arreglo" en la posicion "pos", si esta fuera de los limites devuelve 0
	//Sugerencia, hacer uso del try catch
	static int ejemploTryCatch(int arreglo[], int pos)
	{
		try
		{
			return arreglo[pos];
		}catch(Exception e)
		{
			
		}
		return 0;
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
			fw.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Cuantos numeros hay en un archivo
	static int cuantosNumeros(String path)
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
	//Si la clase es de tipo "ClasePadreResuelta" la funcion devuelve: "Soy tipo ClasePadre"
	//Si la clase es de tipo "ClaseHijoResuelta" la funcion devuelve: "Soy tipo ClaseHijo"
	static String getNombreClase(ClasePadreResuelta p)
	{
		return p.getNombreClase();
	}
	
	public static void main(String args[])
	{
	}
}
