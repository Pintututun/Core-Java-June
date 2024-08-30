package string_program_june27;

public class LargeFontExample {
    public static void main(String[] args) throws InterruptedException {
        String text = "I Love U";
        getLargeText(text);
        
    }
    
    private static void getLargeText(String text) throws InterruptedException{
       // StringBuilder largeText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c != ' ') {
                c += 0xfee0; // Add offset to get full-width character
            }
           
            System.out.print(c);
            Thread.sleep(1000);
        }
       
    }
}






