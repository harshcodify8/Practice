package Practice.Practice3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Class {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {

        FastReader s=new FastReader();
        String fin = "";
        String w = s.nextLine().toLowerCase();
        for(int i=0 ; i <w.length();i++){
            if(w.charAt(i)!='A'||w.charAt(i)!='E'||w.charAt(i)!='I'||w.charAt(i)!='O'||w.charAt(i)!='U'||w.charAt(i)!='a'||w.charAt(i)!='e'||w.charAt(i)!='i'||w.charAt(i)!='o'||w.charAt(i)!='u'){
                fin = fin+w.charAt(i);
            } else {
                fin = fin+".";
            }
        }
    }
}
