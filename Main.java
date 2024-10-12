// завдання 1 - варіант 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введіть три сторони трикутника:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b && b == c) {
                System.out.println("це рівносторонній трикутник");
            } else if (a == b || b == c || a == c) {
                System.out.println("це рівнобедрений трикутник");
            } else {
                System.out.println("це різносторонній трикутник");
            }
        } else {
            System.out.println("трикутник з такими сторонами не існує");
        }
        
        scanner.close();
    }
}

// завдання 2 - варіант 4 (while)
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        
        System.out.println("вгадайте число від 1 до 100:");
        
        guess = scanner.nextInt();
        while (guess != randomNumber) {
            attempts++;
            if (guess < randomNumber) {
                System.out.println("ваше число менше. спробуйте ще раз:");
            } else {
                System.out.println("ваше число більше. спробуйте ще раз:");
            }
            guess = scanner.nextInt();
        }
        
        System.out.println("ви вгадали число за " + (attempts + 1) + " спроб.");
        scanner.close();
    }
}
// завдання 2 - варіант 4 (do-while)
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        
        System.out.println("вгадайте число від 1 до 100:");
        
        do {
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < randomNumber) {
                System.out.println("ваше число менше. спробуйте ще раз:");
            } else if (guess > randomNumber) {
                System.out.println("ваше число більше. спробуйте ще раз:");
            }
        } while (guess != randomNumber);
        
        System.out.println("ви вгадали число за " + attempts + " спроб.");
        scanner.close();
    }
}
// завдання 3 - варіант 4
public class Main {
    public static void main(String[] args) {
        int size = 10;
        
        System.out.print("   |");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        
        System.out.print("---+");
        for (int i = 1; i <= size; i++) {
            System.out.print("----");
        }
        System.out.println();
        
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
