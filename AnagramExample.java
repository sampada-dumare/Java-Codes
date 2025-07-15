import java.util.Arrays;
import java.util.Scanner;

public class AnagramExample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 2 strings:");
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        s1.replaceAll(" ","");
        s2.replaceAll(" ","");

        if(s1.length()==s2.length()){
            s1=s1.toLowerCase();
            s2=s2.toLowerCase();

            char[] ch1=s1.toCharArray();
            char[] ch2=s1.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean f=Arrays.equals(ch1,ch2);

            if (f){
                System.out.println("Anagram");
            }else{
                System.out.println("Not Anagram");
            }
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}