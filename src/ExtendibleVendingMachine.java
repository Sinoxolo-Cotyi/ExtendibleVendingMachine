public class ExtendibleVendingMachine {

    private int SoftDrinks;
    private int SaltySnacks;
    private int Chocolates;

    ExtendibleVendingMachine(int softDrinkQty, int saltySnackQty, int chocolateQty) {
        SoftDrinks = softDrinkQty;
        SaltySnacks = saltySnackQty;
        Chocolates = chocolateQty;
    }

    void buy(Product product) {
        if (product instanceof SoftDrink) {
            SoftDrinks--;
        } else if (product instanceof SaltySnack) {
            SaltySnacks--;
        } else if (product instanceof Chocolate) {
            Chocolates--;
        }
    }

    void addStock(Product product) {
        if (product instanceof SoftDrink) {
            SoftDrinks += 3;
        } else if (product instanceof SaltySnack) {
            SaltySnacks += 3;
        } else if (product instanceof Chocolate) {
            Chocolates += 3;
        } else {
            System.out.println("Please select a valid product.");
        }
    }

    int getStock(Product product) {
        if (product instanceof SoftDrink) {
            return SoftDrinks;
        } else if (product instanceof SaltySnack) {
            return SaltySnacks;
        } else if (product instanceof Chocolate) {
            return Chocolates;
        } else {
            return 0;
        }
    }

}
