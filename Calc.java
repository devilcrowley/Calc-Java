import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            String userinput = input.nextLine();
            userinput = userinput.replaceAll("\\s",""); // убираем пробелы
            String[] Operations = userinput.split(""); //делим по знаку ("(?<=\\d)(?=[-+*/])|(?<=[-+*/])(?=\\d)")
            String alpha = Operations[0];
            String ops = Operations[1];
            String beta = Operations[2];
            int a = Integer.parseInt(alpha);
            int b = Integer.parseInt(beta);
            if (a>10 || b>10 || a<0 || b<0) {
                System.out.println("Exception: Работает только с числами от 0 до 10");
                break;
            }
            int output = 0;
            switch (ops) {
                case "+":
                    output = a + b;
                    break;
                case "-":
                    output = a - b;
                    break;
                case "*":
                    output = a * b;
                    break;
                case "/":
                    output = a / b;
                    break;
            }
            System.out.println(output);

        }
    }
}


