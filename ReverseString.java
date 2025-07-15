import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String:");
        String s=sc.nextLine();

        char[] ch=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        
        while(start<end){
            char c=ch[start];
            ch[start]=ch[end];
            ch[end]=c;
            start++;
            end--;
        }

        s=new String(ch);
        System.out.println("Reversed String:");
        System.out.println(s);
    }
}