import java.util.Scanner;
class Calculator{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double sum = 0,sub = 0,mul = 0,div=0;
		sum = a+b;
		if(a>=b){
			sub = a-b;
		}else{
			sub = b-a;
		}
		mul = a*b;
		if(a == 0 || b == 0){
			System.out.println("Can't divid the values");
		}else{
			div = a/b;
		}
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
    }
}
