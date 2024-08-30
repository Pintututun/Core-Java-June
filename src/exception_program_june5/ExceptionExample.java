package exception_program_june5;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred.");
        } finally {
            System.out.println("End of program.");
        }
    }
}
