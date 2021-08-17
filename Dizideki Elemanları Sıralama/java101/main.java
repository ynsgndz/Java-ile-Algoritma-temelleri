package java101;
import  java.util.Arrays;
import java.util.Scanner;
public class main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int  boyut,eleman;

		System.out.print("Dizinin boyutunu giriniz: ");

		boyut=scan.nextInt();

		int[] dizim=new int[boyut];

		System.out.println("Dizinin elemanlarını giriniz : ");


		for (int i=0;i<boyut;i++){
			while(i<boyut){
				i++;
				System.out.print("Dizinin "+i+".ci elemanı :");
				i--;
				eleman=scan.nextInt();
				dizim[i]=eleman;
				break;
			}
		}
			Arrays.sort(dizim);
		System.out.println(Arrays.toString(dizim));
		
		
		
	}

}
