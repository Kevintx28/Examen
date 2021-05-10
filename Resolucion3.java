import java.util.Scanner;
class Resolucion3{
static Scanner input=new Scanner (System.in);
public static void main (String []args){

int sexo;
int edades;

System.out.println("Si es hombre (1), Si es mujer (2)");
sexo=input.nextInt();//tengo resultados 1-2

if (sexo >  0  && sexo <3) {//validando si eres o no eres
   System.out.println("¿cuantos años tiene?");
  edades=input.nextInt(); //tengo resultados 1-100

  if (edades > 0 && edades < 16){
  System.out.println("su vacuna es de tipo A");
  }

  if ( edades > 15 && edades < 70 ){

      if (sexo == 1){
      System.out.println("su vacuna es de tipo A");
      }

      if (sexo == 2){
        System.out.println("su vacuna es de tipo B");
      }

  }
  if (edades >70){//¿? 
  System.out.println("su vacuna es de tipo C");
  }

} else {
  System.out.println("opcion no encontrado");
}
}
}