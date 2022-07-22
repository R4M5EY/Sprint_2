package model;

import static model.constants.Colour.*;
import static model.constants.Discount.discount;
public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }
    @Override
    public double getDiscount() {
        if (colour == red) {
            return discount;
        } else {
            return 0;
        }
    }
}