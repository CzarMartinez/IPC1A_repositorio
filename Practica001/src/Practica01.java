import java.util.Scanner;
public class Practica01 {
	public static void main(String[]args){
		int a;
		Scanner tecla = new Scanner(System.in);
		do	{
			System.out.println("1. ROMBO");
			System.out.println("2. PUNTUACION");
			System.out.println("3. -CONVERTIR FORMATO DE HORA");
			System.out.println("4. CUADRADO, CIRCULO Y TRIANGULO");
			System.out.println("5. CALCULAR DIAS ENTRE FECHAS");
			System.out.println("6. CALCULADORA SIMPLE");
			System.out.println("7. TABLA DE MULTIPLICAR");
			System.out.println("8. NUMERO ALEATORIO");
			System.out.println("9. IMPRIMIR NUMERO ROMANO");
			System.out.println("10. PIRAMIDE INVERTIDA DE NUMEROS");
			System.out.println("11. -LISTA DE NUMEROS ROMANOS");
			System.out.println("12. -LETRAS CON ASTERISCOS");
			System.out.println("13. -ADIVINAR LETRA");
			System.out.println("14. PERIMETRO DE UN CUADRADO DE N LADOS");
			System.out.println("15. CANTIDAD DE NÚMEROS PRIMOS ENTRE 1 Y N");
			System.out.println("16. SALIR");
		a = tecla.nextInt();
		if(a==1){
			 char xx = ' '; 
	    	    for (int r= 1; r<=5; r++){ 
	           for (int x = 5 - r; x >0; x--)       
	                System.out.print(xx); 
	                 for (int l = 1; l < 2 * r; l++) 
	                  System.out.print("*"); 
	                    System.out.println(""); 
	        } 
	        for (int s= 4; s>=1; s--){ 
	           for (int y = 5 - s; y >0; y--)       
	                System.out.print(xx); 
	                 for (int ll = 1; ll < 2 * s; ll++) 
	                   System.out.print("*"); 
	                    System.out.println(""); 
	        } 
	    } 
		else if(a==2){
			float nota1 = 0;
			float nota2 = 0;
			float nota3 = 0;
			float nota4 = 0;
			float nota5 = 0;
			float nota6 = 0;
			float notaf = 0;
			System.out.println("Ingrese seis Notas");
			Scanner tecl = new Scanner(System.in);
			nota1 = tecl.nextInt();
			nota2 = tecl.nextInt();
			nota3 = tecl.nextInt();
			nota4 = tecl.nextInt();
			nota5 = tecl.nextInt();
			nota6 = tecl.nextInt();
			
			if(nota1>=0 & nota1<=100){
				if(nota2>=0 & nota2<=100){
					if(nota3>=0 & nota3<=100){
						if(nota4>=0 & nota4<=100){
							if(nota5>=0 & nota5<=100){
								if(nota6>=0 & nota6<=100){
									notaf=((nota1+nota2+nota3+nota4+nota5+nota6)/6);
									if(notaf>=90 & notaf<=100){
											System.out.println("Puntuación A "+ notaf);
									}else if(notaf>=80 & notaf<=89){
										System.out.println("Puntuación B "+ notaf);
									}else if(notaf>=70 & notaf<=79){
										System.out.println("Puntuación C "+ notaf);
									}else if(notaf>=60 & notaf<=69){
										System.out.println("Puntuación D "+ notaf);
									}else if(notaf>=0 & notaf<=59){
										System.out.println("Puntuación E "+ notaf);
									}
									
								}else{System.out.println("Nota 6 fuera de rango");}
								
							}else{System.out.println("Nota 5 fuera de rango");}
							
						}else{System.out.println("Nota 4 fuera de rango");}
						
					}else{System.out.println("Nota 3 fuera de rango");}
					
				}else{System.out.println("Nota 2 fuera de rango");}
				
			}else{System.out.println("Nota 1 fuera de rango");}			
		}		 
		else if(a==3){
			System.out.println("PENDIENTE");
		}	   
        else if(a==4){
        	double x = 0;
			double radioc = 0;
			double areac = 0;
			double perimetroc = 0;
			double perimetro = 0;
			double area = 0;
		    String valor;
			double alturat = 0;
			double areat = 0;
			double perimetrot = 0;
			System.out.println("Ingrese c, u ó t");			
			Scanner tec = new Scanner(System.in);			
			valor = tec.next();
			System.out.println(valor);
			switch(valor){
			case "c":{
				System.out.println("Ingrese el valor de x (Diametro)");
				x = tec.nextDouble();
				radioc = (x/2);
				areac = ((3.1416)*(radioc)*(radioc));
				perimetroc =((2)*(3.1416)*(radioc));
				System.out.println("El radio es de:  "+ radioc);
				System.out.println("El Area es de:   "+ areac);
				System.out.println("El Perimetro es: "+ perimetroc);
				break;
			}
			case "u":{
				System.out.println("Ingrese el valor de x (Lado de un Cuadrado)");
				x = tec.nextDouble();
				area = ((x)*(x));
				perimetro =((x)*(4));
				System.out.println("El Area es de:   "+ area);
				System.out.println("El Perimetro es: "+ perimetro);
				break;
			}
			case "t":{
				System.out.println("Ingrese el valor de x (Lado de un Triangulo Equilatero)");
				x = tec.nextDouble();
				areat = (((1.732050808)/(4))*(x)*(x));
				perimetrot =((x)*(3));
				alturat = (Math.sqrt(((x)*(x))-(((x)*(x))/(4))));
				System.out.println("La Altura es de: "+ alturat);
				System.out.println("El Area es de:   "+ areat);
				System.out.println("El Perimetro es: "+ perimetrot);
				break;			
			}
			default:{
				System.out.println("-->Caracter Incorrecto<-- ");
			}
			}
			}
        else if(a==5){
        	int dia1 =0;
        	int mes1 =0;
        	int año1 =0;
        	int dia2= 0;
        	int mes2 =0;
        	int año2 =0;
        	int cantidad =0;
        	Scanner te = new Scanner(System.in);
        	System.out.println("Ingrese datos de la fecha de inicio ");
        	System.out.println("Ingrese Día");        	
			dia1 = te.nextInt();
			System.out.println("Ingrese Mes");        	
			mes1 = te.nextInt();
			System.out.println("Ingrese Año");        	
			año1 = te.nextInt();
			System.out.println("Ingrese datos de la fecha final ");
        	System.out.println("Ingrese Día");        	
			dia2 = te.nextInt();
			System.out.println("Ingrese Mes");        	
			mes2 = te.nextInt();
			System.out.println("Ingrese Año");        	
			año2 = te.nextInt();
			cantidad = (    (((año2-año1)-1)*360) + ((30-dia1)+(12-mes1)*30) +  ((mes2*30)+dia2)  );
			System.out.println("Hay " + cantidad + " dias entre las dos fechas");         	
        }
        else if(a==6){
        	Double num1 ;
        	Double num2 ;
        	String caracter;
        	Scanner t = new Scanner(System.in);
        	System.out.println("Ingrese primer valor");
        	num1 = t.nextDouble();
        	System.out.println("Ingrese segundo valor");
        	num2 = t.nextDouble();
        	System.out.println("Ingrese caracter s, r, m ó d");
        	caracter = t.next();
        	switch(caracter){
        	case "s":{
        		System.out.println("La suma es de: " +(num1+num2));
        		break;
        	}
        	case "r":{
        		System.out.println("La diferencia es de: " +(num1-num2));
        		break;
        	}
        	case "m":{
        		System.out.println("El producto es de: " +(num1*num2));
        		break;
        	}
        	case "d":{
        		System.out.println("El cociente es de: " +(num1/num2));
        		break;
        	}
        	default:{
        		System.out.println("-->Caracter incorrecto<--");
        	}
        	}
        	}
        else if(a==7){
        	int n = 0;
        	Scanner m = new Scanner(System.in);
        	System.out.println("Ingrese número para la tabla");
        	n = m.nextInt(); 
        	if (n>0 & n<10){
        	for (int w = 10; w>0; w--){
        		System.out.println(+ n + " x " + w +" = "+ (w*n));        		
        	}
        	}else{
        		System.out.println("el numero tiene que estar entre 0 y 10 (sin incluirse)");
        	}
        	}
        	
        else if(a==8){
        	int alea =0;
        	int inf = 0;
        	int sup = 0;
        	Scanner al = new Scanner(System.in);
        	System.out.println("Ingrese Limite inferior");
        	inf = al.nextInt();
        	if(inf>=0){
        		System.out.println("Ingrese Limite superior");
            	sup = al.nextInt();
        		if(sup<=100){
        	alea = (int) (Math.random() * (sup-inf)) + inf;
        	if(alea==0){
        		System.out.println("CERO");
        	}else if(alea==1){
        		System.out.println("UNO");
        	}else if(alea==2){
        		System.out.println("DOS");
        	}else if(alea==3){
        		System.out.println("TRES");
        	}else if(alea==4){
        		System.out.println("CUATRO");
        	}else if(alea==5){
        		System.out.println("CINCO");
        	}else if(alea==6){
        		System.out.println("SEIS");
        	}else if(alea==7){
        		System.out.println("SIETE");
        	}else if(alea==8){
        		System.out.println("OCHO");
        	}else if(alea==9){
        		System.out.println("NUEVE");
        	}else if(alea==10){
        		System.out.println("DIEZ");
        	}else if(alea==11){
        		System.out.println("ONCE");
        	}else if(alea==12){
        		System.out.println("DOCE");
        	}else if(alea==13){
        		System.out.println("TRECE");
        	}else if(alea==14){
        		System.out.println("CATORCE");
        	}else if(alea==15){
        		System.out.println("QUINCE");
        	}else if(alea==16){
        		System.out.println("DIECISEIS");
        	}else if(alea==17){
        		System.out.println("DIECISIETE");
        	}else if(alea==18){
        		System.out.println("DIECIOCHO");
        	}else if(alea==19){
        		System.out.println("DIECINUEVE");
        	}else if(alea==20){
        		System.out.println("VEINTE");
        	}else if(alea==21){
        		System.out.println("VEINTIUNO");
        	}else if(alea==22){
        		System.out.println("VEINTIDOS");
        	}else if(alea==23){
        		System.out.println("VEINTITRES");
        	}else if(alea==24){
        		System.out.println("VEINTICUATRO");
        	}else if(alea==25){
        		System.out.println("VEINTICINCO");
        	}else if(alea==26){
        		System.out.println("VEINTISEIS");
        	}else if(alea==27){
        		System.out.println("VEINTISIETE");
        	}else if(alea==28){
        		System.out.println("VEINTIOCHO");
        	}else if(alea==29){
        		System.out.println("VEINTINUEVE");
        	}else if(alea==30){
        		System.out.println("TREINTA");
        	}else if(alea==31){
        		System.out.println("TREINTA Y UNO");
        	}else if(alea==32){
        		System.out.println("TREINTA Y DOS");
        	}else if(alea==33){
        		System.out.println("TREINTA Y TRES");
        	}else if(alea==34){
        		System.out.println("TREINTA Y CUATRO");
        	}else if(alea==35){
        		System.out.println("TREINTA Y CINCO");
        	}else if(alea==36){
        		System.out.println("TREINTA Y SEIS");
        	}else if(alea==37){
        		System.out.println("TREINTA Y SIETE");
        	}else if(alea==38){
        		System.out.println("TREINTA Y OCHO");
        	}else if(alea==39){
        		System.out.println("TREINTA Y NUEVE");
        	}else if(alea==40){
        		System.out.println("CUARENTA");
        	}else if(alea==41){
        		System.out.println("CUARENTA Y UNO");
        	}else if(alea==42){
        		System.out.println("CUARENTA Y DOS");
        	}else if(alea==43){
        		System.out.println("CUARENTA Y TRES");
        	}else if(alea==44){
        		System.out.println("CUARENTA Y CUATRO");
        	}else if(alea==45){
        		System.out.println("CUARENTA Y CINCO");
        	}else if(alea==46){
        		System.out.println("CUARENTA Y SEIS");
        	}else if(alea==47){
        		System.out.println("CUARENTA Y SIETE");
        	}else if(alea==48){
        		System.out.println("CUARENTA Y OCHO");
        	}else if(alea==49){
        		System.out.println("CUARENTA Y NUEVE");
        	}else if(alea==50){
        		System.out.println("CINCUENTA");
        	}else if(alea==51){
        		System.out.println("CINCUENTA Y UNO");
        	}else if(alea==52){
        		System.out.println("CINCUENTA Y DOS");
        	}else if(alea==53){
        		System.out.println("CINCUENTA Y TRES");
        	}else if(alea==54){
        		System.out.println("CINCUENTA Y CUATRO");
        	}else if(alea==55){
        		System.out.println("CINCUENTA Y CINCO");
        	}else if(alea==56){
        		System.out.println("CINCUENTA Y SEIS");
        	}else if(alea==57){
        		System.out.println("CINCUENTA Y SIETE");
        	}else if(alea==58){
        		System.out.println("CINCUENTA Y OCHO");
        	}else if(alea==59){
        		System.out.println("CINCUENTA Y NUEVE");
        	}else if(alea==60){
        		System.out.println("SESENTA");
        	}else if(alea==61){
        		System.out.println("SESENTA Y UNO");
        	}else if(alea==62){
        		System.out.println("SESENTA Y DOS");
        	}else if(alea==63){
        		System.out.println("SESENTA Y TRES");
        	}else if(alea==64){
        		System.out.println("SESENTA Y CUATRO");
        	}else if(alea==65){
        		System.out.println("SESENTA Y CINCO");
        	}else if(alea==66){
        		System.out.println("SESENTA Y SEIS");
        	}else if(alea==67){
        		System.out.println("SESENTA Y SIETE");
        	}else if(alea==68){
        		System.out.println("SESENTA Y OCHO");
        	}else if(alea==69){
        		System.out.println("SESENTA Y NUEVE");
        	}else if(alea==70){
        		System.out.println("SETENTA");
        	}else if(alea==71){
        		System.out.println("SETENTA Y UNO");
        	}else if(alea==72){
        		System.out.println("SETENTA Y DOS");
        	}else if(alea==73){
        		System.out.println("SETENTA Y TRES");
        	}else if(alea==74){
        		System.out.println("SETENTA Y CUATRO");
        	}else if(alea==75){
        		System.out.println("SETENTA Y CINCO");
        	}else if(alea==76){
        		System.out.println("SETENTA Y SEIS");
        	}else if(alea==77){
        		System.out.println("SETENTA Y SIETE");
        	}else if(alea==78){
        		System.out.println("SETENTA Y OCHO");
        	}else if(alea==79){
        		System.out.println("SETENTA Y NUEVE");
        	}else if(alea==80){
        		System.out.println("OCHENTA");
        	}else if(alea==81){
        		System.out.println("OCHENTA Y UNO");
        	}else if(alea==82){
        		System.out.println("OCHENTA Y DOS");
        	}else if(alea==83){
        		System.out.println("OCHENTA Y TRES");
        	}else if(alea==84){
        		System.out.println("OCHENTA Y CUATRO");
        	}else if(alea==85){
        		System.out.println("OCHENTA Y CINCO");
        	}else if(alea==86){
        		System.out.println("OCHENTA Y SEIS");
        	}else if(alea==87){
        		System.out.println("OCHENTA Y SIETE");
        	}else if(alea==88){
        		System.out.println("OCHENTA Y OCHO");
        	}else if(alea==89){
        		System.out.println("OCHENTA Y NUEVE");
        	}else if(alea==90){
        		System.out.println("NOVENTA");
        	}else if(alea==91){
        		System.out.println("NOVENTA Y UNO");
        	}else if(alea==92){
        		System.out.println("NOVENTA Y DOS");
        	}else if(alea==93){
        		System.out.println("NOVENTA Y TRES");
        	}else if(alea==94){
        		System.out.println("NOVENTA Y CUATRO");
        	}else if(alea==95){
        		System.out.println("NOVENTA Y CINCO");
        	}else if(alea==96){
        		System.out.println("NOVENTA Y SEIS");
        	}else if(alea==97){
        		System.out.println("NOVENTA Y SIETE");
        	}else if(alea==98){
        		System.out.println("NOVENTA Y OCHO");
        	}else if(alea==99){
        		System.out.println("NOVENTA Y NUEVE");
        	}else if(alea==100){
        		System.out.println("CIEN");
        	}
        	System.out.println("--> "+alea+" <--");
        	System.out.println(" ");
        		}
        		else{
        			System.out.println("El limite superior no puede ser mayor a 100");
        		}
              	}
        	else{
        		System.out.println("El limite inferior no puede ser menor que cero");
        	}
        	}
        else if(a==9){
        	Scanner sc=new Scanner(System.in);  
            String U[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
            String D[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
            String C[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};  
            System.out.println("Ingresa numero entre 1 y 999");  
            int N = sc.nextInt();  
            int u = N%10;  
            int d = (N/10)%10;  
            int c = N/100;  
            if(N>=100){           
                System.out.println(C[c]+D[d]+U[u]);  
            }else{  
                if(N>=10){  
                    System.out.println(D[d]+U[u]);            
                }else{  
                    System.out.println(U[N]);            
                }            
            }            
          }  
        else if(a==10){
        	 char xx = ' ';
        	 int n=1;
        	 int m=0;
        	 Scanner teclad = new Scanner(System.in);
        	 System.out.println("Ingrese Numero de filas");
        	 m = teclad.nextInt();
        	for (int s= m; s>=1; s--){ 
 	           for (int y = (m+1) - s; y >0; y--)       
 	                System.out.print(xx); 
 	                 for (int ll = 1; ll < 2 * s; ll++)
 	                 {System.out.print(n);}
 	                  System.out.println(); 
 	                 n++;
 	        }
        }
        else if(a==11){
        	System.out.println("PENDIENTE");
        }
        else if(a==12){
        	System.out.println("PENDIENTE");        	
        }
        else if(a==13){
        System.out.println("PENDIENTE");
    		
    	    }
		else if(a==14){			
			Scanner tor=new Scanner(System.in);			
			System.out.print("Teclee el lado del cuadrado ");
			int tam=tor.nextInt();
			for(int col=1; col <= tam; col++)
				System.out.print(" *");
				System.out.println();
			for(int fila=2; fila < tam; fila++){
				System.out.print(" *");
			for(int col=2; col < tam; col++)
				System.out.print("  ");
				System.out.print(" * \n");
			}
			for(int col=1; col <= tam; col++)
				System.out.print(" *");
			System.out.println();
		}
		else if(a==15){			
			Scanner lec=new Scanner(System.in);
			int t= 0;			
			System.out.print("Ingrese limite superior ");			
			t = lec.nextInt();
			System.out.println("1");
			for(int z=1; z<t; z++){
				int c=0;
			for(int r=1; r<=z; r++){
				 if(z%r==0)
				 c++;
			}
			if(c==2)
			System.out.println(z);
			}
		}
		}while(a!=16);
	}	
	}