import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
    public static int gcd(int n, int m){
        int gcd;
        if(n < m){
            int temp = 0;
            temp = n;
            n = m;
            m = temp;
        }

        if(n % m == 0) {
            gcd = m;
        }else{
             gcd = gcd(m,n%m);
        }
           
        

        return gcd; 
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
       

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        System.out.print(gcd(n,m));


    }
}