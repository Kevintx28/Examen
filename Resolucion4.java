import java.util.Scanner;
import org.json.*;
class Resolucion4{
static Scanner input=new Scanner (System.in);
public static void main (String []args){

int suma;
int resta;
int multiplicacion;
int divicion;
double potencia;

char operacion;
int valor1;
int valor2;

System.out.println("Suma=(+),Resta=(-),Multiplicacion=(*);Divicio=(/) y potencia(^)");
operacion=input.next().charAt(0);

System.out.println("ingrese un valor de 2 digitos");
valor1=input.nextInt();
System.out.println("ingrese un valor de 2 digitos");
valor2=input.nextInt();

if (operacion == '+' || operacion== '-'|| operacion == '*' || operacion == '/'|| operacion == '^'){

    if (operacion == '+' ){
    suma=(valor1+valor2);
    System.out.println("su operacion es:"+suma);
    }

    if (operacion == '-' ){
    resta=(valor1-valor2);
    System.out.println("su operacion es:"+resta);
    }

    if (operacion == '*' ){
    multiplicacion=(valor1*valor2);
    System.out.println("su operacion es:"+multiplicacion);
    }


    if (operacion == '/' ){
    divicion=(valor1/valor2);
    System.out.println("su operacion es:"+divicion);
    }

    if (operacion == '^' ){
    potencia=Math.pow(valor1,valor2);
    System.out.println("su operacion es:"+potencia);
    }
    
}else {
  System.out.println("opcion no encontrado");
}
}
}