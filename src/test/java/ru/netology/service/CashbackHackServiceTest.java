package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void testRemainHightBorder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void testRemainLowBorder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void testRemainOverBorder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void testRemainBigAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700025;
        int actual = service.remain(amount);
        int expected = 975;
        assertEquals(actual,expected);
    }
}
