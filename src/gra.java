import java.util.Random;
import java.util.Scanner;

    public class main{
        public static void main(String[]args){
            Random random = new Random();
            int  numberToGuess = random.nextInt(100);
            Scanner scanner= new Scanner (System.in);

            boolean wasNumberGuesed = false;

            while (!wasNumberGuesed){
                System.out.println( "Podaj liczbe");
                int userNumber = scanner.nextInt();

                if (userNumber < numberToGuess){
                    System.out.println("liczba za mala");
                } else if (userNumber > numberToGuess) {
                    System.out.println("Liczba za duza");

                }else{
                    System.out.println("Bingo");
                    wasNumberGuesed = true;

                }
            }
        }
    }


