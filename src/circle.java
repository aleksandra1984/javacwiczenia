public class circle {
    public static void main(String[] args) {
float diameter=3;

        printCircumferencve(diameter);


        float c = caclulateCircumference( diameter );
        System.out.println(c);
    }
    public static void printCircumferencve(float diameter){

    }

    private static float caclulateCircumference(float diameter) {
        float c = diameter * 3.14f;
        return c;
    }
}