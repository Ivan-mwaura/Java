import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* String name = new String("Evans Gachanja");
        System.out.println(name);

        String word1 = "a b c";
        String word2 = "abc";


        System.out.println(word1.equals(word2));
        System.out.println(word1.contains("b"));

        String objectString = new String(" Abc") ;
        String objectString2 = new String(" abc") ;

        System.out.println(objectString.equalsIgnoreCase(objectString2));
        System.out.println(objectString2.replace("abc", "xyz"));

        String names = "Evans Gachanja";
        int years = 23;
        String school = "jkuat";
        char grade = 'A';

        String trial = String.format("Hello , My name is %s. I am %d years. I graduated with a grade %c form %s university. ", names, years, grade, school);
        System.out.println(trial.length());
        System.out.println(trial.isEmpty());
        System.out.println(trial.toUpperCase());*/

        //inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your Name ? : ");
        String name = scanner.nextLine();

        System.out.print("What is your age ? : ");
        int age = Integer.parseInt(scanner.nextLine());
        //double learn = double.parse(scanner.nextDouble());
        /*int age = scanner.nextInt();
        scanner.nextLine();//cleans the input buffer*/

        System.out.print("What is your grade ? : ");
        String grade = scanner.nextLine();


        System.out.println(String.format("Your name is :  %s", name));
        System.out.printf("Your name is :  %s . Your age is %d years old, You got a  %s ", name,age, grade.toUpperCase());

    }
}