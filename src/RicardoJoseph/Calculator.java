package RicardoJoseph;

public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int calculate(int a, int b) {
        return (int) operation.execute(a,b);
    }
}
