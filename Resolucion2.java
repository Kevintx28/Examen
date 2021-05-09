import java.util.Scanner;
class Resolucion2{
static Scanner input=new Scanner (System.in);
public static void main (String []args){

int salario;
int puntos;

float bono1;
float bono2;
System.out.println("¿cual es el monto del salario?");
salario=input.nextInt();//1000

System.out.println("¿cuantos puntos obtuvo el profesor?");
puntos=input.nextInt();//151
  //si  puntos es mayor que: 49  YY puntos es menor que: 101 ENTONCES
if (puntos > 49  &&  puntos < 101){
System.out.println( (10f/100f)*salario );
}

if (puntos > 100  &&  puntos < 151){
System.out.println( (40f/100f)*salario );
}

if (puntos > 150){
System.out.println( (70f/100f)*salario );

}




}




}