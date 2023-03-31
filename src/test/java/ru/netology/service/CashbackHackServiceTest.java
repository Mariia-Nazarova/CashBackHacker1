package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        org.junit.Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testRemainHightBorder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        org.junit.Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testRemainLowBorder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        org.junit.Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testRemainOverBorder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        org.junit.Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void testRemainBigAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700025;
        int actual = service.remain(amount);
        int expected = 975;
        org.junit.Assert.assertEquals(expected,actual);
    }
}
