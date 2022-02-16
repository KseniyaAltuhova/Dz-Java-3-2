public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float result = service.calculate(163, 50);
        System.out.println("Индекс массы тела: " + result);
    }
}
