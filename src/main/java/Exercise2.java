import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("What is the input string");
        Scanner UserInput = new Scanner(System.in);
        String Input = UserInput.nextLine();
            while (Input.equals("")) {
                String x = UserInput.nextLine();
                if (x.equals("")){
                    System.out.println("A string must be entered, Try again");
                }else {
                    int Length = x.length();
                    System.out.println(x + " has " + Length + " Characters.");
                    return;
                }
            }
            int Length = Input.length();
            System.out.println(Input + " has " + Length + " Characters.");
        }
    }
