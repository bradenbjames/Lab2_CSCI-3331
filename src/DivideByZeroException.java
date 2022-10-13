public class DivideByZeroException extends CalculatorException {

    public DivideByZeroException(String message) throws CalculatorException {
        super(message);
        // TODO Auto-generated constructor stub
    }

    private String illegalType;

    public String getIllegalType() {
        return illegalType;
    }
}
