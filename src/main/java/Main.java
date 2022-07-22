import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.*;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, red);
        Apple greenApple = new Apple(8, 60, green);

        Food[] foodList = {meat, redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(foodList);

        System.out.println("Общая сумма товаров в корзине без скидки: " + cart.getTotalSumNoDiscount());
        System.out.println("Общая сумма скидки: " + cart.getTotalSumOfDiscount());
        System.out.println("Общая сумма всех вегетарианских продуктов в корзине без скидки: " + cart.getTotalSumVegNoDiscount());
    }
}
