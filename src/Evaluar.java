import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import org.junit.Test;


public class Evaluar {

	boolean leyendoArchivo(String path)
	{
		try
		{
			File f = new File(path);
			Scanner s = new Scanner(f);
			for(int i=0; i<10; i++)
			{
				if(s.nextInt()!=i)
					return false;
			}
			return true;
		}catch(Exception e)
		{
			
		}
		return false;
	}
	
	@Test
	public void testEjemploTryCatch()
	{
		int a1[] = {1,2};
		int a2[] = {1,2,3};
		int a3[] = {1,2,3,4};
		assertEquals("{1,2} en el indice 1 deberia devolver 2", 2, Ejemplos.ejemploTryCatch(a1,1));
		assertEquals("{1,2,3} en el indice -1 deberia devolver 0 poque esta fuera de los limites", 0, Ejemplos.ejemploTryCatch(a2,-1));
		assertEquals("{1,2,3,4} en el indice 5 deberia devolver 0 poque esta fuera de los limites", 0, Ejemplos.ejemploTryCatch(a3,5));
	}
	
	@Test
	public void testEscribir10Numeros()
	{
		try
		{
			File f = new File("NoBorrarNiModificar1");
			FileWriter fw = new FileWriter(f);
			fw.write("");
			fw.close();
		}catch(Exception e)
		{
			
		}
		Ejemplos.escribir10Numeros("NoBorrarNiModificar1");
		assertEquals("numeros leidos incorrectos", true, leyendoArchivo("NoBorrarNiModificar1"));
	}

	@Test
	public void testCuantasNumeros()
	{
		assertEquals("El archivo NoBorrarNiModificar2 tiene 15 numeros", 15, Ejemplos.cuantosNumeros("NoBorrarNiModificar2"));
	}

	@Test
	public void testGetNombreClase()
	{
		assertEquals("No devolvio \"Soy tipo ClasePadre\"", "Soy tipo ClasePadre", Ejemplos.getNombreClase(new ClasePadre()));
		assertEquals("No devolvio \"Soy tipo ClaseHijo\"", "Soy tipo ClaseHijo", Ejemplos.getNombreClase(new ClaseHijo()));
	}
}
