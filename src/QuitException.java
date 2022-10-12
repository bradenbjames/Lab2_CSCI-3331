public class QuitException extends CalculatorException {
    QuitException(String s) throws QuitException {
        throw new QuitException(s);
    }
}
