import  java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static int [] doldur(int sayi){
        Scanner scan= new Scanner(System.in);
        int[] cikti =new int[sayi];

        System.out.println("Dizmet istediğiniz sayıları giriniz: ");
        for (int i=0; i<sayi; i++){
            cikti[i]=scan.nextInt();
        }
        return cikti;
    }

    public static void bastir(int [] array ){
        for (int i=0; i<array.length; i++){
            System.out.println("Element "+(i+1)+":"+array[i]);
        }
    }

    public static void sort (int [] array){
        Arrays.sort(array);
        bastir(array);
    }

    public static void main(String[] args) {
        int [] a= doldur(5);
        sort(a);
    }
}
