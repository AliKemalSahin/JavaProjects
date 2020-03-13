
public class InvalidAgeException extends ArithmeticException{

    public InvalidAgeException(String s) {
        super(s);
    }

    
    @Override
    public void printStackTrace() {
        System.out.println("Bu bir invalid age hatasıdır.");
    }
    
    
    
}
