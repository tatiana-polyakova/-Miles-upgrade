public class BonusMilesService {
    public long calculate (int price) {
        int coefficient = 20;
        long miles = price / coefficient;
        return miles;
    }
}
