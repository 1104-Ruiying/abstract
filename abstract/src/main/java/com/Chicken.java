package com;

public abstract class Chicken {

     public abstract double  getPrice();

    public String getType() {
        return getClass().getSimpleName();
    }

    public void getCount(int money) {
        int num = (int) (money / getPrice());
        System.out.format("%d元可以买%s %d只\n", money, getType(), num);
    }


}

