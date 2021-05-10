import java.util.Scanner;
class Resolucion3{
static Scanner input=new Scanner (System.in);
public static void main (String []args){

int sexo;
int edades;

float vacuna_A;
float vacuna_B;
float vacuna_C;

System.out.println("Si es hombre (1), Si es mujer (2)");
sexo=input.nextInt();//tengo resultados 1-2

System.out.println("¿cuantos años tiene?");
edades=input.nextInt(); //tengo resultados 1-100

if (edades > 0 && edades < 17){
vacuna_A=edades;
System.out.println("su vacuna es de tipo A");
}

if (edades >16 && edades < 70){
vacuna_B=sexo+edades;
System.out.println("su vacuna es de tipo B");
}

if (edades >70){
vacuna_C=edades+sexo;
System.out.println("su vacuna es de tipo C");
}














}
}








