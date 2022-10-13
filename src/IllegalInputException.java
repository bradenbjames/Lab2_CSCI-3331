public class IllegalInputException extends CalculatorException {
    public String illegalType;

    IllegalInputException(String type) throws CalculatorException {
        super(type);
        this.illegalType = type;
    }

    public String getIllegalType() {
        return this.illegalType;
    }
}
