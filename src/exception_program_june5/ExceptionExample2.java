package exception_program_june5;

public class ExceptionExample2 {
    public static void main(String[] args) {
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred.");
        } finally {
            System.out.println("End of program.");
        }
    }
}
