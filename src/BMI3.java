import java.util.Scanner;

public class BMI3 {
    public static void main(String[] args){

    Scanner mainScanner = new Scanner(System.in);

    System.out.println(" Insert weight as kilogram");
    float weight = mainScanner.nextFloat();

    System.out.println("Insert height as scale");
    int height = mainScanner.nextInt();


    whatTheBMI(weight,height);
}



    public static void whatTheBMI (float weight, int height){
        float temporaryHeight1 = (float) height;
        float temporaryHeight = temporaryHeight1 / 100;
        temporaryHeight = temporaryHeight * temporaryHeight;
        float yourBMI = weight / (temporaryHeight * temporaryHeight);

        System.out.println(yourBMI);
    }
}
