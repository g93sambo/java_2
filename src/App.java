import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WHAT IS YOUR NAME");
        String name = scanner.nextLine();
        System.out.println("WHAT IS YOUR age");
        int age = scanner.nextInt();
        
        System.out.println("your name is " + name);
        System.out.println("you are" + age + "years old");
    
    }
}
