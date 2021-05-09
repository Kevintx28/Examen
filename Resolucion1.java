import java.util.Scanner;
class Resolucion1 {
static Scanner input=new Scanner(System.in);
public static void main(String[] args){//método Principal

int nota1;
int nota2;
int nota3;
int nota4;

float puntaje1;
float puntaje2;
float puntaje3;
float puntaje4;


System.out.println("nota de su primera evaluacion");
nota1=input.nextInt();

System.out.println("nota de su segunda evaluacion");
nota2=input.nextInt();

System.out.println("nota de su tercera evaluacion");
nota3=input.nextInt();

System.out.println("nota de su cuarta"+""+"evaluacion");
nota4=input.nextInt();

<<<<<<< HEAD
puntaje1=(20/100)*nota1;
=======
puntaje1=(20f/100f)*nota1;
>>>>>>> a7c378a87b6a51487264f4176f091facf057053d
System.out.println(puntaje1);

puntaje2=(15f/100f)*nota2;
System.out.println(puntaje2);

puntaje3=(15f/100f)*nota3;
System.out.println(puntaje3);

puntaje4=(50f/100f)*nota4;
System.out.println(puntaje4);

System.out.println("su nota final es:"+(puntaje1+puntaje2+puntaje3+puntaje4));
}


}