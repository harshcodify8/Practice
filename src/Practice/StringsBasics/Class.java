package Practice.StringsBasics;
public class Class {

    public static void main(String[] args) {
        String fi = "";
        String s = "Harsh";
        for(int i = s.length()-1 ; i>=0 ; i--){
            fi = fi+s.charAt(i);
        }
        System.out.println(fi);
    }
}
