import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;


public class Main{
    public static int gcd(int n, int m) {
        int gcd;
        if(n < m){
            int temp = 0;
            temp = n;
            n = m;
            m = temp;
        }

        if(n%m == 0){
            gcd = m;
        } else{
            gcd = gcd(m,n%m);
        }
        return gcd;
    }

    public static int lcm(int n, int m){
        return n*m/gcd(n,m);
    }


    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.print(lcm(n,m));
    }
}