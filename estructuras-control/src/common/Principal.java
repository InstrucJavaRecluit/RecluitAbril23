package common;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		// TODO Auto-generated constructor stub
		/*
		 * if, if else , switch
		 * */
		
		//int x = 10;
		//String m = "Puebla 2023";
		
		//false
//		if(x == 10 && m.contentEquals("puebla 2023")) {
//			System.out.println("Es verdadero");
//		}else {
//			System.out.println("No lo es");
//		}
		
//		//If con OR
//		if (x == 10 || m.equals("puebla 2023") || m.equals(x)) {
//			System.out.println("okk");
//		}else {
//			System.out.println("No lo es");
//		}
		
		//If con NOT
//		if ( ! (x == 10 || m.equals("sadsafsa3") || m.equals(x))  ) {
//			System.out.println("Okk");
//		}else {
//			System.out.println("No lo es");
//		}
		
		/*//Scanner  lector = new Scanner(System.in);
		//System.out.println("Ingresa un mensaje: \n");
		//String xx = lector.nextLine();
		
		//System.out.println("El mensaje es:  "+xx+50);*/
		
		//Realzar un programa que me diga que mes del año equivale al numero ingresado
		//System.out.println("programa que me diga que mes del año equivale al numero ingresado: \n");
		//System.out.println("Ingresa un numero: \n");
		
//		Scanner  lector = new Scanner(System.in);
//		int mes = lector.nextInt();
//				
//		if(mes<1 || mes>5) {
//			System.out.println("Desconocido\n");
//		}else {
//			if(mes==1) {
//				System.out.println("Enero");
//			}else if(mes==2) {
//				System.out.println("Febrero");
//			}else if (mes==3) {
//				System.out.println("Marzo");
//			}else if (mes==4) {
//				System.out.println("Abril");
//			}else if(mes==5) {
//				System.out.println("Mayo");
//			}
//		}
//		Scanner  lector = new Scanner(System.in);
//		//int mes = lector.nextInt();
//		//String m = lector.nextLine();
//		char m = lector.nextLine().charAt(0);
//		
//		switch (m) {
//		
//		case 'A':
//			System.out.println("Enero");
//			break;
//		case 'B':
//			System.out.println("Ferbrero");
//			break;
//		case 'c':
//			System.out.println("Marzo");
//			break;
//		case 'D':
//			System.out.println("Abril");
//			break;
//		case 'E':
//			System.out.println("Mayo");
//			break;
//			
//			default:
//				System.out.println("Valor desconocido");
//		}
		////////////////////////////////
		/*System.out.println("programa que me diga que numero es mayor: \n");
		System.out.println("Ingresa el primer numero: ");
		Scanner  lector = new Scanner(System.in);
		int a = lector.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		
		int b = lector.nextInt();
		
		if(a>b) {
			System.out.println("\nEl primer numero es mayor.");
		}else {
			System.out.println("\nEl segundo numero es mayor.");
		}
		*/
		
		
////////////////////////////////////////////
		
		/*System.out.println("programa que me diga que numero es par: \n");
		System.out.println("Ingresa el  numero: ");
		Scanner  lector = new Scanner(System.in);
		int a = lector.nextInt();
		
			
		if(a % 2 == 0) {
			System.out.println("\nEl  numero es par.");
		}else {
			System.out.println("\nEl  numero es impar.");
		}*/
		
/////////////////////////////////////////
		
		/*System.out.println("programa que me divida 2 numeros: \n");
		System.out.println("Ingresa el primer numero: ");
		Scanner  lector = new Scanner(System.in);
		float a = lector.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		
		float b = lector.nextInt();
		
		if(b==0) {
			System.out.println("\nERROR");
		}else {
			float resultado= a / b;
			System.out.println("\nLa divicion de a / b es = "+resultado);
		}*/
		
/////////////////////////////////////////
		/*
		Scanner  lector = new Scanner(System.in);
		System.out.println("programa que me acepta la solicitud\n");
		
		System.out.println("Ingresa el sexo (M/F): ");
		
		//String sexo = lector.nextLine();
		String sexo = lector.nextLine();
		System.out.println("Ingresa la nota: ");
		
		int nota = lector.nextInt();
		
		
		System.out.println("Ingresa la edad : ");
		
		int edad = lector.nextInt();
		
		
		
		
	
		switch (sexo) {
		
	    case "M":
	    	if(nota==5 && edad==18) {
				System.out.println("\nPOSIBLE");
			}else {
				
				System.out.println("\nNO ACEPTADA");
			}
			break;
		case "F":
			if(nota==5 && edad==18) {
				System.out.println("\nACEPTADA");
			}else {
				
				System.out.println("\nNO ACEPTADA");
			}
			break;
					
			default:
				System.out.println("NO ACEPTADA");
		}*/
		
