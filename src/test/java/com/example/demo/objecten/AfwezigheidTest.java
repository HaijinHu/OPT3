package com.example.demo.objecten;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AfwezigheidTest {
    @Test
    public void testnotnull() {
        String date = ("12-20-2003");
        String loginmessage = Afwezigheid.PlanAF(date);
        Assert.assertEquals("Uw blokkerdag is ingepland.", loginmessage);
    }

    @Test
    public void testnull() {
        String date = ("null");
        String loginmessage = Afwezigheid.PlanAF(date);
        Assert.assertEquals("U moet alles invullen.", loginmessage);
    }
}