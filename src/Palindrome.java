import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word/Sentence/Number to check for Palindrome: ");
        String string = sc.nextLine();



        string =  string.toLowerCase();
        boolean flag = true;

        for(int i =0; i <  string.length()/2; i++){
            if(string.charAt(i) != string.charAt(string.length()-i-1)) {
                
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("Given string is palindrome");
        else
            System.out.println("Given string is not palindrome");

    }
}