package Utilities;

public class utils {
    public static boolean verifyTextContains(String actualText, String expText) {
        if (actualText.toLowerCase().contains(expText.toLowerCase())){
            System.out.println("Actual Text From Web Application UI   --> : "+ actualText);
            System.out.println("Expected Text From Web Application UI --> : "+ expText);
            System.out.println("### Verification Contains !!!");
            return true;
        }
        else{
            System.out.println("Actual Text From Web Application UI   --> : "+ actualText);
            System.out.println("Expected Text From Web Application UI --> : "+ expText);
            System.out.println("### Verification DOES NOT Contains !!!");
            return false;
        }

    }
}
