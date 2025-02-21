import java.util.Scanner;

public class Main{
    public static void square(int n){
        int k = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(k == 9){
                    k = 0;
                }
                
                k++;
                System.out.print(k+" ");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        square(n);
    }
}