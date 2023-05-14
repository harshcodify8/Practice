package Practice.Practice4;// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String sum = "";
        for(int i=0 ; i <w.length();i++){
            char c =w.charAt(i);
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U' && c!='Y' && c!='y'){
                System.out.print("."+Character.toLowerCase(c));
            }
        }
        System.out.println();
    }
}
