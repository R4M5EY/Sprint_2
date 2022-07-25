package service;

import model.Food;

public class ShoppingCart {
    Food[] foodList;
    public ShoppingCart(Food[] foodList) {
        this.foodList = foodList;
    }

    public double getTotalSumNoDiscount() {

        double totalSumNoDiscount = 0;

        for (int i = 0; i < foodList.length; i++) {
            totalSumNoDiscount += (foodList[i].getAmount() * foodList[i].getPrice());
        }
        return totalSumNoDiscount;
    }

    public double getTotalSumOfDiscount() {

        double totalSumOfDiscount = 0;

        for (int i = 0; i < foodList.length; i++) {
            totalSumOfDiscount += (foodList[i].getAmount() * foodList[i].getPrice()) * foodList[i].getDiscount() / 100;
        }

        return totalSumOfDiscount;
    }

    public double getTotalSumVegNoDiscount() {
        double totalSumVegNoDiscount = 0;

        for (int i = 0; i < foodList.length; i++) {
            if (foodList[i].isVegetarian()) {
                totalSumVegNoDiscount += (foodList[i].getAmount() * foodList[i].getPrice());
            }
        }

        return totalSumVegNoDiscount;
    }
    
}
