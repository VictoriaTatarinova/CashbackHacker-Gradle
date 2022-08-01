package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void ShouldBuy100() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

    @Test
    public void ShouldBuy10() {
        int amount = 990;
        int expected = 10;
        int actual = service.remain(amount);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

    @Test
    public void ShouldNotBuy1000() {
        int amount = 1_000;
        int expected = 0;
        int actual = service.remain(amount);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

    @Test
    public void ShouldNotBuy5000() {
        int amount = 5_000;
        int expected = 0;
        int actual = service.remain(amount);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

    @Test
    public void ShouldBuyForMoreBonus() {
        int amount = 2_500;
        int expected = 500;
        int actual = service.remain(amount);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

    @Test
    public void ShouldBuyZero() {
        int amount = 0;
        int expected = 1_000;
        int actual = service.remain(amount);
        System.out.println("Для получения бонуса Вам нужно докупить на сумму " + expected + " рублей");
    }

}