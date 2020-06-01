import java.util.Scanner;
public class afishim_me_yje_2 {

	public static void main(String[] args) {
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("Jep numrin n per yjet");
		n=input.nextInt();
		char y='*';
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<1;j++) {
		        System.out.print(" ");
			}
			for(int j=1;j<=(n-i+1);j++) {
			    System.out.print(y);
		}
		System.out.println();

	}

 }
}