/////////////////////////////////////////
		/*
		Scanner  lector = new Scanner(System.in);
		System.out.println("programa que me diga Llo de la uva: \n");
		
		System.out.println("Ingrese el tipo de uva que quiere comprar A/B: ");
		String tipo = lector.nextLine();
		
		System.out.println("Ingrese el precio del kilo de uva: ");
		float precio = lector.nextInt();
		
		System.out.println("Ingrese el tamaño de uva que quiere comprar (1/2): ");
		int tama = lector.nextInt();
		
		
		switch (tipo) {
		
	    case "A":
	    	if(tama==1) {
	    		double preciofi = precio + 0.20;
				System.out.println("\nEl precio final es: "+preciofi);
			}else if(tama==2){
				double preciofi = precio + 0.30;
				System.out.println("\nEl precio final es: "+preciofi);
			}
	    	
			break;
		case "B":
			if(tama==1) {
	    		double preciofi = precio - 0.30;
				System.out.println("\nEl precio final es: "+preciofi);
			}else if(tama==2){
				double preciofi = precio - 0.50;
				System.out.println("\nEl precio final es: "+preciofi);
			}
	    	
			break;
					
			default:
				System.out.println("NO ACEPTADA");
		}*/
/////////////////////////////////////////
		/*
		Scanner  lector = new Scanner(System.in);
		System.out.println("programa que me diga cuanto cobrar a alumnos: \n");
		
				
		System.out.println("Ingrese el numero de alumnos: ");
		int alumnos = lector.nextInt();
		
		if(alumnos<30) {
			System.out.println("el costo de la renta del autobús es de 4000 euros\n");
			float precio=4000/alumnos;
			
			System.out.println("El pago a la compañia sera de: "+precio+"  por cada alumno");
		}else {
			if(alumnos>=100) {
				
				//System.out.println("el costo de 70 euros por alumno");
				int preciofi=alumnos*65;
				
				System.out.println("El pago a la compañia sera de: "+preciofi);
				
			}else if(alumnos>=50 && alumnos<=99) {
				
				int preciofi=alumnos*70;
				
				System.out.println("El pago a la compañia sera de: "+preciofi);
			}else if (alumnos>=30 && alumnos<=49) {
				int preciofi=alumnos*95;
				
				System.out.println("El pago a la compañia sera de: "+preciofi);
			}
		}
		*/
		/////////////////////////////////////
		/*
		Scanner  lector = new Scanner(System.in);
		System.out.println("programa que me diga lo del dado: \n");
		
				
		System.out.println("Ingrese el numero de resultado: ");
		int dado = lector.nextInt();
		String num1= "SEIS";
		String num2= "CINCO";
		String num3= "CUATRO";
		String num4= "TRES";
		String num5= "DOS";
		String num6= "UNO";
		if(dado<1 || dado>6) {
			System.out.println("ERROR: numero incorrecto\n");
			
			
		}else {
			if(dado==1) {
												
				System.out.println(num1);
				
			}else if(dado==2) {
				
				System.out.println(num2);
			}else if (dado==3) {
				
				System.out.println(num3);
			}else if (dado==4) {
				
				System.out.println(num4);
			}else if (dado==5) {
				
				System.out.println(num5);
			}else if (dado==6) {
				
				System.out.println(num6);
			}
		}
		*/
		/////////////////////////////////////
		/*
		Scanner  lector = new Scanner(System.in);
		System.out.println("programa que me pida el dia de la semana: \n");
		
				
		System.out.println("Ingrese el dia que quiere: ");
		int dia = lector.nextInt();
		
		if(dia<1 || dia>7) {
			System.out.println("ERROR: numero incorrecto\n");
			
			
		}else {
			if(dia==1) {
												
				System.out.println("LUNES");
				
			}else if(dia==2) {
				
				System.out.println("MARTES");
			}else if (dia==3) {
				
				System.out.println("MIERCOLES");
			}else if (dia==4) {
				
				System.out.println("JUEVES");
			}else if (dia==5) {
				
				System.out.println("VIERNES");
			}else if (dia==6) {
				
				System.out.println("SABADO");
			}
			else if (dia==7) {
				
				System.out.println("DOMINGO");
			}
		}
		*/
	/////////////////////////////////////////////
		/*
		Scanner  lector = new Scanner(System.in);
		System.out.println("programa que me pida el mes: \n");
		
				
		System.out.println("Ingrese el numero de mes: ");
		int mes = lector.nextInt();
		
		if(mes<1 || mes>12) {
			System.out.println("ERROR: numero incorrecto\n");
			
			
		}else {
			if(mes==1) {
												
				System.out.println("ENERO TIENE  31 DIAS");
				
			}else if(mes==2) {
				
				System.out.println("FEBRERO TIENE 28 DIAS");
			}else if (mes==3) {
				
				System.out.println("MARZO TIENE 31 DIAS");
			}else if (mes==4) {
				
				System.out.println("ABRIL TIENE 30 DIAS");
			}else if (mes==5) {
				
				System.out.println("MAYO TIENE 31 DIAS");
			}else if (mes==6) {
				
				System.out.println("JUNIO TIENE 30 DIAS");
			}else if (mes==7) {
				
				System.out.println("JULIO TIENE 31 DIAS");
			
			}else if (mes==8) {
				
				System.out.println("AGOSTO TIENE 31 DIAS");
			}else if (mes==9) {
				
				System.out.println("SEPTIEMBRE TIENE 30 DIAS");
			}else if (mes==10) {
				
				System.out.println("OCTUBRE TIENE 31 DIAS");
			}else if (mes==11) {
				
				System.out.println("NOVIEMBRE TIENE 30 DIAS");
			}else if (mes==12) {
				
				System.out.println("DICIEMBRE TIENE 31 DIAS");
			}
			
		}
		*/
		//////////////////////////////////
		
		Scanner  lector = new Scanner(System.in);
		System.out.println("programa que me MIDA EL IMC: \n");
		
				
		System.out.println("Ingrese su peso en KG: ");
		double peso = lector.nextDouble();
		
		System.out.println("Ingrese su altura en cm: ");
		double altura = lector.nextDouble();
		
		
		double imc = peso/(Math.pow(altura, 2));
       
		if(imc<16) {
			System.out.println("Su IMC es: "+imc);
			System.out.println("Criterio ingreso al hospital.\n");
			

			}else if(imc>16 && imc<=17) {
				System.out.println("Su IMC es: "+imc);							
				System.out.println("INFRAPESO");
				
			}else if(imc>=17 && imc<=18) {
				System.out.println("Su IMC es: "+imc);
				System.out.println("BAJO PESO");
			}else if (imc>=18 && imc<=25) {
				System.out.println("Su IMC es: "+imc);
				System.out.println("PESO NORMAL (SALUDABLE)");
			}else if (imc>=25 && imc<=30) {
				System.out.println("Su IMC es: "+imc);
				System.out.println("SOBREPSO (OBESIDAD GRADO 1)");
			}else if (imc==30 || imc==34.9) {
				System.out.println("Su IMC es: "+imc);
				System.out.println("SOBREPESO  CRONICO (OBESIDAD DE GRADO 2)");
			}else if (imc==35 || imc==39.9) {
				System.out.println("Su IMC es: "+imc);
				System.out.println("OBESIDAD PREMORBIDA (OBESIDAD DE GRADO 3)");
			}else if (imc>=40) {
				System.out.println("Su IMC es: "+imc);
				System.out.println("OBESIDAD MORBIDA (OBESIDAD DE GRADO 4)");
			
			}
			
		}
	////////////////////////////////////
		/*
		Scanner  lector = new Scanner(System.in);
		System.out.println("programa que mande lo de la donacion\n");
		
		System.out.println("Ingrese el monto: ");
		int donacion = lector.nextInt();
		
	
		if(donacion>=10000) {
			int centro = (donacion/100)*30;
			int nino = (donacion/100)*50;
			int invert = donacion-(centro+nino);
			System.out.println("destinara");
			System.out.println("centro de salud: "+centro);
			System.out.println("comedor        : "+nino);
			System.out.println("bolsa          : "+invert);
			
			
		}else {
			if(donacion<10000) {
												
				int centro = (donacion/100)*25;
				int nino = (donacion/100)*60;
				int invert = donacion-(centro+nino);
				System.out.println("destinara");
				System.out.println("centro de salud: "+centro);
				System.out.println("comedor        : "+nino);
				System.out.println("bolsa          : "+invert);
				
			}
		}*/
	}


