package Practice.Practice6;
import java.util.Scanner;
import java.util.*;

public class Class {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine().toLowerCase();
        String input2 = sc.nextLine().toLowerCase();

        //input1.toLowerCase();
        //input2.toLowerCase();
        // dekh buffer loop append m use krdena cuzz ye new object banega heap m barr barr barrr infinity.
       // System.out.println(input1+input2);

        if(input1.compareTo(input2)==0){
            System.out.println("0");
        }

        if(input1.compareTo(input2)>0){
            System.out.println("1");
        }

        if(input1.compareTo(input2)<0){
            System.out.println("-1");
        }
    }
}
