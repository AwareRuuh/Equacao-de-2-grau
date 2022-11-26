import java.util.Scanner;

class Main {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  double a;
	double b;
	double c;
	double delta;
	double x1; 
	double x2; 

	System.out.println("Insira o valor de A: ");
	a = sc.nextDouble();
	System.out.println("Insira o valor de B: ");
	b = sc.nextDouble();
	System.out.println("Insira o valor de C: ");
	c = sc.nextDouble();

	delta = ((b*b)-(4*a*c));
	x1 = 0;
	x2 = 0;

	if (delta > 0){ 
		x1 = (-b + Math.sqrt (delta)) / ( 2*a );
		x2 = (-b - Math.sqrt (delta)) / ( 2*a ) ;

		System.out.println("Delta vale :"+ delta); 
		System.out.println("\nx1 vale: "+ x1 + "\n x2 vale: "+ x2); 
	} 
	if (delta == 0){ 
		 x1 = -b / (2*a);
    System.out.println("a raíz é: "+x1);
	} 
  if (delta < 0){
    System.out.println(delta);
  }
 } 
}