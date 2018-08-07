import java.util.Scanner;

public class AppTest {

    public static void main(String[] args) {

//  poszło do Menu...
        Menu[] options = Menu.values();
//        for (Menu option : options) {
//            System.out.print(option.ordinal() + 1 + "-" + option.getOptionDescr() + ", ");
//        }
//        System.out.println();


        Scanner scanner = new Scanner(System.in);

        Menu option = Menu.EXIT; //obojętnie ???
        int optionNr = 0;
        do {
            System.out.println("Co chciałbyś zrobić?");

            Menu.printMenu();

            int tmp = scanner.nextInt();
            while (tmp < 1 || tmp > 6){
                System.out.println("Podałeś nieprawidłową opcję, spróbuj jeszcze raz:");
                tmp = scanner.nextInt();
            }

            option = options[tmp-1];

            switch (option) {
                case INCOME:
                    System.out.println("Podaj kwotę przychodu...");
                    System.out.println("itd...");
                    break;
                case OUTGO:
                    System.out.println("Podaj kwotę wydatku");
                    System.out.println("itd...");
                    break;
                case STATS:
                    System.out.println("Jakie dane chciałbyś wyświetlić?");
                    System.out.println("itd...");
                    break;
                case LOAD:
                    System.out.println("Podaj nazwę pliku do odczytu");
                    System.out.println("itd...");
                    break;
                case SAVE:
                    System.out.println("Gdzie zapisać?");
                    System.out.println("itd...");
                    break;
                case EXIT:
                    System.out.println("pa pa...");
            }
            System.out.println();
        } while (option != Menu.EXIT);


    }


}
