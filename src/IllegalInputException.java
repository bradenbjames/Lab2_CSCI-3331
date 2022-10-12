public class IllegalInputException extends CalculatorException {
    public String illegalType;

    IllegalInputException(String type) throws IllegalInputException {
        this.illegalType = type;
    }

    public String getIllegalType() {
        return this.illegalType;
    }
}
