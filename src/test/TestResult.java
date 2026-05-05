package test;
import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        System.out.println("Кількість щасливих трамвайних квитків (000000-999999): " + Exercise.calculate());
    }
}
