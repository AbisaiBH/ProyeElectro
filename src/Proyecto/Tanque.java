package Proyecto;
import java.util.Scanner;

public class Tanque 
{
		public static void main(String[] args) 
		{
			Boolean LH, LI, TH, TC; //ENTRADAS
			Boolean Ve, Vs, H, A; //SALIDAS
			Scanner leer = new Scanner(System.in);
			int val = 0;
			String mensa = "";
			System.out.println("Programa de Tanque de almacenamiento liquido\n");
			System.out.println("Ingrese el estado de las siguientes entradas \n 1 = Encendido\n 0 = Apagado\n");
			System.out.println("Estado de LH");
			val = leer.nextInt();
			LH = Binario(val);
			System.out.println("Estado de LI");
			val = leer.nextInt();
			LI = Binario(val);
			System.out.println("Estado de TH");
			val = leer.nextInt();
			TH = Binario(val);
			System.out.println("Estado de TC");
			val = leer.nextInt();
			TC = Binario(val);
			Ve = ValE(LH, LI, TH, TC);
			Vs = ValS(LH, LI, TH, TC);
			H = H(LH, LI, TH, TC);
			A = A(LH, LI, TH, TC);
			switch (Digito(Ve))
			{
			case 0:
				break;
			case 1:
				mensa += "Rellenar /";
				break;
			}
			switch (Digito(Vs))
			{
			case 0:
				break;
			case 1:
				mensa += "Vaciar /";
				break;
			}
			switch (Digito(H))
			{
			case 0:
				mensa += " Calefaci�n apagada /";
				break;
			case 1:
				mensa += " Calefaci�n encendida /";
				break;
			}
			switch (Digito(A))
			{
			case 0:
				break;
			case 1:
				mensa += " Alarma /";
				break;
			}
			System.out.println(mensa);
		}
		public static Boolean Binario(int bin)
		{
			boolean val = false;
			switch (bin) 
			{
			case 0:
				val = false;
				break;
			case 1:
				val = true;
				break;
			}
			return val;
		}
		public static int Digito(Boolean var)
		{
			int val = 0;
			while (var == true)
			{
				val = 1;
				break;
			}
			while (var == false)
			{
				val = 0;
				break;
			}
			return val;
		}
		public static Boolean ValE(Boolean a, Boolean b, Boolean c, Boolean d)
		{
			boolean val = false;
			if (!a&&(!c||!d))
			{
				val = true;
			}
			else val = false;
			return val;
		}
		public static Boolean ValS(Boolean a, Boolean b, Boolean c, Boolean d)
		{
			boolean val = false;
			if (b&&!c&&!d)
			{
				val = true;
			}
			else val = false;
			return val;
		}
		public static Boolean H(Boolean a, Boolean b, Boolean c, Boolean d)
		{
			boolean val = false;
			if (!c&&(!a||b)&&d)
			{
				val = true;
			}
			else val = false;
			return val;
		}
		public static Boolean A(Boolean a, Boolean b, Boolean c, Boolean d)
		{
			boolean val = false;
			if (c||(a&&!b) == true)
			{
				val = true;
			}
			else val = false;
			return val;
		}
	}
