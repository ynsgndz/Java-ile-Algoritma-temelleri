import java.util.Scanner;
import  java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
            Scanner scan=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
            int i = scan.nextInt();

        System.out.println(Arrays.toString(list));
        System.out.println("Girilen sayı : "+i);
        Arrays.sort(list);
                int min=0;
                int max=0;
            for (int k:list){
                if (k<=i){
                   min=k;
                }
                if (k>=i){
                    max=k;
                    break;

                }
            }
        System.out.println(min);
        System.out.println(max);
    }
}
    