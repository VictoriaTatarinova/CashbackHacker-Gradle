package ru.netology.service;

import org.junit.jupiter.api.Assertions;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.jupiter.api.Test
    public void ShouldBuy100() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

    @org.junit.jupiter.api.Test
    public void ShouldBuy10() {
        int amount = 990;
        int expected = 10;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

    @org.junit.jupiter.api.Test
    public void ShouldNotBuy1000() {
        int amount = 1_000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void ShouldNotBuy5000() {
        int amount = 5_000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void ShouldBuyForMoreBonus() {
        int amount = 2_500;
        int expected = 500;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

    @org.junit.jupiter.api.Test
    public void ShouldBuyZero() {
        int amount = 0;
        int expected = 1_000;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

    @org.junit.Test
    public void Junit4ShouldBuy100() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

    @org.junit.Test
    public void Junit4ShouldBuy10() {
        int amount = 990;
        int expected = 10;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

    @org.junit.Test
    public void Junit4ShouldNotBuy1000() {
        int amount = 1_000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void Junit4ShouldNotBuy5000() {
        int amount = 5_000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void Junit4ShouldBuyForMoreBonus() {
        int amount = 2_500;
        int expected = 500;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

    @org.junit.Test
    public void Junit4ShouldBuyZero() {
        int amount = 0;
        int expected = 1_000;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

}