public class Main {
    public static void main(String[] args) {
        bonusMilesService service = new bonusMilesService();
        int price = 20_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}